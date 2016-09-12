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
public class DataStructure<T>{

    //Variables
    private T[] data;
    private int size = 100;
    private int next = 0;


    //Constructors
    public DataStructure(){
        //Calls the DataStructure(int) constructor
        this(100);
    }
    
    @SuppressWarnings("unchecked")
    public DataStructure(int size){
        //Create the size
        this.size = size;
        this.next = 0;
        
        this.data = (T[])new Object[size];
    }
    
    //Functions
    public void addListing(T newListing){
        data[next++] = newListing;
    }
    
    public void showAllListings(){
        for(int i = 0;i < next;i++){
            System.out.println(data[i].toString());  
        }
    }
    
    private void iSort(){
    
    }
}
