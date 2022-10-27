package bool;

public class Not implements BooleanNode{
    private BooleanNode value;

    public Not(BooleanNode value) {
        this.value = value;
    }

    @Override
    public boolean evaluate() {
        return !value.evaluate();
    }

    @Override
    public String prettyPrint() {
        return "(NOT " + value.prettyPrint() + ")";

    }

}
