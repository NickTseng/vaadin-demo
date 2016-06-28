package com.example

import com.vaadin.annotations.*
import com.vaadin.navigator.Navigator
import com.vaadin.server.VaadinRequest
import com.vaadin.spring.annotation.SpringUI
import com.vaadin.spring.navigator.SpringViewProvider
import com.vaadin.ui.*
import org.springframework.beans.factory.annotation.Autowired

@SpringUI
@Theme("valo")
class RootUI extends UI {

    @Autowired
    private SpringViewProvider viewProvider

    @Override
    protected void init(VaadinRequest request) {
        // 使用 Template Component
        def template = new Template()
        setContent(template)

        // 導航、路由, 替換 template.content
        def navigator = new Navigator(this, template.content)
        navigator.addProvider(viewProvider)
    }
}