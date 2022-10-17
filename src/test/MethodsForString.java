package test;
import help.HelperException;
import util.CheckUtils;
import java.util.Objects;

public class MethodsForString {
	  
    //String length finding method
    public int findStringLength(String findLength) throws HelperException {
    	CheckUtils.nullCheck(findLength);
        return findLength.length();
    } 
    //String to character array
    public char[] convertStringToChar(String findString) throws HelperException {
    	CheckUtils.nullCheck(findString);
        return findString.toCharArray();
    }
    //last character of the array
    public char findLastCharacter(String findString) throws HelperException {
        int length = findStringLength(findString);
        return  findString.charAt(length - 1);
    }
    //count occurrences of the given character in string
    public int countOccurrences(String findString, char findChar) throws HelperException {
    	CheckUtils.nullCheck(findString);
        int count = 0; 
        char[] getString = findString.toCharArray(); 
        for (int i = 0; i <= getString.length; i++) {
            if (getString[i] == findChar) {
                count++;
            }
        }
        return count;
    }
    //position of character in string
    public int findGreatestPosition(String findString, char findChar) throws HelperException {
    	CheckUtils.nullCheck(findString);
        return findString.lastIndexOf(findChar);
    }
    
    //print last n characters
    public String printLastNcharacters(String findString, int nthPosition) throws HelperException {
        int length = findStringLength(findString);
        CheckUtils.checkPosition(length,nthPosition);
        return findString.substring(length - nthPosition, length);
    }
    //print first n characters
    public String printFirstNcharacters(String findString, int nthPosition) throws HelperException {
        int length = findStringLength(findString);
        CheckUtils.checkPosition(length,nthPosition);
        return findString.substring(0, nthPosition);        
    }
    //String replace
    public String replaceString(String baseString, String changeString, String tempString) throws HelperException {
    	CheckUtils.nullCheck(changeString);
        return baseString.replaceFirst(tempString, changeString);
        
    }
    //check string starts with
    public boolean checkStartsWith(String findString, String checkString) throws HelperException {
    	CheckUtils.nullCheck(findString);
    	CheckUtils.nullCheck(checkString);
        return findString.startsWith(checkString);
    }
    //check string ends with
    public boolean checkEndsWith(String findString, String checkString) throws HelperException {
    	CheckUtils.nullCheck(findString);
    	CheckUtils.nullCheck(checkString);
        return findString.endsWith(checkString);
    }
    //convert string to uppercase
    public String upperCase(String changeString) throws HelperException {
    	CheckUtils.nullCheck(changeString);
    	CheckUtils.checkEmpty(changeString);
        return changeString.toUpperCase();
    }
    //convert string to lowercase
    public String lowerCase(String changeString) throws HelperException {
    	CheckUtils.nullCheck(changeString);
    	CheckUtils.checkEmpty(changeString);
        return changeString.toLowerCase();
    }
    //reverse string
    public String reverseString(String baseString) throws HelperException {
    	char[] characterArray=convertStringToChar(baseString);
    	int length=characterArray.length,j=length-1;
    	for(int i=0;i<length/2;i++) {
    		if(i<=j) {
    			char temp=characterArray[i];
    			characterArray[i]=characterArray[j];
    			characterArray[j]=temp;
    			j--;
    		}
    	}
        return baseString.valueOf(characterArray);
    }
    public String[] splitString(String stringToSplit) throws HelperException {
    	CheckUtils.nullCheck(stringToSplit);
        return stringToSplit.split(" ");
    }
    public String removeWhiteSpace(String spaceRemover) throws HelperException {
    	CheckUtils.nullCheck(spaceRemover);
        return spaceRemover.replace(" ", "");
    }
    public String mergeStringWithChar(String[] baseString, String symbol) throws HelperException {
    	CheckUtils.nullCheck(baseString);
        String finalString="";
        finalString=finalString.join(symbol,baseString);
        return finalString;
    }
    public boolean checkStringEquals(String firstString, String secondString) throws HelperException {
    	CheckUtils.nullCheck(firstString);
    	CheckUtils.nullCheck(secondString);
        return firstString.equals(secondString);
    }
    public boolean checkStringEqualsWithOutCase(String firstString, String secondString) throws HelperException {
    	CheckUtils.nullCheck(firstString);
    	CheckUtils.nullCheck(secondString);
        return firstString.equalsIgnoreCase(secondString);
    }
    public String removeSpaceOnEdges(String changeString) throws HelperException {
    	CheckUtils.nullCheck(changeString);
        return changeString.trim();
    }
}