package fr.insa.ProjetBDWEB.repositories;

import fr.insa.ProjetBDWEB.models.Agence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgenceRepository extends JpaRepository<Agence,Integer> {

    public Agence  findByNom(String nom) ;
}
