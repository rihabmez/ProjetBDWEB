package fr.insa.ProjetBDWEB.repositories;

import fr.insa.ProjetBDWEB.models.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompteRepository extends JpaRepository<Compte, Integer> {
    public Compte findByIBAN(String IBAN);

}
