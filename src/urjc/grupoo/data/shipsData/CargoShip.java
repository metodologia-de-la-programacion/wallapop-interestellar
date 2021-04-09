package urjc.grupoo.data.shipsData;

public class CargoShip extends Spaceship {
    private DefenceSystem defence;
    private int maxCargo;

    public int getMaxCargo() {
        return maxCargo;
    }

    public void setMaxCargo(int maxCargo) {
        this.maxCargo = maxCargo;
    }

    public DefenceSystem getDefence() {
        return defence;
    }

    public void setDefence(DefenceSystem defence) {
        this.defence = defence;
    }

    public CargoShip(int i, PropulsionType fprop, PropulsionType sprop, RegisterNumber num, DefenceSystem defence, int j) {
        super(i, fprop, sprop, num);
        setDefence(defence);
        setMaxCargo(j);

    }
}
