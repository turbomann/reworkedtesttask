package com.haulmont.testtask.view.clientform;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.PageTitle;

@Route(value = "person-form")
@PageTitle("Person Form")

public class ClientFormView extends Div {

    private Button cancel = new Button("Back");

    public ClientFormView() {

        addClassName("credit-card-form-view");

        add(createTitle());

        cancel.addClickListener(e -> {
            Notification.show("Not implemented");
        });

    }

    private Component createTitle() {
        return new H3("Credit Card");
    }

}

