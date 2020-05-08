package com.wmt;

/**
 * @description:
 * @author:
 * @date:Created in 2020-03-26 19:07
 * @version:0.0.1
 * @modified By:
 */
public class BeastOfPrey {
    private String beastId;  //在父类中修改就可以了，效率高
    private String populationLevel;
    private String gender;
    private String dateOfBirth;
    private String shoulderHeight;
    private String weight;
    private String biteForce;
    private String BodyCondition;
    private String emotionalState;

    public void behaviorPatrol () {
        System.out.println(" BeastOfPrey behaviorPatrol");
    }

    public void behaviorWandering () {
        System.out.println("BeastOfPrey behaviorWandering");
    }

    public void behaviorPredation () {
        System.out.println("BeastOfPrey behaviorPredation");
    }

    public void behaviorAvoid () {
        System.out.print("BeastOfPrey behaviorAvoid : run   ");
    }

    public void behaviorCommunication () {
        System.out.println("BeastOfPrey behaviorCommunication");
    }

    public void behaviorEat () {
        System.out.println("BeastOfPrey behaviorEat");
    }

    public void behaviorDrinkWater () {
        System.out.println("BeastOfPrey behaviorDrinkWater");
    }

    public void behaviorSleep () {
        System.out.println("BeastOfPrey behaviorSleep");
    }

    public BeastOfPrey () {
    }

    public BeastOfPrey(String beastId, String populationLevel, String gender, String dateOfBirth, String shoulderHeight, String weight, String biteForce, String bodyCondition, String emotionalState) {
        this.beastId = beastId;
        this.populationLevel = populationLevel;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.shoulderHeight = shoulderHeight;
        this.weight = weight;
        this.biteForce = biteForce;
        BodyCondition = bodyCondition;
        this.emotionalState = emotionalState;
    }

    public String getPopulationLevel () {
        return populationLevel;
    }

    public void setPopulationLevel (String populationLevel) {
        this.populationLevel=populationLevel;
    }

    public String getGender () {
        return gender;
    }

    public void setGender (String gender) {
        this.gender=gender;
    }

    public String getDateOfBirth () {
        return dateOfBirth;
    }

    public void setDateOfBirth (String dateOfBirth) {
        this.dateOfBirth=dateOfBirth;
    }

    public String getShoulderHeight () {
        return shoulderHeight;
    }

    public void setShoulderHeight (String shoulderHeight) {
        this.shoulderHeight=shoulderHeight;
    }

    public String getWeight () {
        return weight;
    }

    public void setWeight (String weight) {
        this.weight=weight;
    }

    public String getBiteForce () {
        return biteForce;
    }

    public void setBiteForce (String biteForce) {
        this.biteForce=biteForce;
    }

    public String getBodyCondition () {
        return BodyCondition;
    }

    public void setBodyCondition (String bodyCondition) {
        BodyCondition=bodyCondition;
    }

    public String getEmotionalState () {
        return emotionalState;
    }

    public void setEmotionalState (String emotionalState) {
        this.emotionalState=emotionalState;
    }

    public String getBeastId() {
        return beastId;
    }

    public void setBeastId(String beastId) {
        this.beastId = beastId;
    }
}
