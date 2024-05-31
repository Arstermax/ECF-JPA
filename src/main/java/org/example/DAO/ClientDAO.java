package org.example.DAO;

import com.mysql.cj.xdevapi.Session;
import org.example.entities.Client;
import org.example.repository.ClientRepository;


public class ClientDAO extends BasesDAO {

    ClientRepository clientRepository = new ClientRepository();


    public void Inscription(String name, String lastname, int age) {
        Client newClient = new Client();

        newClient.setName(name);
        newClient.setLastname(lastname);
        newClient.setAge(age);

        clientRepository.add(newClient);
    }

    public void UpdateClient(int c) {
        System.out.println(clientRepository.update(c));
    }

    public void readClient(int idSelected) {
        System.out.println(clientRepository.read(idSelected).toString());
    }

    public void deleteClient(int idSelected){
        System.out.println(clientRepository.delete(idSelected));
    }
}
