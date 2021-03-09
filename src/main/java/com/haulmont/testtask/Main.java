package com.haulmont.testtask;

import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.NavigationEvent;
import com.vaadin.flow.router.Route;

@Route("")
@CssImport("./styles/shared-styles.css")
@CssImport(value = "./styles/vaadin-text-field-styles.css", themeFor = "vaadin-text-field")
public class Main extends VerticalLayout {
    public Main() {

        Button button = new Button("Say hello",
                e -> Notification.show("Hello",5000,
                        Notification.Position.TOP_CENTER));

        button.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        // Use custom CSS classes to apply styling. This is defined in shared-styles.css.
        addClassName("centered-content");

        add(button);
    }

}
