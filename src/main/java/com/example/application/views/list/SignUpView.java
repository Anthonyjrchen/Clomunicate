package com.example.application.views.list;


import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("SignUp")
@Route(value = "signup")
public class SignUpView extends VerticalLayout {

    public SignUpView() {
        setDefaultHorizontalComponentAlignment(Alignment.CENTER);
        setSizeFull();
        H1 header = new H1("Clomunicate");
        header.getElement().getThemeList().add("dark");
        header.setWidthFull();
        add(header);
        initUsernamePasswordFields();
        Button submit = new Button("Create account");
        submit.setWidth("20%");
        add(submit);

    }

    private void initUsernamePasswordFields() {
        HorizontalLayout layer1 = new HorizontalLayout();
        layer1.add(new TextField("Username:"));
        layer1.add(new TextField("Password:"));
        layer1.add(new TextField("Confirm Password:"));
        layer1.add(new TextField("Email:"));
        layer1.add(new DatePicker("Date of Birth"));
        add(layer1);
    }

}
