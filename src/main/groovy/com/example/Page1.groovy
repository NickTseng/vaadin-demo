package com.example

import com.vaadin.navigator.*
import com.vaadin.server.Page
import com.vaadin.spring.annotation.SpringView
import com.vaadin.ui.*

@SpringView(name = Page1.VIEW_NAME)
class Page1  extends VerticalLayout implements View {

    static final String VIEW_NAME = 'Page1'

    Page1() {
        addComponent(new Label("This is Page 1"))
    }

    @Override
    void enter(final ViewChangeListener.ViewChangeEvent event) {
        // web page title
        Page.current.title = 'Page 1'
    }
}
