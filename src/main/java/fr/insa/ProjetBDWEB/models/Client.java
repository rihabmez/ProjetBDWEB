package fr.insa.ProjetBDWEB.models;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idClient;
    private String nom;
    private String prenom;
    private Integer age;
    private String adresse;
    private Integer numtel;
    private Integer mail ;
    @ManyToMany
    private List<Compte> comptes ;
    @ManyToMany
    private List<Agence> Agences ;

}