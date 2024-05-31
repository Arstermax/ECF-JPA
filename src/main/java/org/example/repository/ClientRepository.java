package org.example.repository;

import org.example.entities.Client;

import java.util.Scanner;

public class ClientRepository extends BasesRepository {

    public Client c;

    @Override
    public String add(Client c) {
        this.start();
        session.save(c);
        session.getTransaction().commit();
        return "Votre client :";
    }

    @Override
    public Client read(int idSelected) {
        this.start();
        Client clientSelected = session.load(Client.class, idSelected);
        session.getTransaction().commit();
        return clientSelected;
    }

    @Override
    public String delete(int idSelected) {
        this.start();
        session.delete(this.read(idSelected));
        session.getTransaction().commit();
        return "Votre client n°  " + idSelected + " à bien été supprimer";
    }

    @Override
    public String update(int idSelected) {
        this.start();

        Client clientUpdate = this.read(idSelected);
        System.out.println(clientUpdate.toString());
        System.out.println("""
                Quel propriété souhaitez-vous modifier ?
                1 |- Le Nom
                2 |- L'Age
                3 |- Le Prénom
                """);
        this.choice = this.scanner.nextInt();
        switch (this.choice) {
            case 1:
                System.out.println("Quel nouveau nom souhaitez-vous mettre?");
                clientUpdate.setLastname(scanner.next());
                break;
            case 2:
                System.out.println("Quel âge souhaitez-vous mettre?");
                clientUpdate.setAge(scanner.nextInt());
                break;
            case 3 :
                System.out.println("Quel nouveau prénom souhaitez-vous mettre?");
                clientUpdate.setName(scanner.next());
                break;

        }
        session.update(this.read(idSelected));
        session.getTransaction().commit();
        return "Votre client " + clientUpdate.getId() + "à bien été modifier\n" + this.read(clientUpdate.getId()).toString() ;
    }
}
