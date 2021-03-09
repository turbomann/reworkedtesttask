package com.haulmont.testtask.repository;

import com.haulmont.testtask.entity.Client;

import java.util.UUID;

public class ClientRepository implements IClientRepository {


    @Override
    public Client getById(UUID id) {
        return null;
    }

    @Override
    public void save(Client entity) {

    }

    @Override
    public double specialClientFunction() {

        return 0;
    }

}
