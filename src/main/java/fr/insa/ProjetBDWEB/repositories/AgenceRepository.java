package fr.insa.ProjetBDWEB.repositories;

import fr.insa.ProjetBDWEB.models.Agence;
import fr.insa.ProjetBDWEB.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.ManyToMany;
import java.util.List;

@Repository
public interface AgenceRepository extends JpaRepository<Agence,Integer> {

    public Agence  findByNom(String nom) ;
    public Agence findByIdagence(Integer idagence);
    public Agence findByAdresse(String adresse);
    public Agence findByCodeagence(Integer codeagence);
    public Agence findByClients(Client clients);
}
