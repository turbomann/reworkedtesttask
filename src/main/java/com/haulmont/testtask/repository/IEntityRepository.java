package com.haulmont.testtask.repository;

import com.haulmont.testtask.entity.AbstractEntity;

import java.util.List;
import java.util.UUID;

public interface IEntityRepository<T extends AbstractEntity>  {

    T findById(long id); //?

    List<T> findAll();

    void update(T dataSet);

    void create(T dataSet);

    void delete(long id);
}
