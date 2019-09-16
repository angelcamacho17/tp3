package com;

public class Node {
    public int key;
    public int balance;
    public int height;
    public Node left;
    public Node right;
    public Node parent;
 
    public Node(int key, Node parent) {
        this.key = key;
        this.parent = parent;
    }
	
}