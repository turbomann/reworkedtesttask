package com.haulmont.testtask.view.creditoffersform;

import com.haulmont.testtask.MainView;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@Route(value = "credit-list-form", layout = MainView.class)
@PageTitle("Credit List Form")

public class CreditOfferFormView extends Div {

    private Button cancel = new Button("Back");

    public CreditOfferFormView() {

        add(createTitle());
        add(cancel);

        cancel.addClickListener(e -> {
            Notification.show("Magic coming soon");
        });

    }

    private Component createTitle() {
        return new H3("Add a new bank here");
    }

}