import java.util.Scanner;
/**
 * ask user for heights, get the average, tell the user the heights above the average
 * @author Graham Ellacott
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //make a Scanner for user input
    Scanner input = new Scanner(System.in);

    //initialize variables
    int numHeights;//how many heights the user will enter
    int sum = 0; //the sum of all the given heights
    int average; //the average of all the given heights

    //ask user for number of heights
    System.out.println("How many heights would you like to enter");
    numHeights = input.nextInt();

    //create the heights array
    int[] heights = new int[numHeights];

    //ask user to enter heights
    System.out.println("Please enter the heights on separate lines");

    //make a loop to store all the heights in the array
    for(int i = 0; i < heights.length; i++){
      //store it in the correct index
      heights[i] = input.nextInt();
      //add that to the sum
      sum += heights[i];
    }

    //get the average
    average = sum / numHeights;

    //tell the user the average
    System.out.println("The average height is " + average + " cm");

    //tell user the heights above average
    System.out.println("The heights above average are");

    //make a loop to check if the heights are above average
    for(int i = 0; i < heights.length; i++){
      //check if height is above average
      if (heights[i] > average){
        //tell the user that height
        System.out.println(heights[i]);
      }
    }


    
  }
}
