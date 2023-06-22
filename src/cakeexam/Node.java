package cakeexam;

public class Node {

    private Node left;
    private Node right;
    private int data;

    public Node(Node left, Node right,int data) {
        this.left = left;
        this.right = right;
        this.data=data;
    }

    public int getHeight(Node node){
        if(node==null){
            return -1;
        }

        int left = getHeight(node.left);
        int right = getHeight(node.right);

        return 1 + (Math.max(left, right));
    }


}
