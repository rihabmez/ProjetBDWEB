package fr.insa.ProjetBDWEB.repositories;

import fr.insa.ProjetBDWEB.models.Carte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarteRepository extends JpaRepository<Carte,Integer> {
    public Carte findByNumCarte(Integer numcarte);
}
