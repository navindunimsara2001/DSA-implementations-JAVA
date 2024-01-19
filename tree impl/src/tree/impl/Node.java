package tree.impl;

public class Node {
    int iData;
    double dData;
    Node leftChild;
    Node rightChild;

    public Node(int id,double data){
        this.iData = id;
        this.dData = data;
        this.leftChild = null;
        this.rightChild = null;
    }

    public void displayData(){
        System.out.println("iData : "+this.iData);
    }
}
