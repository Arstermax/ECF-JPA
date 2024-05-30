package org.example.DAO;

import com.mysql.cj.xdevapi.Session;
import org.example.entities.Client;


public class ClientDAO extends BasesDAO{



    public void addClient(Client c){
        session.getTransaction().begin();
        Client newClient = new Client();
        System.out.println("merci de préciser le nom du client");
        this.session.getTransaction();
    }

    public void updateClient(Client c){
        session.getTransaction().begin();
        this.fin();
    }
}
