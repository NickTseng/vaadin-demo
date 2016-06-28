package com.example

import com.vaadin.navigator.*
import com.vaadin.server.Page
import com.vaadin.spring.annotation.SpringView
import com.vaadin.ui.*

@SpringView(name = Page2.VIEW_NAME)
class Page2  extends VerticalLayout implements View {

    static final String VIEW_NAME = 'Page2'

    Page2() {
        this.addComponent(new Label("This is Page 222222222222"))
    }
    @Override
    void enter(final ViewChangeListener.ViewChangeEvent event) {
        // web page title
        Page.current.title = 'Page 2'
    }
}
