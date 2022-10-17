package main;
import test.MethodsForString;
import help.HelperException;
import java.util.Scanner;
import java.util.Arrays;
public class RunnerForString {
    static Scanner sc = new Scanner(System.in);
    public static String getString() {
        System.out.println("Enter the string  ");
        String inputString = sc.next();
        return inputString;
    }
    public static char getChar() {
        System.out.println("Enter the char  ");
        char inputChar = sc.next().charAt(0);
        return inputChar;
    }
    public static int getInt(){
    	System.out.println("Enter the int");
    	int inputInteger=sc.nextInt();
    	return inputInteger;
    }
    public static int getIntInput(int inputInteger) {
        boolean flag = true;
        while (flag) {
            if (sc.hasNextInt()) {
                inputInteger = sc.nextInt();
                flag = false;
            } else {
                sc.next();
                System.out.println("enter the Integer value from 1 to 20..");
            }
        }
        return inputInteger;
    }
    public static void main(String[] args) {
        MethodsForString t3 = new MethodsForString();
        boolean flag = true;
        do {
            int choice = 0;
            System.out.println("Enter the choice from 1 to 19 ");
            System.out.println("0 for exit");
            choice = getIntInput(choice);
            try {
                switch (choice) {
                    case 0: {
                        System.out.println("Thank you..");
                        flag = false;
                        break;
                    }
                    case 1: {
                        if(args.length>0){
			    int length = t3.findStringLength(args[0]);
			    System.out.println(args[0] + " length is" + length);
			    }
			else{
			    throw new HelperException("Use the terminal to get input string..");
			    }
                        break;
                    }
                    case 2: {
                    	String passString=getString();
                        char[] charString = t3.convertStringToChar(passString);
                        System.out.println(Arrays.toString(charString));
                        break;
                    }
                    case 3: {
                        String stringPass = getString();
                        char Character = t3.findLastCharacter(stringPass);
                        System.out.println(Character + " is the last character of the " + stringPass);
                        break;
                    }
                    case 4: {
                    	String string1=getString();
                    	char char1=getChar();
                        int countForChar = t3.countOccurrences(string1,char1);
                        if (countForChar > 0) {
                            System.out.println("occurrence count is " + countForChar);
                        } else {
                            System.out.println("Entered character doesn't present in the string..");
                        }
                        break;
                    }
                    case 5: {
                        int greatestPosition = t3.findGreatestPosition(getString(), getChar());
                        if (greatestPosition > 0) {
                            System.out.println("Greatest position of occurrence count is " + greatestPosition);
                        } else {
                            System.out.println("Entered character doesn't present in the string..");
                        }
                        break;
                    }
                    case 6: {
                        String subString = t3.printFirstNcharacters(getString(), getInt());
                        System.out.println(subString);
                        break;
                    }
                    case 7: {
                        String subString = t3.printLastNcharacters(getString(), getInt());
                        System.out.println(subString);
                        break;
                    }
                    case 8: {
                        String replaceSubString = t3.replaceString(getString(), getString(), getString());
                        System.out.println(replaceSubString);
                        break;
                    }
                    case 9: {
                        boolean Checker = t3.checkStartsWith(getString(), getString());
                        if (Checker) {
                            System.out.println("Given string is present with the string.. ");
                        } else {
                            System.out.println("Given string is not present with the string..");
                        }
                        break;
                    }
                    case 10: {
                        boolean Checker = t3.checkEndsWith(getString(), getString());
                        if (Checker) {
                            System.out.println("Given string is present with the string..");
                        } else {
                            System.out.println("Given string is not present with the string..");
                        }
                        break;
                    }
                    case 11: {
                        String UpperCase = t3.upperCase(getString());
                        System.out.println(UpperCase);
                        break;
                    }
                    case 12: {
                        String LowerCase = t3.lowerCase(getString());
                        System.out.println(LowerCase);
                        break;
                    }
                    case 13: {
                        String ReverseString = t3.reverseString(getString());
                        System.out.println(ReverseString);
                        break;
                    }
                    case 14: {
                        String[] stringArray = t3.splitString(getString());
                        System.out.print(Arrays.toString(stringArray));
                        break;
                    }
                    case 15: {
                        String whiteSpaceRemover = t3.removeWhiteSpace(getString());
                        System.out.println(whiteSpaceRemover);
                        break;
                    }
                    case 16: {
                        int numberOfSize = getInt();
                        String finalString;
                        String[] stringArray = new String[numberOfSize];
                        for (int i = 0; i < numberOfSize; i++) {
                            System.out.println("enter string"+i);
                            stringArray[i] = sc.next();
                        }
                        char character=getChar();
                        finalString = t3.mergeStringWithChar(stringArray, Character.toString(character));
                        System.out.println(finalString);
                        break;
                    }
                    case 17: {
                        boolean Checker = t3.checkStringEquals(getString(), getString());
                        if (Checker) {
                            System.out.println("Two strings are same.");
                        } else {
                            System.out.println("Two strings are not same..");
                        }
                        break;
                    }
                    case 18: {
                        boolean Checker = t3.checkStringEqualsWithOutCase(getString(), getString());
                        if (Checker) {
                            System.out.println("Two strings are same.");
                        } else {
                            System.out.println("Two strings are not same..");
                        }
                        break;
                    }
                    case 19: {
                        String removeSpace = t3.removeSpaceOnEdges(getString());
                        System.out.println(removeSpace);
                        break;
                    }
                    default:{
                    System.out.println("Invaild input ..Please enter choice between 0 to 19");
                    }

                }
            } 
            catch (HelperException exception) {
                System.out.println(exception);
            }

        } while (flag);
        /*
        try{
        String s=null,a;
        a=t3.removeSpaceOnEdges(s);
        }catch(HelperException exception){
        System.out.println(exception);
        }*/


    }

}