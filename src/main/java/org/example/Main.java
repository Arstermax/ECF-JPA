package org.example;

import org.example.entities.Client;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Main {
    public static void main(String[] args) {

        // Ajout d'une personne
        Client client = new Client();
        client.setName("Alexandre");
        client.setLastname("Penet");
        client.setAge(23);
        session.save(client);
        System.out.println("L'ID de la personne est : " + client.getId());

        // Récupère les données
        Client c = session.load(Client.class, 1L);
        System.out.println(c.getName());
//
//        // Update les données
        c.setName("Alex");
        session.update(c);
//        // récupère les données 2 fois
        Client d = session.load(Client.class, 1L);
        System.out.println(d.getName());




    }
}