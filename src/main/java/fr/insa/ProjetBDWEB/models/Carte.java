package fr.insa.ProjetBDWEB.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    private Integer idcarte;
    private Integer numcarte;
    @ManyToOne
    @JsonIgnore
    private Compte compte;
    private Integer plafond ;
    private String mdp;

}
