package classes;

public class Spell {
    private int ID;
    private int level;
    private String Name;
    private String castingTime;
    private String range;
    private String school;
    private String components;
    private String description;

    void setID(int ID){
        this.ID = ID;
    }
    void setLevel(int level){
        this.level = level;
    }
    void setName(String Name){
        this.Name = Name;
    }
    void setCastingTime(String castingTime){
        this.castingTime = castingTime;
    }
    void setRange(String range){
        this.range = range;
    }
    void setSchool(String school){
        this.school = school;
    }
    void setComponents(String components){
        this.components = components;
    }
    void setDescription(String description){
        this.description = description;
    }
    //gettery itp
}
