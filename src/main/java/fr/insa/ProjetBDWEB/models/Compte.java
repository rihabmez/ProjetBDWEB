package fr.insa.ProjetBDWEB.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Compte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idcompte;
    private String iban;
    private boolean comptejoint;
    @ManyToMany(mappedBy = "comptes")
    @JsonIgnore
    private List<Client> clients;
    @OneToMany(mappedBy = "compte")
    @JsonIgnore
    private List<Carte> cartes;
    @OneToMany(mappedBy = "comptebenef")
    @JsonIgnore
    private List<Transaction> transactions;
    private Integer solde;
    private Integer decouvert;

    //pour pouvoir stocker les ids au lieu d'objet json dans POSTmapping
    @JsonCreator
    public Compte(int id) {
        this.idcompte = id;
    }

}
