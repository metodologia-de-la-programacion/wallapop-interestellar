package urjc.grupoo.data.shipsData;

import java.io.Serializable;

public abstract class Spaceship implements Serializable {

    private String registerNumber;
    private int crewMembersAmount;
    private PropulsionType firstpropulsion;
    private PropulsionType secondpropulsion;
    private String type;

    public int getCrewMembersAmount() {
        return crewMembersAmount;
    }

    public void setCrewMembersAmount(int crewMembersAmount) {
        this.crewMembersAmount = crewMembersAmount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public PropulsionType getFirstpropulsion() {
        return firstpropulsion;
    }

    public void setFirstpropulsion(PropulsionType firstpropulsion) {
        this.firstpropulsion = firstpropulsion;
    }

    public PropulsionType getSecondpropulsion() {
        return secondpropulsion;
    }

    public void setSecondpropulsion(PropulsionType secondpropulsion) {
        this.secondpropulsion = secondpropulsion;
    }

    public void setRegisterNumber(String registerNumber) {
        this.registerNumber = registerNumber;
    }

    public String getRegisterNumber() {
        return registerNumber;
    }


    public Spaceship(String type, int i, PropulsionType fprop, PropulsionType sprop, String num) {
        setType(type);
        setCrewMembersAmount(i);
        setFirstpropulsion(fprop);
        setSecondpropulsion(sprop);
        setRegisterNumber(num);
    }






}
