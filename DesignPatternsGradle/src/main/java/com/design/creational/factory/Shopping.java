package com.design.creational.factory;

import com.design.creational.factory.ShoppingPages.CartPage;
import com.design.creational.factory.ShoppingPages.ItemPage;
import com.design.creational.factory.ShoppingPages.SearchPage;

public class Shopping extends Website {

    @Override
    public void createWebsite() {
        pages.add(new CartPage());
        pages.add(new ItemPage());
        pages.add(new SearchPage());
    }
}
