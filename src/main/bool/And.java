package bool;

public class And implements BooleanNode{
    private BooleanNode left;
    private BooleanNode right;

    public And(BooleanNode left, BooleanNode right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean evaluate() {
        return left.evaluate() && right.evaluate();
    }

    @Override
    public String prettyPrint() {
        return "(AND " + left.prettyPrint() + " " + right.prettyPrint() + ")";
    }
    
}
