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
public class Agence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idagence;
    private String nom;
    private String adresse;
    private Integer codeagence;
    @OneToMany(mappedBy = "agence")
    private List<Client> clients;
    //pour pouvoir stocker les ids au lieu d'objet json dans POSTmapping
    @JsonCreator
    public Agence(int id) {
        this.idagence = id;
    }
}