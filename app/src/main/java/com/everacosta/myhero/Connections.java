
package com.everacosta.myhero;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
public class Connections {

    @SerializedName("group-affiliation")
    @Expose
    private String groupAffiliation;
    @SerializedName("relatives")
    @Expose
    private String relatives;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Connections() {
    }

    /**
     * 
     * @param groupAffiliation
     * @param relatives
     */
    public Connections(String groupAffiliation, String relatives) {
        super();
        this.groupAffiliation = groupAffiliation;
        this.relatives = relatives;
    }

    public String getGroupAffiliation() {
        return groupAffiliation;
    }

    public void setGroupAffiliation(String groupAffiliation) {
        this.groupAffiliation = groupAffiliation;
    }

    public String getRelatives() {
        return relatives;
    }

    public void setRelatives(String relatives) {
        this.relatives = relatives;
    }

    @Override
    public String toString() {
        return "Connections{" +
                "groupAffiliation='" + groupAffiliation + '\'' +
                ", relatives='" + relatives + '\'' +
                '}';
    }
}
