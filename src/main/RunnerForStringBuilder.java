package main;
import java.util.Scanner;
import help.HelperException;
import test.StringBuilderMethods;
import util.CheckUtils;

public class RunnerForStringBuilder {
	
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
    
    public static String[] getStringArray(int size) {
    	String[] stringArray=new String[size];
    	for(int i=0;i<size;i++) {
    		System.out.println("enter the string "+(i+1));
    		stringArray[i]=sc.next();
    	}
    	return stringArray;
    }
    
    public static int getInteger(int Choice) {
        boolean flag = true;
        while (flag) {
            if (sc.hasNextInt()) {
                Choice = sc.nextInt();
                flag = false;
            } else {
                sc.next();
                System.out.println("Enter the integer..");
            }
        }
        return Choice;
    }
    
    public static StringBuilder printEmptyStringBuilder() {
    	StringBuilderMethods task4=new StringBuilderMethods();
    	StringBuilder stringBuilder=task4.getStringBuilder();
    	int builderLength=0;
    	try {
    	builderLength=task4.getLength(stringBuilder);
    	}
    	catch(HelperException exception) {
    		System.out.println(exception);
    	}
    	System.out.println(builderLength);
    	System.out.println("Enter the number of strings..");
    	return stringBuilder;
    }    
      
    public static void printStringBuilderAfterOperations(StringBuilder stringBuilder) {
    	StringBuilderMethods task4=new StringBuilderMethods(); 
    	int builderLength1=0;
    	try {   		  
        	builderLength1=task4.getLength(stringBuilder);
        	}
        	catch(HelperException exception) {
        		System.out.println(exception);
        	}
    	System.out.println("StringBuilder is "+stringBuilder);
    	System.out.println("StringBuilder Length is "+builderLength1); 
    }
    
