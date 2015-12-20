import java.util.*;

public class PassingGrade{
	public static void main(String[] args){


	/* test case 0

	{55,77,82,60}
	{100,100,100,100}
	300
	Returns: 181
	If you score 181 points on the final, then you will finish the course with exactly 65% of the possible points.
	*/

	/* test case 1

    {1,2,3,4}
    {2,3,4,5}
    7
    Returns: 4
    If you score 4 points on the final, then you pass with 66.7% of the total possible points, but if you score 3 points on the final, then you fail with 61.9% of the possible points.
	*/

	/* test case 2
	{ 1, 2, 2, 1 }
	{ 9, 9, 9, 9 }
	9
	Returns: -1
	Even if you score 9 points on the final, you still fail with 33.3% of the possible points.

	*/

	/* test case 3

	3)	
    	
    { 7, 8, 7, 6 }
    { 8, 8, 8, 8 }
    9
    Returns: 0
    You will pass even if you score 0 points on the final.

    4) test case 4

    { 17, 23, 50, 200, 19, 56, 83, 91, 77, 9, 0 }
    { 20, 30, 50, 250, 20, 70, 100, 100, 100, 10, 10 } 
    400
    Returns: 129

    5) 

    {600,600,600,600,600,600,600,600,600,600,
    600,600,600,600,600,600,600,600,600,600}
    {1000,1000,1000,1000,1000,1000,1000,1000,
    1000,1000,1000,1000,1000,1000,1000,1000,
    1000,1000,1000,901}
    3000
    Returns: 2886

	*/
	
	int[] pointsEarned = {600,600,600,600,600,600,600,600,600,600,
    600,600,600,600,600,600,600,600,600,600};
	int[] pointsPossible = {1000,1000,1000,1000,1000,1000,1000,1000,
    1000,1000,1000,1000,1000,1000,1000,1000,
    1000,1000,1000,901} ;
	int finalExam = 3000;
	
	System.out.println(PassingGrade.pointsNeeded(pointsEarned, pointsPossible, finalExam));

	}

	public static int pointsNeeded(int[] pointsEarned,int[] pointsPossible,int finalExam){

        double passingThreshold = 0;
        int pointsTotal = 0;
        int pointsNeededToPass = 0;

		for(int i=0; i < pointsEarned.length; i++){
          pointsTotal += pointsEarned[i];
		}

		for(int i=0; i < pointsPossible.length; i++){
          passingThreshold += (double) pointsPossible[i];
		}

        passingThreshold += finalExam;
        passingThreshold = passingThreshold * .65;

        pointsNeededToPass = (int) passingThreshold - pointsTotal;

        if((pointsTotal + finalExam) < (int) passingThreshold){
        	return -1;
        }else if(pointsTotal > (int) passingThreshold){
        	return 0;
        }else{
        	return pointsNeededToPass;
        }

	}

	// create method intialize

	// create method calculate points needed to pass

}