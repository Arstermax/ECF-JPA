package org.example.repository;

import org.example.entities.Client;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.Scanner;

public abstract  class BasesRepository <T> {
    public StandardServiceRegistry registre = new StandardServiceRegistryBuilder().configure().build();
    public SessionFactory sessionFactory = new MetadataSources(registre).buildMetadata().buildSessionFactory();
    public Session session = sessionFactory.openSession();

    public int choice = 0;
    public Scanner scanner = new Scanner(System.in);

    public void start(){
        session.getTransaction().begin();
    }
    public void fin(){
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }

    public abstract T add(Client c);
    public abstract T read(int idSelected);
    public abstract T delete(int idSelected);

    public abstract T update(int idSelected);
}
