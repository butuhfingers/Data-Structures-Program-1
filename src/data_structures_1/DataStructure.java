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
public class DataStructure<E extends Comparable<E>>{

    //Variables
    private E[] data;
    private int size = 100;
    private int next = 0;


    //Constructors
    public DataStructure(){
        this(100);
    }
    
    @SuppressWarnings("unchecked")
    public DataStructure(int size){
        //Create the size
        this.size = size;
        this.next = 0;
        
        this.data = (E[])new Object[size];
    }
    
    //Functions
    public void addElt(E element){
        data[next] = element;
        
        System.out.println("Added element");
        //This will force it to overwrite the last element
        if(next != size){
            next++;
        }     
    }
    
    public void showAllListings(){
        for(int i = 0;i < data.length;i++){
            System.out.println(data.toString());
        }
    }
    
    private void iSort(){}
}
