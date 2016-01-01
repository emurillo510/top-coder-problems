import java.util.*;


/*

The old song declares "Go ahead and hate your neighbor", and the residents of 
Onetinville have taken those words to heart. Every resident hates his next-door neighbors 
on both sides. Nobody is willing to live farther away from the town's well than his 
neighbors, so the town has been arranged in a big circle around the well. 
Unfortunately, the town's well is in disrepair and needs to be restored. 
You have been hired to collect donations for the Save Our Well fund.

Each of the town's residents is willing to donate a certain amount, 
as specified in the int[] donations, which is listed in clockwise order around the well. 
However, nobody is willing to contribute to a fund to which his neighbor has also contributed. 
Next-door neighbors are always listed consecutively in donations, except that the first 
and last entries in donations are also for next-door neighbors. 
You must calculate and return the maximum amount of donations that can be collected.

Definition
    	
Class:	BadNeighbors
Method:	maxDonations
Parameters:	int[]
Returns:	int
Method signature:	int maxDonations(int[] donations)
(be sure your method is public)
    
 
Constraints
-	donations contains between 2 and 40 elements, inclusive.
-	Each element in donations is between 1 and 1000, inclusive.

*/
public class BadNeighbors{

	public static void main(String[] args){


      int[] donations = { 94, 40 };
      
      System.out.println(new BadNeighbors().maxDonations(donations));

      //System.out.println(new BadNeighbors().recursion(donations));
	}


    

    /* 
       dp bottom up approach 
       //maxDonations({})
       //maxDonations({1})
       //maxDonations({1,2})
       //maxDonations({1,2,3})
       maxDonation(i) = Max(maxDonation(i-1), maxDonation(i-2) + donations[i])

    */
	public int maxDonations(int[] donations){

      int N = donations.length;
	  int[] answerTable = new int[N];

      if(N == 0) return 0;
      if(N == 1) return donations[0];

	  answerTable[0] = donations[0];
	  answerTable[1] = Math.max(donations[0], donations[1]);
      // maxDonation(i) = Max(maxDonation(i-1), maxDonation(i-2) + donations[i])
	  for(int i=2; i < N; i++){
        answerTable[i] = Math.max(answerTable[i-1], answerTable[i-2] + donations[i]);   
	  }

      //return answerTable[N-1]; // not considering first and last neighbors
      return answerTable[N-2]; // considering first and last are neighbors
	}
	
}