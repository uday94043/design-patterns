package behavioralPatterns.mediator;

public class Mediator {
    private Fan fan;
    private PowerSupply powerSupply;

    // constructor, getters and setters
    public Mediator(PowerSupply powerSupply, Fan fan) {
        this.powerSupply = powerSupply;
        this.fan = fan;
    }

    public void press() {
        if (fan.getIsOn()) {
            fan.turnOff();
        } else {
            fan.turnOn();
        }
    }

    public void start() {
        powerSupply.turnOn();
    }

    public void stop() {
        powerSupply.turnOff();
    }
}
