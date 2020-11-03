/*******************************************************************************
* Name: Feras
* Description: A O(n) time program that prompts the user to enter a 
* sequence of integers ending with 0 and find the longest subsequence 
* with the same number.
 ******************************************************************************/

import java.util.ArrayList;
import java.util.Scanner;

public class SameNumberSubsequence {
    public static void main(String[] args) {
    //Scanner object
    Scanner input = new Scanner(System.in);
    
    //prompt user for input
    System.out.print("Enter a series of numbers ending with 0: ");
    
    //ArrayList to store user input list
    ArrayList<Integer> list = new ArrayList<>();
    
    //While true to store user input into list array
    while (true) {
      int num = input.nextInt();
      if (num == 0) { //if input value = 0 then break loop
          break; 
      }//end if
      
      list.add(num); //add values to loop 
    }//end while loop

    int index = 0; //intitial array index
    int value = list.get(index); //retireve element in index
    int count = 1; //number of counts
    int maxIndexSeq = index; //max index 
    int maxValueSeq = value; //max value
    int maxCountSeq = count; //max number of counts
    
    //Array to find the sequence
    for (int i = 1; i < list.size(); i++) {
      if (list.get(i) == value) {
        count++;
        if (count > maxCountSeq) {
          if (maxIndexSeq != index){ 
              maxIndexSeq= index; 
            }//end inner inner if
          maxValueSeq = list.get(i);
          maxCountSeq = count;
        }//end inner if
      }//end outer if
      else {
        index = i;
        value = list.get(i);
        count = 1;
      }//end outer else
    }//end for loop

    //Display the result to user
    System.out.println("The longest same number sequence starts at index " +
      maxIndexSeq + " with " + maxCountSeq + " values of " + maxValueSeq);
    
  }//end main 
}//end class
 
