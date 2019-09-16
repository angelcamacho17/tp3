package com;

import com.Node;

public class BinarySearchTree 
{  
        public Node root;
    
        /* Constructor */
        public BinarySearchTree()
        {
            root = null;
        }
        /* Function to check if tree is empty */
        public boolean isEmpty()
        {
            return root == null;
        }
        /* Functions to insert data */
        public boolean insert(int data)
        {
            root = insert(root, data);
            return true;
        }
        /* Function to insert data recursively */
        private Node insert(Node node, int data)
        {
            if (node == null)
                node = new Node(data,null);
            else
            {
                if (data <= node.key)
                    node.left = insert(node.left, data);
                else
                    node.right = insert(node.right, data);
            }
            return node;
        }
        /* Functions to delete data */
        public void delete(int k)
        {
            if (isEmpty())
                System.out.println("Tree Empty");
            else if (search(k) == false)
                System.out.println("Sorry "+ k +" is not present");
            else
            {
                root = delete(root, k);
                System.out.println(k+ " deleted from the tree");
            }
        }
        private Node delete(Node root, int k)
        {
            Node p, p2, n;
            if (root.key == k)
            {
                Node lt, rt;
                lt = root.left;
                rt = root.right;
                if (lt == null && rt == null)
                    return null;
                else if (lt == null)
                {
                    p = rt;
                    return p;
                }
                else if (rt == null)
                {
                    p = lt;
                    return p;
                }
                else
                {
                    p2 = rt;
                    p = rt;
                    while (p.left != null)
                        p = p.left;
                    p.left=lt;
                    return p2;
                }
            }
            if (k < root.key)
            {
                n = delete(root.left, k);
                root.left=n;
            }
            else
            {
                n = delete(root.right, k);
                root.right=n;             
            }
            return root;
        }
        /* Functions to count number of nodes */
        public int countNodes()
        {
            return countNodes(root);
        }
        /* Function to count number of nodes recursively */
        private int countNodes(Node r)
        {
            if (r == null)
                return 0;
            else
            {
                int l = 1;
                l += countNodes(r.left);
                l += countNodes(r.right);
                return l;
            }
        }
        /* Functions to search for an element */
        public boolean search(int val)
        {
            return search(root, val);
        }
        /* Function to search for an element recursively */
        private boolean search(Node r, int val)
        {
            boolean found = false;
            while ((r != null) && !found)
            {
                int rval = r.key;
                if (val < rval)
                    r = r.left;
                else if (val > rval)
                    r = r.right;
                else
                {
                    found = true;
                    break;
                }
                found = search(r, val);
            }
            return found;
        }
        /* Function for inorder traversal */
        
        public void inOrder(Node r)
        {
            if (r != null)
            {
                inOrder(r.left);
                System.out.print(r.key +" ");
                inOrder(r.right);
            }
        }
        public void preOrder(Node r)
        {
            if (r != null)
            {
                System.out.print(r.key +" ");
                preOrder(r.left);             
                preOrder(r.right);
            }
        }
        public void postOrder(Node r)
        {
            if (r != null)
            {
                postOrder(r.left);             
                postOrder(r.right);
                System.out.print(r.key +" ");
            }
        }     
}
 