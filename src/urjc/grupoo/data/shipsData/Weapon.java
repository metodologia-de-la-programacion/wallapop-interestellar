package urjc.grupoo.data.shipsData;

public class Weapon {
    public double power;
    public String name;

    public Weapon(double i, String str) {
        setName(str);
        setPower(i);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

}

