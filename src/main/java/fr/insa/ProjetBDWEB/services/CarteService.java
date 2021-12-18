package fr.insa.ProjetBDWEB.services;

import fr.insa.ProjetBDWEB.models.Carte;
import fr.insa.ProjetBDWEB.models.Client;
import fr.insa.ProjetBDWEB.repositories.CarteRepository;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Data
@Service
public class CarteService {
    @Autowired
    private CarteRepository carteRepository;

    public Carte getCarte(int id) throws Exception {
        return this.carteRepository.findById(id).orElseThrow(Exception::new);
    }
    public List<Carte> getCartes(){
        return  carteRepository.findAll();
    }

    public void deleteCarte(int id){

        carteRepository.deleteById(id);
    }

    public Carte saveCarte(Carte Carte){
        Carte savedCarte = carteRepository.save(Carte);
        return savedCarte;
    }
}
