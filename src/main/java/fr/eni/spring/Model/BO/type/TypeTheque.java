package fr.eni.spring.Model.BO.type;

public abstract class TypeTheque {
    private String nom, media;

    public TypeTheque(String nom, String media) {
        this.setNom(nom).setMedia(media);
    }

    public String getNom() {
        return nom;
    }
    public TypeTheque setNom(String nom) {
        this.nom = nom;
        return this;
    }

    public String getMedia() {
        return media;
    }
    public TypeTheque setMedia(String media) {
        this.media = media;
        return this;
    }
}
