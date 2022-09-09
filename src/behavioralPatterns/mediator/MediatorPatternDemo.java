package behavioralPatterns.mediator;

public class MediatorPatternDemo {
    public static void main(String[] args) {
        PowerSupply powerSupply = new PowerSupply();
        Fan fan = new Fan();
        Mediator mediator = new Mediator(powerSupply, fan);
        Button button = new Button(mediator);

        mediator.start();
        button.press();
        button.press();
        mediator.stop();

    }
}
