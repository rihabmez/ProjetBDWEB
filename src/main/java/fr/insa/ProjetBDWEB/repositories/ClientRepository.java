package fr.insa.ProjetBDWEB.repositories;

import fr.insa.ProjetBDWEB.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {
    public List<Client> findByNom(String nom) ;
    public List<Client> findByAge(String age);


}