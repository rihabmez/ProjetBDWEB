package fr.insa.ProjetBDWEB.services;

import fr.insa.ProjetBDWEB.models.Agence;
import fr.insa.ProjetBDWEB.models.Client;
import fr.insa.ProjetBDWEB.repositories.AgenceRepository;
import fr.insa.ProjetBDWEB.repositories.ClientRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Data
@Service
public class AgenceService {

    @Autowired
    private AgenceRepository agenceRepository;

    public Agence getAgence(int id) throws Exception {
        return this.agenceRepository.findById(id).orElseThrow(Exception::new);
    }

    public List<Agence> getAgences(){
        return  this.agenceRepository.findAll();
    }

    public void deleteAgence(int id){

        agenceRepository.deleteById(id);
    }

    public Agence saveAgence(Agence Agence){
        Agence savedAgence = agenceRepository.save(Agence);
        return savedAgence;
    }
}
