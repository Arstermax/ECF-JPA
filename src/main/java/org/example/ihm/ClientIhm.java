package org.example.ihm;

import org.example.DAO.ClientDAO;

public class ClientIhm extends Ihm {
    ClientDAO clientDAO = new ClientDAO();
    
    public void start() {
        int choice = 6;
        do {
            switch (choice) {
                case 1:
                    InscriptionIhm();
                    choice = 6;
                    break;

                case 2:
                    ReadIhm();
                    choice = 6;

                    break;
                case 3:
                    UpdateIhm();
                    choice = 6;

                    break;
                case 4:
                    DeleteIhm();
                    choice = 6;

                    break;
                default:
                    System.out.println("""
                            Vous voici dans la partie client :
                              1 |- Ajout d'un client
                              2 |- Lire un Client
                              3 |- Modifier un Client
                              4 |- Delete un Client 
                              
                              0 |- Arrêt de la partie clients
                            """);
                    choice = scanner.nextInt();
                    break;
            }
        } while (choice != 0);
        System.out.println("Partie client arrêté");
    }

    private void ReadIhm() {
        int idSelected = 0;
        System.out.println("Quel client souhaiter vous recherche?");
        idSelected = scanner.nextInt();
        clientDAO.readClient(idSelected);
    }

    private void UpdateIhm(){
        int idSelected = 0;
        System.out.println("Quel client souhaiter vous recherche?");
        idSelected = scanner.nextInt();
        clientDAO.UpdateClient(idSelected);
    }

    private void DeleteIhm(){
        int idSelected = 0;
        System.out.println("Quel client souhaiter vous supprimer?");
        idSelected = scanner.nextInt();
        clientDAO.deleteClient(idSelected);
    }

    private void InscriptionIhm(){
        String name;
        String lastname;
        int age;

        System.out.println("Votre prénom :");
        name = scanner.next();
        System.out.println("Votre nom :");
        lastname = scanner.next();
        System.out.println("Votre age :");
        age = scanner.nextInt();

        clientDAO.Inscription(name, lastname, age);
    }
}
