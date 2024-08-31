/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activitytwo;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;
/**
 *
 * @author ACER NITRO 5
 */
public class ActivityTwoClassOne {
    private int maxSize;
    private int top;
    private int[] StackArray;
    
    
    public ActivityTwoClassOne(int Size){
        
        maxSize = Size;
        StackArray = new int [maxSize];
        top = -1;
        
        
    }
    //problem #1
    public void push(int numVal){
        if (!isFull()){
            StackArray[++top] = numVal;
        }else {
            System.out.println("Your Stack is full hehe");
        }
    }
    public double pop(){
        if (!isEmpty()){
            return StackArray[top--];
        }else {
            System.out.println("your stack is empty");
            return -1;
        }
    }
    public double peek(){
        if (!isEmpty()){
            return StackArray[top];
        }else {
            System.out.println("Top Stack is Empty");
            return -1;
        }
    }
    //Problem #2
    public int count(){
         return top + 1;
    }
    //problem #4
    public double findbot() {
        if(!isEmpty()) {
            return StackArray[0];
        }
        else {
            System.out.println("BOT IS EMPTY.");
            return -1;
        }
    }
    
    public boolean isEmpty(){
        return (top == -1);
    }
    public boolean isFull() {
        return (top == maxSize - 1);
    }
    
    //problem #5
    public void addstack(Scanner scn) {
        System.out.println("Enter new Stake Size: ");
        int newSize = scn.nextInt();
        int[] newStackArray = new int[maxSize + newSize];
        System.out.println("Enter your Elements");
        for (int i = 0 ; i <= top ; i++){
            newStackArray[i] =  StackArray[i];
        }
        for (int i= 0 ; i< newSize; i++){
            newStackArray[++top] = scn.nextInt();
        }
        maxSize +=  newSize;
        StackArray = newStackArray;
        
        
   
    }
    public void inputArray(Scanner scn){
        System.out.println("Enter add: " + (top + 1) );
        for (int i = 0 ; i < maxSize ; i++){
        System.out.println("Enter Element " + (i + 1)+ ": ");
        StackArray[i] = scn.nextInt();
        
        }
        top = maxSize -1;
    }
    //problem #3
    public void RemoveDuplicate(){
        HashSet <Integer> set = new HashSet<>();
        int index = 0;
        for (int i = 0 ; i <= top ; i++){
           if (set.add(StackArray[i])){
               StackArray[index++] = StackArray[i];
           }
           
       }
        top = index -1;
    }
    
    public void display(){
        if(!isEmpty()){
            System.out.println("Element of Stack: ");
            for (int i = top ; i >= 0 ; i--){
                System.out.println(StackArray[i] + " ");
            }
            System.out.println();
        }else{
            System.out.println("Element of the Stack is Empty");
        }
    }
}