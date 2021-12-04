package fr.insa.ProjetBDWEB.models;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Carte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCarte;
    private Integer numCarte;
    @ManyToOne
    private Compte compte;
    private Integer plafond ;
    private String MDP;

}
