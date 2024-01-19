package tree.impl;

public class Tree {
    Node root; // first node of tree

    public Tree() { // constructor
        this.root = null;
    }

    public Node find(int key) {  // find method
        Node current = this.root;

        while (current.iData != key) {
            if(key<current.iData){
                current = current.leftChild;
            }
            else{
                current = current.rightChild;
            }
            if(current == null){
                return null; // not found
            }
        }
        // found
        return current;
    }
}
