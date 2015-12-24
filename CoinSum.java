import java.util.*;

public class CoinSum{

	public static void main(String[] args){

        int[] coins = {1,3,5};
        int sum = 11;
        //int[] coins = {1,5,10,25};
        //int sum = 61;
		System.out.println(CoinSum.minNumOfCoins(coins,sum));
       
	}

    /* This procedure requires extra space proportional to the amount. This may not always be possible. However, this algorithm is linear in time .*/
	public static int minNumOfCoins(int[] coins, int sum){

		/* variable declaration */
        final int MAX_LENGTH = sum;
        int[] min = new int[MAX_LENGTH+1];

        /* initialization */
        for(int i=0; i<=MAX_LENGTH; i++){
           min[i] = Integer.MAX_VALUE;
        }


        /* dynamic programming using tabulation: for every sum determine every minimum mumber of coins used to get that sum for every. */
        min[0] =0;
        for(int i=1; i<=MAX_LENGTH; i++){
              System.out.println("current sum: " + i);
              for(int j=0; j<coins.length; j++){              	
              	if(coins[j]<= i){
              		if(min[i-coins[j]]+1 < min[i]){
                      min[i] = min[i-coins[j]]+1;
              		}
                  System.out.println("current min number of coins: " + min[i]);
              	}
              }
        }

        /* return the minumum number of coins used for sum 11*/
		return min[MAX_LENGTH];
	}
}