package org.example.ihm;

import java.util.Scanner;

public class BasesIhm extends Ihm{
    ClientIhm clientIhm = new ClientIhm();

    public void StartProgramme() {
        int choice = 6;
        do {
            switch (choice) {
                case 1:
                    clientIhm.start();
                    choice = 6;
                    break;
                case 2:

                    choice = 6;
                    break;
                case 3:

                    choice = 6;
                    break;
                default:
                    System.out.println("""
                            Que souhaitez-vous faire ?
                            -------------------------
                             1 |- Client 
                             2 |- Inventaire
                             3 |- Ventes
                             
                             0 |- Arrêt du Programme
                            """);
                    choice = scanner.nextInt();
                    break;
            }
        } while (choice != 0);
        System.out.println("Fin du programme");
    }
}
