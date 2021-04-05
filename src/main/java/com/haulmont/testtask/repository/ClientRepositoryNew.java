package com.haulmont.testtask.repository;

import com.haulmont.testtask.entity.Client;

import java.util.List;
import java.util.UUID;

public class ClientRepositoryNew implements IClientRepository {
    @Override
    public double specialClientFunction() {

        return 0;
    }

    @Override
    public Client findById(long id) {
        return null;
    }

    @Override
    public List<Client> findAll() {
        return null;
    }

    @Override
    public void update(Client dataSet) {

    }

    @Override
    public void create(Client dataSet) {

    }

    @Override
    public void delete(long id) {

    }
}
