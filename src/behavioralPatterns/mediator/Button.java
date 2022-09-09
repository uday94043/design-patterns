package behavioralPatterns.mediator;

public class Button {
    private Mediator mediator;

    // constructor, getters and setters
    public Button(Mediator mediator) {
        this.mediator = mediator;
    }

    public void press() {
        mediator.press();
    }
}
