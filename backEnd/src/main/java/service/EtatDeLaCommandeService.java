package service;

import dao.EtatDeLaCommandeRepository;
import entity.EtatDeLaCommande;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EtatDeLaCommandeService {
    private final EtatDeLaCommandeRepository etatDeLaCommandeRepository;

    @Autowired
    public EtatDeLaCommandeService(EtatDeLaCommandeRepository etatDeLaCommandeRepository) {
        this.etatDeLaCommandeRepository = etatDeLaCommandeRepository;
    }

    public List<EtatDeLaCommande> listeDesEtatsDeCommande() {
        return etatDeLaCommandeRepository.findAll();
    }

    public EtatDeLaCommande obtenirEtatDeCommandeParId(Long id) {
        return etatDeLaCommandeRepository.findById(id).orElse(null);
    }

    public EtatDeLaCommande ajouterEtatDeCommande(EtatDeLaCommande etatDeLaCommande) {
        return etatDeLaCommandeRepository.save(etatDeLaCommande);
    }

    public EtatDeLaCommande mettreAJourEtatDeCommande(Long id, EtatDeLaCommande etatDeLaCommande) {
        etatDeLaCommande.setId(id);
        return etatDeLaCommandeRepository.save(etatDeLaCommande);
    }

    public void supprimerEtatDeCommande(Long id) {
        etatDeLaCommandeRepository.deleteById(id);
    }
}
