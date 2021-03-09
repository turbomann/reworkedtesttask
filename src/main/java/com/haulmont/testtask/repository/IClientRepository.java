package com.haulmont.testtask.repository;

import com.haulmont.testtask.entity.Client;

public interface IClientRepository extends IEntityRepository<Client> {
    double specialClientFunction();

}
