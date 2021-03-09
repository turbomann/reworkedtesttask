package com.haulmont.testtask.repository;

import com.haulmont.testtask.entity.Bank;

import java.util.UUID;

public class BankRepository extends HibernateRepository implements IEntityRepository<Bank> {

    @Override
    public Bank getById(UUID id) {
        getSession();
        return null;
    }

    @Override
    public void save(Bank entity) {

    }


}
