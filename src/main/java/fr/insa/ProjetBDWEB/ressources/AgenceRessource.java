package fr.insa.ProjetBDWEB.ressources;

import fr.insa.ProjetBDWEB.models.Agence;

import fr.insa.ProjetBDWEB.repositories.AgenceRepository;
import fr.insa.ProjetBDWEB.repositories.ClientRepository;
import fr.insa.ProjetBDWEB.services.AgenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("agences")
public class AgenceRessource {
    @Autowired
    private ClientRepository cp ;

    @Autowired
    private AgenceService agenceService;

    @Autowired
    private AgenceRepository agenceRepository;

    @GetMapping()
    public List<Agence> getAgences(){
        return this.agenceService.getAgences();
    }

    @GetMapping("{id}")
    public Agence getAgence(@PathVariable("id") int id) throws Exception {
        return agenceService.getAgence(id);
    }
    @DeleteMapping("{id}")
    public ResponseEntity deleteAgence(@PathVariable("id") int id) {
        agenceService.deleteAgence(id);
        return ResponseEntity.ok().build();
    }

    @PostMapping
    public ResponseEntity<Agence> createAgence(@RequestBody Agence agence) {
        try {
            Agence _agence = agenceRepository
                    .save(new Agence(agence.getIdagence() ,agence.getNom(), agence.getAdresse(),agence.getCodeagence(),agence.getClients()));
            return new ResponseEntity<>(_agence, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /*@PostMapping
    public Agence createAgence(@RequestBody AgenceCreateModel AgenceToCreate) throws Exception {
        return this.agenceRepository.save(AgenceToCreate.getAgence());
    }*/


}
