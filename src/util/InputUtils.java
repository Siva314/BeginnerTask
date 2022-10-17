package util;

import java.util.Scanner;

public class InputUtils {
	
	static Scanner sc=new Scanner(System.in);
	
	public static String getString() {
		sc.nextLine();
        String inputString = sc.nextLine();
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
    public static long getLong() {
    	long longInput=sc.nextLong();
    	return longInput;
    }
}
