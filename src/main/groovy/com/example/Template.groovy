package com.example

import com.vaadin.annotations.DesignRoot
import com.vaadin.ui.*
import com.vaadin.ui.declarative.Design

@DesignRoot
class Template extends HorizontalLayout {

    // 宣告 content, 外層的 navigator 會更新容器
    VerticalLayout content

    // 宣告 button, 要自訂 click event
    Button page1Button
    Button page2Button

    Template() {
        // 使用 Desgin Read 讀取 resources 內對應的 html
        Design.read(this)

        page1Button.addClickListener({ e->
            getUI().navigator.navigateTo(Page1.VIEW_NAME)
        } as Button.ClickListener)

        page2Button.addClickListener({ e->
            getUI().navigator.navigateTo(Page2.VIEW_NAME)
        } as Button.ClickListener)

    }
}
