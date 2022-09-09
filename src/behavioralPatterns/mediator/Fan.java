package behavioralPatterns.mediator;

public class Fan {
    private boolean isOn = false;

    // constructor, getters and setters

    public boolean getIsOn() {
        return isOn;
    }

    public void turnOn() {
        isOn = true;
        System.out.println("fan turned on");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("fan turned off");
    }
}
