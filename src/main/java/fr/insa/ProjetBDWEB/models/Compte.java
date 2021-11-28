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
public class Compte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCompte;
    private String IBAN;
    private boolean comptejoint;
    @ManyToMany(mappedBy = "comptes")
    private List<Client> Clients;
    @OneToMany(mappedBy = "compte")
    private List<Carte> cartes;
    @OneToMany(mappedBy = "compteBenef")
    private List<Transaction> Transactions;
    private Integer solde;
    private Integer decouvert;

}
