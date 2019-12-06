package fr.eni.spring.Model.BO;

public class Media {
    String name, title;

    public Media(String name, String title) {
        this.setTitle(title).setName(name);
    }

    public String getTitle() {
        return title;
    }
    public Media setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getName() {
        return name;
    }
    public Media setName(String name) {
        this.name = name;
        return this;
    }
}

