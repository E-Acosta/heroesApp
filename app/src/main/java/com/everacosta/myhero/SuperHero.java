
package com.everacosta.myhero;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SuperHero {

    @SerializedName("response")
    @Expose
    private String response;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("powerstats")
    @Expose
    private Powerstats powerstats;
    @SerializedName("biography")
    @Expose
    private Biography biography;
    @SerializedName("appearance")
    @Expose
    private Appearance appearance;
    @SerializedName("work")
    @Expose
    private Work work;
    @SerializedName("connections")
    @Expose
    private Connections connections;
    @SerializedName("image")
    @Expose
    private Image image;

    /**
     * No args constructor for use in serialization
     * 
     */
    public SuperHero() {
    }

    /**
     * 
     * @param image
     * @param appearance
     * @param response
     * @param work
     * @param name
     * @param powerstats
     * @param id
     * @param biography
     * @param connections
     */
    public SuperHero(String response, String id, String name, Powerstats powerstats, Biography biography, Appearance appearance, Work work, Connections connections, Image image) {
        super();
        this.response = response;
        this.id = id;
        this.name = name;
        this.powerstats = powerstats;
        this.biography = biography;
        this.appearance = appearance;
        this.work = work;
        this.connections = connections;
        this.image = image;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Powerstats getPowerstats() {
        return powerstats;
    }

    public void setPowerstats(Powerstats powerstats) {
        this.powerstats = powerstats;
    }

    public Biography getBiography() {
        return biography;
    }

    public void setBiography(Biography biography) {
        this.biography = biography;
    }

    public Appearance getAppearance() {
        return appearance;
    }

    public void setAppearance(Appearance appearance) {
        this.appearance = appearance;
    }

    public Work getWork() {
        return work;
    }

    public void setWork(Work work) {
        this.work = work;
    }

    public Connections getConnections() {
        return connections;
    }

    public void setConnections(Connections connections) {
        this.connections = connections;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "SuperHero{" +
                "response='" + response + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", powerstats=" + powerstats +
                ", biography=" + biography +
                ", appearance=" + appearance +
                ", work=" + work +
                ", connections=" + connections +
                ", image=" + image +
                '}';
    }
}
