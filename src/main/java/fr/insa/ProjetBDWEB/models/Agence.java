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
public class Agence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAgence;
    private String nom;
    private String adresse;
    private String codeAgence;
    @ManyToMany(mappedBy = "Agences")
    private List<Client> clients;
}