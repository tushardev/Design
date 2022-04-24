package com.design.structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class SecurityProxy implements InvocationHandler {

    private Object obj;

    public SecurityProxy(Object obj) {
        this.obj = obj;
    }

    public static Object newInstance(Object obj) {
        return java.lang.reflect.Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj
                .getClass().getInterfaces(), new SecurityProxy(obj));
    }

    @Override
    public Object invoke(Object proxy, Method m, Object[] args) throws Throwable {
        Object result;
        try {
            if(m.getName().contains("post")) {
                throw new IllegalAccessException("Posts are currently not allowed");
            }
            else {
                result = m.invoke(obj, args);
            }
        } catch (InvocationTargetException e) {
            throw e.getTargetException();
        } catch (Exception e) {
            throw new RuntimeException("unexpected invocation exception: "
                    + e.getMessage());
        }
        return result;
    }
}


/**** This is Proxy class wrapping around passed object. The calls to this Object will be intercepted
 * by this Proxy class first and actual method will be invoked.
 * We can add any logic before invoking the actual object methods ***/