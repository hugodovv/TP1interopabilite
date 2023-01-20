package modele;

import java.util.Collection;
import java.util.List;

public class Personne {
    private String nom;
    private String prenom;
    private List<Contact> contacts;

    public Personne() {
    }

    public void addContact(Contact tel) {
    }

    public String getNom() {
        return nom;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }


}
