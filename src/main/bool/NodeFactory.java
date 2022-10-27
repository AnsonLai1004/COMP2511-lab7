package bool;

import org.json.JSONObject;

import com.google.gson.JsonObject;

public class NodeFactory {
    public NodeFactory() {
        
    }
    
    public BooleanNode constructNode(JSONObject obj) {
        String node = obj.getString("node");
        JSONObject subnode1 = null;
        JSONObject subnode2 = null;
        if (obj.has("subnode1")) {
            subnode1 = obj.getJSONObject("subnode1");
        }
        if (obj.has("subnode2")) {
            subnode2 = obj.getJSONObject("subnode2");
        }

        switch (node) {
            case "or": 
                return new Or(constructNode(subnode1), constructNode(subnode2));
            case "and":
                return new And(constructNode(subnode1), constructNode(subnode2));
            case "not":
                return new Not(constructNode(subnode1));
            case "value": 
                Boolean value = obj.getBoolean("value");
                return new LeafNode(value);
            default: 
                return null;
        }

    }

    
    public static void main(String[] argv) {
        JSONObject obj = new JSONObject();
        obj.put("node", "and");
        
        JSONObject sub = new JSONObject();
        sub.put("node", "value");
        sub.put("value", true);
        JSONObject sub2 = new JSONObject();
        sub2.put("node", "value");
        sub2.put("value", false);
        JSONObject or = new JSONObject();
        or.put("subnode1", sub);
        or.put("subnode2", sub2);
        
        JSONObject objSub1 = new JSONObject();
        objSub1.put("subnode1", or);
        JSONObject objSub2 = new JSONObject();
        objSub2.put("subnode2", sub);
        

        NodeFactory f = new NodeFactory();
        BooleanNode res = f.constructNode(obj);
        System.out.println(res.prettyPrint());
    }
}