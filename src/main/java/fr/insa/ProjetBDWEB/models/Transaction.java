package fr.insa.ProjetBDWEB.models;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTransaction;
    private String type;
    private String date;
    @ManyToOne
    private Compte compteBenef;
    private Integer montant;
}
