package com.example

import com.vaadin.annotations.DesignRoot
import com.vaadin.navigator.*
import com.vaadin.server.Page
import com.vaadin.spring.annotation.SpringView
import com.vaadin.ui.VerticalLayout
import com.vaadin.ui.declarative.Design

@DesignRoot
@SpringView(name = Template.VIEW_NAME)
class Template extends VerticalLayout implements View{
    static final String VIEW_NAME = "";

    Template() {
        Design.read(this)
    }
    @Override
    void enter(final ViewChangeListener.ViewChangeEvent event) {
        Page.current.title = 'Login Pages'
    }
}
