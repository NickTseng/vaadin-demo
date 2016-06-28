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
        // 新增 最外框 layout (殼)
        def layout = new VerticalLayout()
        setContent(layout)

        // 加入二顆按鈕
        layout.addComponent(new Button("Page1", { e->
            // 導頁至 page 1
            getUI().navigator.navigateTo(Page1.VIEW_NAME)
        }  as Button.ClickListener))
        layout.addComponent(new Button("Page2", { e->
            // 導頁至 page 2
            getUI().navigator.navigateTo(Page2.VIEW_NAME)
        }  as Button.ClickListener))


        // 頁面欲更新的容器
        def content = new VerticalLayout()
        layout.addComponent(content)

        // 導航、路由
        def navigator = new Navigator(this, content)
        navigator.addProvider(viewProvider)

    }
}
