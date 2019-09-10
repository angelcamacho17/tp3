package com;

import com.BinarySearchTree;
import java.util.*;
import com.AVLTree;

public class Main {

	 public static void main(String[] args)
	    {   
		 AVLTree tree = new AVLTree();  
		  
	        /* Constructing tree given in the above figure */
	        tree.root = tree.insert(tree.root, 1);  
	        tree.root = tree.insert(tree.root, 2);  
	        tree.root = tree.insert(tree.root, 3);  
	        tree.root = tree.insert(tree.root, 4);  
	        tree.root = tree.insert(tree.root, 5);  
	        tree.root = tree.insert(tree.root, 6);  
	        tree.root = tree.insert(tree.root, 7);  
	        tree.root = tree.insert(tree.root, 8);  
	        tree.root = tree.insert(tree.root, 9);  
		 	
	        Scanner scan = new Scanner(System.in);
	        Scanner scanElement = new Scanner(System.in);
	        // Creating object of AVLTree 
	        AVLTree avlt = new AVLTree(); 
	 
	        System.out.println("AVLTree Tree\n");  
            tree.inOrder(tree.root);
            System.out.println(""); 
	        char ch;
	        int choice=0;
	        // Perform tree operations  
	        
	        do    
	        {
	            System.out.println("\n1. Insertar dato ");
	            System.out.println("2. Borrar dato ");
	            System.out.println("3. Mostrar todos los datos ordenados con su FE");
	            System.out.println("4. Salir");
	            try {
	            choice = Integer.parseInt(scan.nextLine());        
	            
	            int element = 0;
	            switch (choice)
	            {
	            case 1 : 
	                System.out.println("Inserte un numero:");
	                try{
	                	element = Integer.parseInt(scanElement.nextLine());
	                	if (tree.search(tree.root,element)==null)       	
	                	tree.insert(tree.root,element);
	                	else 
	                		System.out.println("Ya existe ese elemento !");
	                	
	                }catch(Exception e) {
	                	System.out.println("El elemento debe ser un numero !");
	                }
	                break;                       
	            case 2 : 
	                System.out.println("Elemento a eliminar:");
	                try{
	                	element = Integer.parseInt(scanElement.nextLine());
	                	if (tree.search(tree.root,element)!=null) 
	                		tree.delete(tree.root,element );
	                	else 
	                		System.out.println("No existe ese elemento !");
	                }catch (Exception e) {
	                	System.out.println("El elementoa eliminar debe ser un numero !");
	                }
	                break;                                          
	            case 3 : 
	            	System.out.println("Arbol in order:");
	                tree.inOrder(tree.root);
	                break;         
	            default : 
	                System.out.println("Bye \n ");
	                break;   
	            }
	        }
	        catch (Exception e ) {
	        	System.out.println("Opcion no valida.");
	        }            
	        } while (choice!=4);  
	        
	    }

}
