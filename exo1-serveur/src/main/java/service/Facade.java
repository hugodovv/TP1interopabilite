package service;

public interface Facade {
String searchTelephone(String nom);
    modele.Personne searchPersonne(String nom);
    void addPersonne(modele.Personne p);
    void addPersonneList(String nom, String prenom, String tel);
    java.util.Collection<String> getAllNom();
}
