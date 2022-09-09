package behavioralPatterns.interpreter;

public class OrExpression implements Expression {

    private Expression firstExpression;
    private Expression secondExpression;

    public OrExpression(Expression firstExpression, Expression secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    public boolean interpret(String context) {
        return firstExpression.interpret(context) || secondExpression.interpret(context);
    }
}
