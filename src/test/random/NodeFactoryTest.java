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
        
        System.out.println(obj.getString("node"));
        System.out.println(obj.getString("node"));
       

    }
}
