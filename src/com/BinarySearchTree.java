package com;

import com.Node;

public class BinarySearchTree 
{  
     // Root of BST 
    Node root; 
  
    // Constructor 
    BinarySearchTree() 
    { 
        root = null; 
    } 
    
    public Node search(Node root, int key) 
    { 
        // Base Cases: root is null or key is present at root 
        if (root==null || root.key==key) 
            return root; 
      
        // val is greater than root's key 
        if (root.key > key) 
            return search(root.left, key); 
      
        // val is less than root's key 
        return search(root.right, key); 
    } 
  
    // This method mainly calls deleteRec() 
   
    /* A recursive function to insert a new key in BST */
    Node delete(Node root, int key) 
    { 
        /* Base Case: If the tree is empty */
        if (root == null)  return root; 
  
        /* Otherwise, recur down the tree */
        if (key < root.key) 
            root.left = delete(root.left, key); 
        else if (key > root.key) 
            root.right = delete(root.right, key); 
  
        // if key is same as root's key, then This is the node 
        // to be deleted 
        else
        { 
            // node with only one child or no child 
            if (root.left == null) 
                return root.right; 
            else if (root.right == null) 
                return root.left; 
  
            // node with two children: Get the inorder successor (smallest 
            // in the right subtree) 
            root.key = minValue(root.right); 
  
            // Delete the inorder successor 
            root.right = delete(root.right, root.key); 
        } 
  
        return root; 
    } 
  
    int minValue(Node root) 
    { 
        int minv = root.key; 
        while (root.left != null) 
        { 
            minv = root.left.key; 
            root = root.left; 
        } 
        return minv; 
    } 
  
    // This method mainly calls insertRec() 

  
    /* A recursive function to insert a new key in BST */
    Node insert(Node root, int key) 
    { 
  
        /* If the tree is empty, return a new node */
        if (root == null) 
        { 
            root = new Node(key); 
            return root; 
        } 
  
        /* Otherwise, recur down the tree */
        if (key < root.key) 
            root.left = insert(root.left, key); 
        else if (key > root.key) 
            root.right = insert(root.right, key); 
  
        /* return the (unchanged) node pointer */
        return root; 
    } 
  
    // This method mainly calls InorderRec() 
    void inOrder(Node root) 
    { 
        if (root != null) 
        { 
        	inOrder(root.left); 
            System.out.print(root.key + " "); 
            inOrder(root.right); 
        } 
    } 
 }