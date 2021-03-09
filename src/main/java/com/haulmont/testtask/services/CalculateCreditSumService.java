package com.haulmont.testtask.services;

import com.haulmont.testtask.entity.Client;
import com.haulmont.testtask.repository.ClientRepository;
import com.haulmont.testtask.repository.ClientRepositoryNew;
import com.haulmont.testtask.repository.IClientRepository;
import com.haulmont.testtask.repository.IEntityRepository;

public class CalculateCreditSumService {
    // создание и работа с репозиториями
    private IClientRepository repository = new ClientRepositoryNew();

    private double calculate(){
     return repository.specialClientFunction();
    }

}
