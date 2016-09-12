/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_structures_1;

/**
 *
 * @author Recreational
 */
public class Listing implements Comparable<Listing>{
    private String name;
    private int age;
    
    //Constructor
    public Listing(){
        
    }
    public Listing(String name, int age){
        this.name = name;
        this.age = age;
    }

    //Properties
    //Set the name
    void setName(String name){
        this.name = name;
    }
    
    //Set the age
    void setAge(int age){
        this.age = age;
    }
    
    //Return the name
    String getName(){
        return this.name;
    }
    
    //Get the age
    int getAge(){
        return this.age;
    }
    
    //Functions
    @Override
    public String toString(){
        return "Name: " + this.getName() + " Age: " + this.getAge();
    }
    
    public int compareTo(Listing other){
        //Compare by age
        if(this.age > other.age){
            return 1;
        }else if(this.age < other.age){
            return -1;
        }
        
        return 0;
    }
}
