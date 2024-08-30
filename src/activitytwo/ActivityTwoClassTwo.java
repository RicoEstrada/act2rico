/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package activitytwo;

import java.util.Scanner;
import java.util.Stack;
public class ActivityTwoClassTwo {

    /**
     * @param args the command line arguments
     */
    public static void main (String[] args){
            
        Scanner scn = new Scanner(System.in);
        System.out.println("size of Stack: ");
        int Size = scn.nextInt();
        ActivityTwoClassOne stack = new ActivityTwoClassOne(Size);
        
        System.out.println("Enter Element for the Stacks: ");
        stack.inputArray(scn);

        
        System.out.println("Display Stack");
        stack.display();
        
        
       
        // Peek and bottom 
        System.out.println("PEEK: " + stack.peek());
        System.out.println("BOTTOM: " + stack.findbot());
        
        // count
        System.out.println("Number of stack elements: " + stack.count());
        
        // popping Stacks
        System.out.println("POP ELEMENT: " + stack.pop());
        stack.display();
     
        // problem #3
        stack.RemoveDuplicate();
        System.out.println("*REMOVING DUPLICATION*");
        stack.display();
        
        System.out.println("Add Stack here ");
        
        System.out.println("Enter Stack: ");
        
        stack.addstack(scn);
        stack.display();
        
        
        scn.close();
    }  
}
