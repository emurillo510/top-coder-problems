import java.util.*;


public class MatchMaking {

    public static void main(String[]args){

    	String [] namesWomen = {"Constance", "Bertha", "Alice"};
    	String [] answersWomen = {"aaba", "baab", "aaaa"};

    	String [] namesMen = {"Chip", "Biff", "Abe"};
    	String [] answersMen = {"bbaa", "baaa", "aaab"};

    	String queryWomen = "Bertha";

    	System.out.println(MatchMaking.makeMatch(namesWomen, answersWomen, namesMen, answersMen, queryWomen));


    }


    /*

    	Goal: Match men with women from maximum number of common answers.

    	Details: 

    	1] Names in each sex are unique.
    	2] equal number of men and women
    	3] take the lexicographic order
    	4] maximum number of common answers
    	5] remove couple from pool and repeat.

    	alexis barbie carita

    	aaba   baab   aaaa
	
		alfred borris capernick

		bbaa   baaa   aaab

		
		create dictionaries for each sex
		sort dictionaries

		compare answers for each women to each man

		return man name


	

    */
    public static String makeMatch(String [] namesWomen, String [] answersWomen, String[] namesMen, String[] answersMen, String queryWomen){

    	String matchedMan = "";

    	/* initialize */
    	Map<String,String> namesWomenTable = new TreeMap<String,String>();
    	for(int i=0; i < namesWomen.length; i++){
    		namesWomenTable.put(namesWomen[i], answersWomen[i]);
    	}



    	Map<String,String> namesMenTable = new TreeMap<String,String>();
    	for(int i=0; i < namesMen.length; i++){
    		namesMenTable.put(namesMen[i], answersMen[i]);
    	}

    	/* find max pair*/
    	
    	
        for(Map.Entry womanEntry: namesWomenTable.entrySet()){

            
            int maxAnswers = 0;
            String maxAnswersName = "";
            int index = 0;
            System.out.println("Current Women: " + womanEntry.getKey() + "," + womanEntry.getValue());

            for(Map.Entry maleEntry: namesMenTable.entrySet()){
                System.out.println("Male : " + maleEntry.getKey() + "," + maleEntry.getValue());

                int answerCount = 0;
                String manAnswer = (String) maleEntry.getValue();
                String womanAnswer = (String) womanEntry.getValue();


                for(int i=0; i < manAnswer.length(); i++){
                    char manCurrentAnswer = manAnswer.charAt(i);
                    char womanCurrentAnswer = womanAnswer.charAt(i);
                    System.out.println("Man: " + manCurrentAnswer);
                    System.out.println("Woman: " + womanCurrentAnswer);
                    if(manCurrentAnswer == womanCurrentAnswer){
                        answerCount++;
                    }
                }

                // if needed update max value and perfect match index
                if(Math.max(maxAnswers, answerCount) == answerCount){
                    maxAnswers = answerCount;
                    maxAnswersName = (String) maleEntry.getKey();

                }

                System.out.println(maxAnswersName);
                System.out.println(maxAnswers);

                index++;
            }
        }

    	return matchedMan;
    }
}
