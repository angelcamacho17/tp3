package com;

import com.BinarySearchTree;
import java.util.*;
import com.AVLTree;

public class Main {

	 public static void main(String[] args)
	    {   
		 AVLTree tree = new AVLTree();  
		 //BinarySearchTree tree = new BinarySearchTree();
		  
	        /* Constructing tree given in the above figure */
		 	tree.insert(1);  
		 	tree.insert(2);  
		 	tree.insert(3);  
		 	tree.insert(4);  
		 	tree.insert(5);  
		 	tree.insert(6);  
		 	tree.insert(7);  
		 	tree.insert(8);  
		 	tree.insert(9);  
		 	
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
	                	if (!tree.search(element))       	
	                	tree.insert(element);
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
	                	if (tree.search(element)) 
	                		tree.delete(element );
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
	            case 4 : 
	            	System.out.println("Bye. ");
	                break; 
	            default : 
	                System.out.println("Opcion no valida. ");
	                break;   
	            }
	        }
	        catch (Exception e ) {
	        	System.out.println("Opcion no valida.");
	        }            
	        } while (choice!=4);  
	        
	    }

}
