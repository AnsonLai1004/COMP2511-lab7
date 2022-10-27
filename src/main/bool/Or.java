package bool;

public class Or implements BooleanNode{
    private BooleanNode left;
    private BooleanNode right;

    public Or(BooleanNode left, BooleanNode right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean evaluate() {
        return left.evaluate() || right.evaluate();
    }

    @Override
    public String prettyPrint() {
        return "(OR " + left.prettyPrint() + " " + right.prettyPrint() + ")";
    }
    
}
