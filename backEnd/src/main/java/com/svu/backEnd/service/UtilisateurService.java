package com.svu.backEnd.service;

import com.svu.backEnd.dao.UtilisateurRepository;
import com.svu.backEnd.entity.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UtilisateurService implements UserDetailsService {
    @Autowired
    private UtilisateurRepository utilisateurRepository;

    public List<Utilisateur> listeDesUtilisateurs() {
        return utilisateurRepository.findAll();
    }

    public Utilisateur obtenirUtilisateurParId(int id) {
        return utilisateurRepository.findById(id).orElse(null);
    }

    public Utilisateur ajouterUtilisateur(Utilisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }

    public Utilisateur mettreAJourUtilisateur(int id, Utilisateur utilisateur) {
        utilisateur.setId(id);
        return utilisateurRepository.save(utilisateur);
    }

    public void supprimerUtilisateur(int id) {
        utilisateurRepository.deleteById(id);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Utilisateur utilisateur = utilisateurRepository.findByNom(username);
        if (utilisateur != null){
            return new User(utilisateur.getNom(), utilisateur.getMotDePasse(), getGrantedAuthority(utilisateur.getRole()));
        }
        return null;
    }

    private List<GrantedAuthority> getGrantedAuthority(String role) {
        List<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority("ROLE_"+role));
        return authorities;
    }
}

