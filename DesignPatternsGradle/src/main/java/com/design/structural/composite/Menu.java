package com.design.structural.composite;

public class Menu extends MenuComponent {

    public Menu(String name, String url) {
        this.name = name;
        this.url = url;
    }

    @Override
    public MenuComponent add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
        return menuComponent;
    }

    @Override
    public MenuComponent remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
        return menuComponent;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(print(this));

        for (MenuComponent component: menuComponents) {
            builder.append(component.toString());
        }
        return builder.toString();
    }
}
