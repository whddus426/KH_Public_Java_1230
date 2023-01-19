package 자동차만들기;

public class Sedan extends Car {
    String carName;

    Sedan(String carName) {
        this.carName = carName;
    }

    void trunk(boolean trunkON) {
        if(trunkON) seat += 1; // seat = seat + 1;

    }


    public void setMAX_SPEED() {
        super.setMAX_SPEED(200);
    }


    public void setFuel() {
        super.setFuel(12);
    }


    public void setFuelTank() {
        super.setFuelTank(45);
    }


    public void setSeat() {
        super.setSeat(4);
    }
}
