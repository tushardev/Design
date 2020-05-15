package com.design.creational.factory;

import com.design.creational.factory.BlogPages.AboutPage;
import com.design.creational.factory.BlogPages.CommentPage;
import com.design.creational.factory.BlogPages.ContactPage;
import com.design.creational.factory.BlogPages.PostPage;

public class Blog extends Website {

    @Override
    public void createWebsite() {

        pages.add(new AboutPage());
        pages.add(new CommentPage());
        pages.add(new ContactPage());
        pages.add(new PostPage());

    }
}

/**** We are creating Blog Type Website which has it's own pages */