package com.example.application.views.list;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.charts.model.Navigator;
import com.vaadin.flow.server.VaadinRequest;

public class NavigatorUI extends UI {
    Navigator navigator;
    protected static final String SIGNIN = "signIn";

    @Override
    protected void init(VaadinRequest request) {
        getPage().setTitle("Haihai");

        navigator = new Navigator();
    }
}
