package com;

public  class AVLNode {    
    AVLNode left, right;
    int key, height;  

    /* Constructor */
    public AVLNode(int n)
    {
        left = null;
        right = null;
        key = n;
        height = 0;
    }     
}
