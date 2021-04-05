package com.haulmont.testtask.repository;

import com.haulmont.testtask.entity.Client;
import org.hibernate.Session;

import java.util.List;

public class ClientRepository extends HibernateRepository implements IClientRepository {


    @Override
    public double specialClientFunction() {
        return 0;
    }

    @Override
    public Client findById(long id) {
        Session session = HibernateRepository.getSessionFactory().openSession();
        Client client = session.get(Client.class, id);
        return client;
    }

    @Override
    public List<Client> findAll() {
        Session session = HibernateRepository.getSessionFactory().openSession();
        return session.createCriteria(Client.class).list();
    }

    @Override
    public void update(Client client) {
        Session session = HibernateRepository.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(client);
        session.flush();
        session.close();
    }

    @Override
    public void create(Client client) {
        Session session = HibernateRepository.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(client);
        session.flush();
        session.close();
    }

    @Override
    public void delete(long id) {
        Session session = HibernateRepository.getSessionFactory().openSession();
        Client client = session.get(Client.class, id);
        session.beginTransaction();
        session.delete(client);
        session.flush();
        session.close();
    }

    public void delete(Client client) {
        Session session = HibernateRepository.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(client);
        session.flush();
        session.close();
    }
}
