package day7;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {

    public static List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> res = new ArrayList<>();
        levelOrder(res,root,0);
        return res;

    }

    /*
    * DFS solution in leetcode
    * */
    private static void levelOrder(List<List<Integer>> list, TreeNode node, int height){
        if(node == null){
            return;
        }

        if(height>=list.size()){
            list.add(new ArrayList<>());
        }

        list.get(height).add(node.val);

        levelOrder(list,node.left,height+1);
        levelOrder(list,node.right,height+1);

    }
}
