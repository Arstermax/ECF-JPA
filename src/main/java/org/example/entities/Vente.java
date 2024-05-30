package org.example.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

// Permet de faire comprendre que l'on crée une entité dans la base de données.
@Entity
// définie la table : vente
@Table(name = "vente")
// permet de pouvoir modifier les ventes
@Getter
@Setter
public class Vente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String etat;

}
