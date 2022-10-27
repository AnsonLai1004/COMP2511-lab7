package random;

import org.json.JSONObject;
import org.junit.jupiter.api.Test;

import bool.BooleanNode;
import bool.NodeFactory;

public class NodeFactoryTest {
    @Test
    public void Test1() {
        JSONObject obj = new JSONObject();
        obj.put("node", "and");
        JSONObject sub = new JSONObject();
        sub.put("node", "value");
        sub.put("value", true);
        JSONObject sub2 = new JSONObject();
        sub2.put("node", "value");
        sub2.put("value", false);
        
        obj.put("subnode1", sub);
        obj.put("subnode2", sub2);
        
        NodeFactory f = new NodeFactory();
        BooleanNode res = f.constructNode(obj);
        System.out.println(res.prettyPrint());
        
        System.out.println(obj.getString("node"));
        System.out.println(obj.getString("node"));
       

    }
}
