import java.util.*;

public class Yahtzee{
	public static void main(String[] args){

		/* test case 1 */
		//int[] dice = { 2, 2, 3, 5, 4 };
		//int active = 5;

		/* test case 2 */
		//int[] dice = { 6, 4, 1, 1, 3 };
		//int active = 1;

		/* test case 3 */
		//int[] dice = { 6, 4, 1, 1, 3 };
		//int active = 3;

		/* test case 4 */
		//int[] dice = { 6, 4, 1, 1, 3 };
		//int active = 4;

		/* test case 5 */
		int[] dice = { 6, 4, 1, 1, 3 };
		int active = 6;

		/* test case 6 */
		//int[] dice = {5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,35,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,35,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,3,5,3,5,3,5,3,5,3,5,3,5,3,5,3,5,3,5,3,5,3,5,3,5,3,5,3,5,3,5,3,5,3,5,3,5,3,5,3,5,3,5,3,5};
		//int active = 5;

		System.out.println(Yahtzee.toss(dice, active));
	}

	public static int toss(int[] dice, int active){
		
		int maxScore = 0;

		Arrays.sort(dice);	

		boolean activeFound = false;
		for(int current: dice){	
			if(current != active && activeFound){
				break;
			} else if(current == active){
				activeFound = true;
				maxScore += current;
			}
		}

		return maxScore;
	}
}