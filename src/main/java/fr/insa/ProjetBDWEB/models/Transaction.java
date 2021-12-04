package fr.insa.ProjetBDWEB.models;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

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
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    @ManyToOne
    private Compte compteBenef;
    private Integer montant;
}
