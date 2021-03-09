package com.haulmont.testtask.view.about;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@Route(value = "about")
@PageTitle("About")
public class About extends Div {

    private Button cancel = new Button("Back");

    public About() {

        add(createTitle());
        add(cancel);

        cancel.addClickListener(e -> {
            Notification.show("Magic coming soon");
        });

    }

    private Component createTitle() {
        return new H3("Lets talk about wine");
    }

}
