package bool;

public class LeafNode implements BooleanNode{
    private boolean value;

    public LeafNode(boolean value) {
        this.value = value;
    }

    @Override
    public boolean evaluate() {
        return value;  
    }

    @Override
    public String prettyPrint() {
        if (value) {
            return "true";
        } else {
            return "false";
        }
    }

    
}
