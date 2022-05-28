package com.example.application.views.list;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import com.vaadin.flow.router.RouterLink;

@PageTitle("Clomincate")
@Route(value = "mainPage")
@RouteAlias(value = "")
public class MainPageView extends VerticalLayout {

    TextField username = new TextField("Username: ");
    TextField password = new TextField("Password: ");
    public MainPageView() {
        setDefaultHorizontalComponentAlignment(Alignment.CENTER);
        setSizeFull();
        addClassName("main-view");
        H1 header = new H1("Clomunicate");
        header.getElement().getThemeList().add("dark");
        header.setWidthFull();
        add(header);

        initUsernamePassword();
    }

    private void initUsernamePassword() {
        HorizontalLayout usernameLayout = new HorizontalLayout();
        usernameLayout.setAlignItems(Alignment.BASELINE);
        Button enter = new Button("Enter");
        RouterLink listLink = new RouterLink("Sign Up", SignUpView.class);
        usernameLayout.add(username, password, enter, listLink);
        add(usernameLayout);
    }

}
