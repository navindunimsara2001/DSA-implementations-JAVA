package tree.impl;

public class Tree {
    Node root; // first node of tree

    public Tree() { // constructor
        this.root = null;
    }

    public Node find(int key) {  // find method
        Node current = this.root;

        while (current.iData != key) {
            if (key < current.iData) {
                current = current.leftChild;
            } else {
                current = current.rightChild;
            }
            if (current == null) {
                return null; // not found
            }
        }
        // found
        return current;
    }

    public void insert(int id, double dd) {
        // create node
        Node newNode = new Node(id, dd);
        // find place
        if (this.root == null) {
            this.root = newNode;
        } else {
            Node current = root;
            Node parent = root;

            while (true) {
                parent = current;
                if (id < current.iData) {
                    current = current.leftChild;
                    if (current == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    current = current.rightChild;
                    if (current == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    //    Traversal
    //   Inorder method
    private void inOrder(Node localRoot) { // use private method for get whole tree instead of giving localRoot
        if (localRoot != null) {
            inOrder(localRoot.leftChild); // recursion -> inside method calling same method
            localRoot.displayData();
            inOrder(localRoot.rightChild);
        }
    }

    public void inOrder() { // call inOrder private method
        inOrder(this.root); // to get whole tree need to pass root as a parameter
    }

    private void preOrder(Node localRoot) {
        if (localRoot != null) {
            localRoot.displayData();
            preOrder(localRoot.leftChild);
            preOrder(localRoot.rightChild);
        }
    }

    public void preOrder() { // call preOrder private method
        preOrder(this.root); // to get whole tree need to pass root as a parameter
    }

    private void postOrder(Node localRoot) {
        if (localRoot != null) {
            postOrder(localRoot.leftChild);
            postOrder(localRoot.rightChild);
            localRoot.displayData();
        }
    }

    public void postOrder() { // call postOrder private method
        postOrder(this.root); // to get whole tree need to pass root as a parameter
    }
}
