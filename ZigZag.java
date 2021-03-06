import java.util.*;

public class ZigZag{
	public static void main(String[] args){
	   /*
       int[] sequence = {1,7,4,9,2,5};       
       System.out.println(longestZigZag(sequence));
       */

       int[] sequence = { 1, 17, 5, 10, 13, 15, 10, 5, 16, 8 };

       System.out.println(longestZigZag(sequence));
	}

    /*

    1,7,4,9,2,5 is a zig-zag sequence because the differences (6,-3,5,-7,3) are 
    alternately positive and negative. 
  
    In contrast, 1,4,7,2,5 and 1,7,4,5,5 are not zig-zag sequences, 
    the first because its first two differences are positive and the second because its 
    last difference is zero.

    Given a sequence of integers, sequence, return the length of the longest 
    subsequence of sequence that is a zig-zag sequence. A subsequence is obtained 
    by deleting some number of elements (possibly zero) from the original sequence, 
    leaving the remaining elements in their original order.

    */

	public static int longestZigZag(int[] A){

      /* initialization */
	  int longestSequence = 1;
      
      int n = A.length;
      int[][] Z = new int[n][2];
     
      /* build zigzag table */
      for(int i = 0; i < Z.length; i++){
        Z[i] = new int[2];
      }
      Z[0][0] = 1;
      Z[0][1] = 1;

      /* build longest sequence table for ith element by starting from ith to going to 0 */
	  for(int i = 1; i < n; i++){
	    for(int j = i-1; j>= 0; j--){
	      // if current is greater than less populate Max of Z[j][1] (odd) or current Z[i][0]
	      if(A[j] < A[i]) Z[i][0] = Math.max(Z[j][1]+1,Z[i][0]);
	      // if current is greater than less populate Max of Z[j][0] (even) or current Z[i][1]
	      if(A[j] > A[i]) Z[i][1] = Math.max(Z[j][0]+1, Z[i][1]);
	    }
	    /* keep track of longestSequence longest zigzag */
	    longestSequence = Math.max(longestSequence, Math.max(Z[i][0],Z[i][1]));
	  }

      return longestSequence;
     }

}