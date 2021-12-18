package fr.insa.ProjetBDWEB.repositories;

import fr.insa.ProjetBDWEB.models.Carte;
import fr.insa.ProjetBDWEB.models.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.ManyToOne;
import java.util.List;

@Repository
public interface CarteRepository extends JpaRepository<Carte,Integer> {
    public Carte findByNumcarte(Integer numcarte);
    public Carte findByIdcarte(Integer idcarte);
    public List<Carte> findByCompte(Compte compte);
}