    public static void main(String[] args) {
    	StringBuilderMethods task4=new StringBuilderMethods();
        boolean flag = true;
//        String inputString="";
        do {
            System.out.println("----------------------------------------------------\nEnter the Choice from 0 to 10\n0 for Exit");
            int Choice = getInteger(0);
            try {
                switch (Choice) {
                    case 0: {
                        System.out.println("Thank you..");
                        flag = false;
                        break;
                    }
                    case 1:{
                    	StringBuilder stringBuilder1=printEmptyStringBuilder();
                    	String[] stringArray=getStringArray(getInteger(0));
                    	stringBuilder1=task4.addStringsToBuilder(stringBuilder1,stringArray);
                    	printStringBuilderAfterOperations(stringBuilder1);
                    	break;
                    }
                    case 2:{
                    	StringBuilder stringBuilder1=printEmptyStringBuilder();
                    	String[] stringArray=getStringArray(getInteger(0));
                    	String symbol=Character.toString(getChar());
                    	stringBuilder1=task4.addStringsToBuilderWithSymbol(stringBuilder1,symbol,stringArray);
                    	printStringBuilderAfterOperations(stringBuilder1);
                    	break;
                    }
                    case 3:{
                    	StringBuilder stringBuilder1=task4.getStringBuilder();
                    	System.out.println("Enter the number of strings..");
                    	String[] stringArray=getStringArray(getInteger(0));
                    	String symbol=Character.toString(getChar());
                    	stringBuilder1=task4.addStringsToBuilderWithSymbol(stringBuilder1,symbol,stringArray);
                    	printStringBuilderAfterOperations(stringBuilder1);
                    	System.out.println("Enter the number of strings to you want enter..");
                    	String[] stringSecondArray=getStringArray(getInteger(0));
                    	stringBuilder1=task4.insertAtMiddle(stringBuilder1,symbol,stringSecondArray);
                    	printStringBuilderAfterOperations(stringBuilder1);
                    	break;                    	
                    }
                    case 4:{
                    	StringBuilder stringBuilder1=task4.getStringBuilder();
                    	System.out.println("Enter the number of strings..");
                    	String[] stringArray=getStringArray(getInteger(0));
                    	String symbol=Character.toString(getChar());
                    	stringBuilder1=task4.addStringsToBuilderWithSymbol(stringBuilder1,symbol,stringArray);
                    	printStringBuilderAfterOperations(stringBuilder1);
                    	stringBuilder1=task4.deleteFirst(stringBuilder1,symbol);
                    	printStringBuilderAfterOperations(stringBuilder1);
                    	break;
                    }
                    case 5:{
                    	StringBuilder stringBuilder1=task4.getStringBuilder();
                    	System.out.println("Enter the number of strings..");
                    	String[] stringArray=getStringArray(getInteger(0));
                    	char symbol1=getChar();
                    	String symbol=Character.toString(symbol1);
                    	stringBuilder1=task4.addStringsToBuilderWithSymbol(stringBuilder1,symbol,stringArray);
                    	printStringBuilderAfterOperations(stringBuilder1);
                    	String symbolToChange=Character.toString(getChar());
                    	stringBuilder1=task4.changeSymbol(stringBuilder1,symbol1,symbolToChange);
                    	printStringBuilderAfterOperations(stringBuilder1);
                    	break;
                    }
                    case 6:{
                    	StringBuilder stringBuilder1=task4.getStringBuilder();
                    	System.out.println("Enter the number of strings..");
                    	String[] stringArray=getStringArray(getInteger(0));
                    	String symbol=Character.toString(getChar());
                    	stringBuilder1=task4.addStringsToBuilderWithSymbol(stringBuilder1,symbol,stringArray);
                    	printStringBuilderAfterOperations(stringBuilder1);
                    	stringBuilder1=task4.reverseTheBuilder(stringBuilder1);
                    	printStringBuilderAfterOperations(stringBuilder1);
                    	break;
                    }
                    case 7:{
                    	StringBuilder stringBuilder1=task4.getStringBuilder();
                    	System.out.println("Enter the number of strings..");
                    	String[] stringArray=getStringArray(getInteger(0));
                    	String symbol=Character.toString(getChar());
                    	stringBuilder1=task4.addStringsToBuilderWithSymbol(stringBuilder1,symbol,stringArray);
                    	printStringBuilderAfterOperations(stringBuilder1);
                    	CheckUtils.checkLength(task4.getLength(stringBuilder1));
                    	stringBuilder1=task4.deleteAtMiddle(stringBuilder1,getInteger(0), getInteger(0));
                    	printStringBuilderAfterOperations(stringBuilder1);
                    	break;
                    }
                    case 8:{
                    	StringBuilder stringBuilder1=task4.getStringBuilder();
                    	System.out.println("Enter the number of strings..");
                    	String[] stringArray=getStringArray(getInteger(0));
                    	String symbol=Character.toString(getChar());
                    	stringBuilder1=task4.addStringsToBuilderWithSymbol(stringBuilder1,symbol,stringArray);
                    	printStringBuilderAfterOperations(stringBuilder1);
                    	CheckUtils.checkLength(task4.getLength(stringBuilder1));
                    	stringBuilder1=task4.replaceAtMiddle(stringBuilder1,getInteger(0), getInteger(0),getString());
                    	printStringBuilderAfterOperations(stringBuilder1);
                    	break;
                    }
                    case 9:{
                    	StringBuilder stringBuilder1=task4.getStringBuilder();
                    	System.out.println("Enter the number of strings..");
                    	String[] stringArray=getStringArray(getInteger(0));
                    	String symbol=Character.toString(getChar());
                    	stringBuilder1=task4.addStringsToBuilderWithSymbol(stringBuilder1,symbol,stringArray);
                    	printStringBuilderAfterOperations(stringBuilder1);
                    	int lastIndexOfSymbol=task4.findFirstIndex(stringBuilder1, symbol);
                    	System.out.println("The first index of "+symbol+" is "+lastIndexOfSymbol);
                    	break;
                    }
                    case 10:{
                    	StringBuilder stringBuilder1=task4.getStringBuilder();
                    	System.out.println("Enter the number of strings..");
                    	String[] stringArray=getStringArray(getInteger(0));
                    	String symbol=Character.toString(getChar());
                    	stringBuilder1=task4.addStringsToBuilderWithSymbol(stringBuilder1,symbol,stringArray);
                    	printStringBuilderAfterOperations(stringBuilder1);
                    	int lastIndexOfSymbol=task4.findLastIndex(stringBuilder1, symbol);
                    	System.out.println("The last index of "+symbol+" is "+lastIndexOfSymbol);
                    	break;
                    }
                    default :{
                    	System.out.println("Invaild input..");
                    	break;
                    }
                }
            } catch (HelperException exception) {
                System.out.println(exception);
            }
        } while (flag);
    }
}