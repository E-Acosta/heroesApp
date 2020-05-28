package com.everacosta.myhero;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Appearance {

    @SerializedName("gender")
    @Expose
    private String gender;
    @SerializedName("race")
    @Expose
    private String race;
    @SerializedName("height")
    @Expose
    private List<String> height = null;
    @SerializedName("weight")
    @Expose
    private List<String> weight = null;
    @SerializedName("eye-color")
    @Expose
    private String eyeColor;
    @SerializedName("hair-color")
    @Expose
    private String hairColor;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Appearance() {
    }

    /**
     * 
     * @param gender
     * @param race
     * @param eyeColor
     * @param weight
     * @param hairColor
     * @param height
     */
    public Appearance(String gender, String race, List<String> height, List<String> weight, String eyeColor, String hairColor) {
        super();
        this.gender = gender;
        this.race = race;
        this.height = height;
        this.weight = weight;
        this.eyeColor = eyeColor;
        this.hairColor = hairColor;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public List<String> getHeight() {
        return height;
    }

    public void setHeight(List<String> height) {
        this.height = height;
    }

    public List<String> getWeight() {
        return weight;
    }

    public void setWeight(List<String> weight) {
        this.weight = weight;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    @Override
    public String toString() {
        return "Appearance{" +
                "gender='" + gender + '\'' +
                ", race='" + race + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", eyeColor='" + eyeColor + '\'' +
                ", hairColor='" + hairColor + '\'' +
                '}';
    }
}
