package fr.insa.ProjetBDWEB.services;

import fr.insa.ProjetBDWEB.models.Agence;
import fr.insa.ProjetBDWEB.repositories.AgenceRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
public class AgenceService {

    @Autowired
    private AgenceRepository agenceRepository;
    @Autowired
    private ClientService clientService;


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

    /*@Transactional(rollbackOn = Exception.class)
    public Agence saveAgence(AgenceCreateModel AgenceToCreate) throws Exception {

        List<Client> client = (List<Client>) clientService.getClient(AgenceToCreate.getClients());

        Agence s = Agence.builder()
                .clients(client)
                .adresse(AgenceToCreate.getAdresse())
                .codeagence(AgenceToCreate.getCodeagence())
                .idagence(AgenceToCreate.getIdagence())
                .nom(AgenceToCreate.getNom())
                .build();

        return this.agenceRepository.save(s);
    }*/
}
