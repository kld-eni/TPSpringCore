package fr.eni.spring.Model.BO;

import fr.eni.spring.Model.BO.type.Bibliotheque;
import fr.eni.spring.Model.BO.type.TypeTheque;

import java.util.ArrayList;
import java.util.List;

public class Mediatheque {
    private static TypeTheque typeTheque;
    private List<Media> medias;

    public void setTypeTheque(TypeTheque typeTheque) {
        Mediatheque.typeTheque = typeTheque;
    }

    public Mediatheque() {
        this.medias = new ArrayList<>();;
    }

    public String getNom() {
        return typeTheque.getNom();
    }

    public String getMedia() {
        return typeTheque.getMedia();
    }

    public List<Media> getMedias() {
        return medias;
    }

    public void addMedia(Media media) {
        this.medias.add(media);
    }
}
