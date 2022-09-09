package behavioralPatterns.interpreter;

public class AndExpression implements Expression {
    private Expression firstExpression;
    private Expression secondExpression;

    public AndExpression(Expression firstExpression, Expression secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    public boolean interpret(String context) {
        return firstExpression.interpret(context) && secondExpression.interpret(context);
    }
}
