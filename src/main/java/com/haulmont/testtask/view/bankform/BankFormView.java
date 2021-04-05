package com.haulmont.testtask.view.bankform;

import com.haulmont.testtask.MainView;
import com.haulmont.testtask.entity.Bank;
import com.haulmont.testtask.repository.BankRepository;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasStyle;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.grid.GridVariant;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.splitlayout.SplitLayout;
import com.vaadin.flow.data.binder.BeanValidationBinder;
import com.vaadin.flow.data.binder.ValidationException;

import com.vaadin.flow.data.converter.StringToIntegerConverter;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.component.textfield.TextField;

import java.util.Optional;

@Route(value = "bank-form",layout = MainView.class)
@PageTitle("Babk Form")
public class BankFormView extends Div {

    private Grid<Bank> grid = new Grid<>(Bank.class, false);

    private TextField bankName;
    private TextField percentRate;

    private Button cancel = new Button("Cancel");
    private Button save = new Button("Save");

//    private BeanValidationBinder<Bank> binder;
//
//    private Bank bank;
//
//    public BankFormView (BankRepository bankrepository) {
//        addClassName("master-detail-view");
//        // Create UI
//        SplitLayout splitLayout = new SplitLayout();
//        splitLayout.setSizeFull();
//
//        createGridLayout(splitLayout);
//        createEditorLayout(splitLayout);
//
//        add(splitLayout);
//
//        // Configure Grid
//        grid.addColumn("bankName").setAutoWidth(true);
//        grid.addColumn("percentRate").setAutoWidth(true);
////        grid.setDataProvider(new CrudServiceDataProvider<>(bankrepository));
//        grid.addThemeVariants(GridVariant.LUMO_NO_BORDER);
//        grid.setHeightFull();
//
////         when a row is selected or deselected, populate form
//        grid.asSingleSelect().addValueChangeListener(event -> {
//            if (event.getValue() != null) {
//                Optional<Bank> bankFromBackend = bankrepository.get();
//                // when a row is selected but the data is no longer available, refresh grid
//                if (bankFromBackend.isPresent()) {
//                    populateForm(bankFromBackend.get());
//                } else {
//                    refreshGrid();
//                }
//            } else {
//                clearForm();
//            }
//        }
//        );
//
//        // Configure Form
//        binder = new BeanValidationBinder<>(Bank.class);
//
//        // Bind fields. This where you'd define e.g. validation rules
//        binder.forField(percentRate).withConverter(new StringToIntegerConverter("Only numbers are allowed"))
//                .bind("percentRate");
//
//        binder.bindInstanceFields(this);
//
//        cancel.addClickListener(e -> {
//            clearForm();
//            refreshGrid();
//        });
//
//        save.addClickListener(e -> {
//            try {
//                if (this.bank == null) {
//                    this.bank = new Bank();
//                }
//                binder.writeBean(this.bank);
//
//                bankrepository.update(this.bank);
//                clearForm();
//                refreshGrid();
//                Notification.show("Bank details stored.");
//            } catch (ValidationException validationException) {
//                Notification.show("An exception happened while trying to store the bank details.");
//            }
//        });
//
//    }
//
//    private void createEditorLayout(SplitLayout splitLayout) {
//        Div editorLayoutDiv = new Div();
//        editorLayoutDiv.setId("editor-layout");
//
//        Div editorDiv = new Div();
//        editorDiv.setId("editor");
//        editorLayoutDiv.add(editorDiv);
//
//        FormLayout formLayout = new FormLayout();
//        bankName = new TextField("Bank Name");
//        percentRate = new TextField("Percent Rate");
//        Component[] fields = new Component[]{bankName, percentRate};
//
//        for (Component field : fields) {
//            ((HasStyle) field).addClassName("full-width");
//        }
//        formLayout.add(fields);
//        editorDiv.add(formLayout);
//        createButtonLayout(editorLayoutDiv);
//
//        splitLayout.addToSecondary(editorLayoutDiv);
//    }
//
//    private void createButtonLayout(Div editorLayoutDiv) {
//        HorizontalLayout buttonLayout = new HorizontalLayout();
//        buttonLayout.setId("button-layout");
//        buttonLayout.setWidthFull();
//        buttonLayout.setSpacing(true);
//        cancel.addThemeVariants(ButtonVariant.LUMO_TERTIARY);
//        save.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
//        buttonLayout.add(save, cancel);
//        editorLayoutDiv.add(buttonLayout);
//    }
//
//    private void createGridLayout(SplitLayout splitLayout) {
//        Div wrapper = new Div();
//        wrapper.setId("grid-wrapper");
//        wrapper.setWidthFull();
//        splitLayout.addToPrimary(wrapper);
//        wrapper.add(grid);
//    }
//
//    private void refreshGrid() {
//        grid.select(null);
//        grid.getDataProvider().refreshAll();
//    }
//
//    private void clearForm() {
//        populateForm(null);
//    }
//
//    private void populateForm(Bank value) {
//        this.bank = value;
//        binder.readBean(this.bank);
//
//    }
}