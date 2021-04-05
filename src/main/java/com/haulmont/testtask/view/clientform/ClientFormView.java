package com.haulmont.testtask.view.clientform;

import com.haulmont.testtask.MainView;
import com.haulmont.testtask.entity.Client;
import com.haulmont.testtask.repository.ClientRepository;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import java.util.List;

@Route(value = "person_view", layout = MainView.class)
@PageTitle("List of person")

public class ClientFormView extends Div {
    private Grid<Client> grid = new Grid<>(Client.class, false);
    private String firstName;
    private String lastName;
    private String middleName;
    private String telephoneNumber;
    private String clientEmail;
    private String clientPassportN;

    private Client client;
    private ClientRepository clientRepository = new ClientRepository();

    public ClientFormView(ClientRepository clientRepository) {
        try {
            ClientRepository session = new ClientRepository();
            grid = new Grid<>();
            grid.addColumn(Client::getFirstName);
            grid.addColumn(Client::getLastName);
            grid.addColumn(Client::getMiddleName);
            grid.addColumn(Client::getClientEmail);
            grid.addColumn(Client::getTelephoneNumber);
            grid.addColumn(Client::getClientPassportN);
            showAll();

        } catch (Exception e) {
        }
    }
        private void showAll () {
            try {
                List<Client> clients = clientRepository.findAll();
            } catch (Exception e) {

            }
        }


    }


