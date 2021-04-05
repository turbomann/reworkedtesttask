package com.haulmont.testtask.repository;

import com.haulmont.testtask.entity.Bank;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class BankRepository extends HibernateRepository implements IEntityRepository<Bank> {

    public Bank getById(UUID id) {
        getSession();
        return null;
    }

    public void save(Bank entity) {

    }

    @Override
    public Bank findById(long id) {
        return null;
    }

    @Override
    public List<Bank> findAll() {
        return null;
    }

    public void update(Bank bank) {
    }

    @Override
    public void create(Bank dataSet) {

    }

    @Override
    public void delete(long id) {

    }

    public Optional<Bank> get() {
        return null;
    }
}
