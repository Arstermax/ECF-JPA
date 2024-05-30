package org.example.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.Scanner;

public abstract  class BasesDAO {
    public StandardServiceRegistry registre = new StandardServiceRegistryBuilder().configure().build();
    public SessionFactory sessionFactory = new MetadataSources(registre).buildMetadata().buildSessionFactory();
    public Session session = sessionFactory.openSession();

    public Scanner scanner= new Scanner(System.in);

    public void fin(){
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }
}
