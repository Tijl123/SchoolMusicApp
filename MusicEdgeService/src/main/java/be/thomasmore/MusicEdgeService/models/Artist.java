package be.thomasmore.MusicEdgeService.models;

import lombok.Data;

@Data
public class Artist {
    private String name;
    private String imageUrl;

    public Artist(String name, String imageUrl) {
        this.name = name;
        this.imageUrl = imageUrl;
    }

    public Artist() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
