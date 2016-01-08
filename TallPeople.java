import java.util.*;
import java.lang.*;

/* 

   A group of people stand before you arranged in rows and columns. 
   Looking from above, they form an R by C rectangle of people.

   Given:  

   You will be given a String[] people containing the height of each person.

   Elements of people correspond to rows in the rectangle. 
   Each element contains a space-delimited list of integers 
   representing the heights of the people in that row.

   Your job is to return 2 specific heights in a int[].
   
   The first is computed by finding the shortest person in each row, 
   and then finding the tallest person among them (the "tallest-of-the-shortest").
   
   The second is computed by finding the tallest person in each column, 
   and then finding the shortest person among them (the "shortest-of-the-tallest").

*/

public class TallPeople {

	public static void main(String[] args){

       String[] people = {"9 2 3","4 8 7"};

       System.out.println(Arrays.toString(getPeople(people)));


	}

	public static int[] getPeople(String[] people){

      final int ROW_LENGTH = people.length;
      final int COLUMN_LENGTH = people[0].split(" ").length;

      int[][]lookupTable = new int[ROW_LENGTH+COLUMN_LENGTH][2];

      for(int i=0; i<lookupTable.length; i++){
        lookupTable[i][0] = Integer.MIN_VALUE;
        lookupTable[i][1] = Integer.MAX_VALUE;
      }

      for(int i=1; i<=ROW_LENGTH; i++){
        String[] rowPerson = people[i-1].trim().split(" ");
        int shortest = Integer.MAX_VALUE;
        for(int j = 0; j < COLUMN_LENGTH; j++){
          shortest = Math.min(shortest, Integer.parseInt(rowPerson[j]));
        }
        lookupTable[i][0] = Math.max(shortest, lookupTable[i-1][0]);
      }

      for(int i=1; i<=COLUMN_LENGTH; i++){
      	int tallest = Integer.MIN_VALUE;
        for(int j=0; j<ROW_LENGTH; j++){
          String[] rowPerson = people[j].trim().split(" ");
          tallest =  Math.max(tallest, Integer.parseInt(rowPerson[i-1]));
        }
          lookupTable[i][1] = Math.min(tallest, lookupTable[i-1][1]);
      }

	  return new int[]{ lookupTable[ROW_LENGTH][0], lookupTable[COLUMN_LENGTH][1]};
	}


	/* lessons learned:
    
       - need more practice parsing two-dimensional arrays.
       - write pseudocode before implementation
       - finally understand how to use tabulation and maybe dynamic programming via bottom-up approach.
       - making progressions with this algorithm thang!

	*/

}