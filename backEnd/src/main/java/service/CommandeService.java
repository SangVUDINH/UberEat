package service;

import dao.CommandeRepository;
import entity.Commande;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommandeService {
    private final CommandeRepository commandeRepository;

    @Autowired
    public CommandeService(CommandeRepository commandeRepository) {
        this.commandeRepository = commandeRepository;
    }

    public List<Commande> listeDesCommandes() {
        return commandeRepository.findAll();
    }

    public Commande obtenirCommandeParId(Long id) {
        return commandeRepository.findById(id).orElse(null);
    }

    public Commande ajouterCommande(Commande commande) {
        return commandeRepository.save(commande);
    }

    public Commande mettreAJourCommande(Long id, Commande commande) {
        commande.setId(id);
        return commandeRepository.save(commande);
    }

    public void supprimerCommande(Long id) {
        commandeRepository.deleteById(id);
    }
}
