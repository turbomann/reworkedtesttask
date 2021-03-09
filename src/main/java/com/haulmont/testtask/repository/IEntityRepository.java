package com.haulmont.testtask.repository;

import com.haulmont.testtask.entity.BaseEntity;

import java.util.UUID;

public interface IEntityRepository<T extends BaseEntity>  {
    //методы с hibertane

    T getById(UUID id);
    void save(T entity);
}
