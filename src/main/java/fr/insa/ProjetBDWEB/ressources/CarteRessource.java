package fr.insa.ProjetBDWEB.ressources;


import fr.insa.ProjetBDWEB.models.Carte;
import fr.insa.ProjetBDWEB.repositories.CarteRepository;
import fr.insa.ProjetBDWEB.services.CarteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("carte")
public class CarteRessource {
    @Autowired
    private CarteService carteService;

    @Autowired
    private CarteRepository carteRepository;

    @GetMapping("/cartes")
    public List<Carte> getCartes(){
        return carteService.getCartes();
    }

    @GetMapping("{id}")
    public Carte getCarte(@PathVariable("id") int id) throws Exception {
        return carteService.getCarte(id);
    }

    @DeleteMapping("{id}")
    public ResponseEntity deleteCarte(@PathVariable("id") int id) {
        carteService.deleteCarte(id);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/carte")
    public ResponseEntity<Carte> createCarte(@RequestBody Carte carte) {
        try {
            Carte _carte = carteRepository
                    .save(new Carte(carte.getIdcarte() ,carte.getNumcarte(), carte.getCompte(),carte.getPlafond(),carte.getMdp()));
            return new ResponseEntity<>(_carte, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}

