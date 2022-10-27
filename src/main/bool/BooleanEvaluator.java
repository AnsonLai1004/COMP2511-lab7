package bool;

public class BooleanEvaluator {
    
    public static boolean evaluate(BooleanNode expression) {
        return expression.evaluate();
    }

    public static String prettyPrint(BooleanNode expression) {
        return expression.prettyPrint();
    }

    public static void main(String[] args) {
        System.out.println(BooleanEvaluator.evaluate(new Or(
            new LeafNode(false), 
            new Not(new LeafNode(false)))));
        System.out.println(BooleanEvaluator.prettyPrint(new Or(
            new LeafNode(false), 
            new Not(new LeafNode(false)))));
        // BooleanEvaluator.evaluate(...)
    }

}