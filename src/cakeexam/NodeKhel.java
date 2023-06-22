package cakeexam;

public class NodeKhel {
    private NodeKhel leftChild, rightChild;

    public NodeKhel(NodeKhel leftChild, NodeKhel rightChild) {
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    public NodeKhel getLeftChild() {
        return this.leftChild;
    }

    public NodeKhel getRightChild() {
        return this.rightChild;
    }

    public int height() {
        if(leftChild == null && rightChild == null)
            return 0;

        int leftChildHeight = 0;
        int rightChildHeight = 0;

        if(leftChild != null)
            leftChildHeight = leftChild.height();
        if(rightChild != null)
            rightChildHeight = rightChild.height();

        return 1 + (leftChildHeight > rightChildHeight ? leftChildHeight : rightChildHeight);
    }


}
