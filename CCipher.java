public class CCipher{
	
	public static void main(String[] args){
 
		/* test case 0
		0)	
    	  "VQREQFGT"
          2
          Returns: "TOPCODER"

          String input = "VQREQFGT";
          int shift = 2;
        */

        /* test case 1

        1)	
    	
          "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
          10
          Returns: "QRSTUVWXYZABCDEFGHIJKLMNOP"

        */

        /* test case 2 

		"TOPCODER"
		0
		Returns: "TOPCODER"

        */

        /* test case 3

          3)	
    	
          "ZWBGLZ"
          25
          Returns: "AXCHMA"


        */

        /* test case 4 

          4)	
    	
          "DBNPCBQ"
          1
          Returns: "CAMOBAP"

        */


        /* test case 5

        5)	
    	
           "LIPPSASVPH"
           4
           Returns: "HELLOWORLD"

        */
        String input = "LIPPSASVPH";
        int shift = 4;

		System.out.println(CCipher.decode(input,shift));
	}

	public static String decode(String input, int shift){
    
        String output = "";

        int currentCharAscii = 0;
        char currentChar = ' ';

        for(int i=0; i < input.length(); i++){
        	
        	currentCharAscii = (int) input.charAt(i) - shift;

        	if(currentCharAscii < (int) 'A'){
            currentCharAscii = currentCharAscii + 26;
            currentChar = (char) currentCharAscii;
        	} else {
        		currentChar = (char) currentCharAscii;
        	}

        	output += currentChar;
        }



		return output;
	}
}