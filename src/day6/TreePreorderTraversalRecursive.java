package day6;




import java.util.ArrayList;
import java.util.List;

public class TreePreorderTraversalRecursive {

    public List<Integer> list = new ArrayList<>();
    public List<Integer> preorder(Node root) {
        if (root == null)
            return list;

        list.add(root.val);
        for(Node node: root.children)
            preorder(node);

        return list;
    }
}
