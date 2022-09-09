package behavioralPatterns.mediator;

public class PowerSupply {
    private boolean isOn = false;

    public boolean getIsOn() {
        return isOn;
    }

    public void turnOn() {
        // implementation
        isOn = true;
        System.out.println("power turned on");
    }

    public void turnOff() {
        // implementation
        isOn = false;
        System.out.println("power turned off");
    }
}
