import java.util.*;


/*

Needs fixing: 

1] when dealing with int precision becomes an issue. Use more accurate datatypes such as double, long, float.
2] use switch case for many different scenarios if you can. Code looks cleaner.
3] try to think of cases more clearly before you start coding.

Goal: Need to fit paper (width and length) into box (width and length).

Paper = P(w,l) where w = width, l = length
Box = B(w,l) where w = width, l = length

numFolds(P,B) = fewest number of folds P can fit into B.

You can rotate the paper 90 degrees if it will fit with fewer folds, but the paper must lie completely flat.

If paper cannot fit return -1

Constraints: Can fold upto 8 times.



Definition
    	
Class:	PaperFold
Method:	numFolds
Parameters:	int[], int[]
Returns:	int
Method signature:	int numFolds(int[] paper, int[] box)
(be sure your method is public)
    
 
Notes
-	After the paper is folded, it is possible that it has fractional dimensions.
-	The paper will fit into the box even if one or both of the dimensions are exactly the same as the corresponding box dimensions.
 
Constraints
-	paper will contain exactly two elements.
-	box will contain exactly two elements.
-	Each element of paper and box will be between 1 and 10000, inclusive.
 
Examples
0)	
    	
{8, 11}
{6, 10}
Returns: 1
By folding the paper so that the length is reduced from 11 to 5.5 inches, it will fit inside the box if you rotate it 90 degrees.
1)	
    	
{11, 17}
{6, 4}
Returns: 4
There are two ways to fold the paper so that it fits within the box.

First, you could fold the width in half to get 5.5 inches, and then fold the length in half three times to get 2.125 inches.

Second, you could fold the width in half twice to get 2.25 inches, and then fold the length in half twice to get 4.25 inches. In this case, you must also rotate 90 degrees to fit the paper in.

2)	
    	
{11, 17}
{5, 4}
Returns: 4
Now, you must use the second method to get it to fit: Fold the width and length each twice, and rotate 90 degrees. If you try fitting without rotating, it would take 5 folds.
3)	
    	
{1000,1000}
{62,63}
Returns: -1
Folding in each direction 4 times, you can get the paper down to 62.5 x 62.5. However, this will not fit into the box because neither dimension fits in 62.
4)	
    	
{100,30}
{60,110}
Returns: 0
5)	
    	
{1895, 6416}
{401, 1000}
Returns: 5

*/
public class PaperFold{
	public static void main(String[] args){
	
    /* test case 1
    int[] paper = {8, 11}; 
    int[] box = {6, 10};
    */

    /* test case 2
    int[] paper = {11, 17}; 
    int[] box = {6, 4};
    */

    /* test case 3
    int[] paper = {1000,1000};
    int[] box = {62, 63};
    */

    /* test case 4
    int[] paper = {100,30};
    int[] box = {60,110};
    */

    /* test case 5 */
    int[] paper = {1895, 6416};
    int[] box = {401, 1000};

    System.out.println("paper: " + Arrays.toString(paper));

    System.out.println("box: " + Arrays.toString(box));

    System.out.println(PaperFold.numFolds(paper,box));

	}	

  private static int numFolds = 0;

  public static int numFolds(int[] paper, int[] box){

    int paperWidth = paper[0];
    int paperLength = paper[1];

    int boxWidth = box[0];
    int boxLength = box[1];

    // check original
    // if current paperWidth <= current boxWidth && current paperLength <= current boxLength return numFolds

    // check 90 degree
    // if current paperLength <= current boxWidth && current paperWidth <= current boxLength return numFolds

    // fold original
    // if current paperLength / 2 <= current boxWidth && current paperWidth <= current boxLength then numFolds++ return numFolds

    // fold 90
    // if current paperWidth / 2 <= current boxWidth && current paperLength <= current boxLength then numFolds++ return numFolds

    if(paperWidth == 0 || paperLength == 0) return -1;

    if(paperWidth <= boxWidth && paperLength <= boxLength){

       System.out.println("case 1: original");
       System.out.println("paperWidth: " + paperWidth);
       System.out.println("paperLength: " + paperLength);

       return numFolds;

    }else if(paperLength <= boxWidth && paperWidth <= boxLength){

      System.out.println("case 2: rotated ");
      System.out.println("paperWidth: " + paperWidth);
      System.out.println("paperLength: " + paperLength);

      return numFolds;

    } else if(paperWidth > boxWidth){
    
       paper[0] = paperWidth / 2;
       numFolds++;

       System.out.println("case 3: folded width ");
       System.out.println("paperWidth: " + paperWidth);
       System.out.println("paperLength: " + paperLength);

       return numFolds(paper, box);

    } else if(paperLength > boxLength){
       paper[1] = paperLength / 2;
       numFolds++;

       System.out.println("case 4: folded length ");
       System.out.println("paperWidth: " + paperWidth);
       System.out.println("paperLength: " + paperLength);

       return numFolds(paper, box);
    }

    return -1;

  }
}