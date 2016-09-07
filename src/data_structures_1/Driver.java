/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_structures_1;
import java.util.Scanner;

/**
 *
 * @author Recreational
 */
public class Driver {
    private static DataStructure<Listing> struct = new DataStructure<>();
    
    public static void main(String args[]){
        //Create the data structure
        
        
        //Scan for input
        Scanner in = new Scanner(System.in);

        while(in.hasNext()) {
            String line = in.nextLine();
            
            String[] stats = parseInput(line);
            addPerson(stats[0], Integer.parseInt(stats[1]));
            
            struct.showAllListings();
        }
    }
    
    //This will return a name and an age in string form
    private static String[] parseInput(String input){
        //Create the parsed input string
        String[] parsedInput = new String[2];
        
        //Set the values
        parsedInput[0] = input.substring(0, input.indexOf(','));
        parsedInput[1] = input.substring(input.indexOf(',') + 1, input.length());
        
        //For each input parse it
        for(int i = 0;i < parsedInput.length;i++){
            parsedInput[i] = parsedInput[i].trim();
        }
        
        return parsedInput;
    }
    
    private static void addPerson(String name, int age){
        struct.addElt(new Listing(name, age));
    }
}
