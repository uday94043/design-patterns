package behavioralPatterns.state;

public class Context {
    public State state;

    public Context() {
        this.state = null;
    }

    public State getState() {
        return this.state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
