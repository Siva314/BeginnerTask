package arralist;

import java.util.List;
import java.util.Scanner;
import help.HelperException;
import util.CheckUtils;

public class RunnerForArrayList {
    
    static Scanner scannerObject=new Scanner(System.in);
    
    public static Integer[] getIntegerArray(int size) {
        Integer[] integerArray=new Integer[size];
        for(int i=0;i<size;i++) {
            System.out.println("enter the integer "+(i+1));
            integerArray[i]=scannerObject.nextInt();
        }
        return integerArray;
    }
    
    public static String[] getStringArray(int size) {
        String[] stringArray=new String[size];
        for(int i=0;i<size;i++) {
            System.out.println("enter the string "+(i+1));
            stringArray[i]=scannerObject.next();
        }
        return stringArray;
    }
    
    public static int getInteger(int Integer) {
        boolean flag=true;
        while(flag) {
            if(scannerObject.hasNextInt()) {
                Integer=scannerObject.nextInt();
                flag=false;
            }else {
                System.out.println("Enter Integer only..");
                scannerObject.next();
            }
        }
        return Integer;
    }
    
    public static void main(String[] args) {
    	String string=new String();
    	int integer=new Integer(0);
    	double decimal=0.00;
    	long longArray=854823;
    	Object obj=new Object();
        ArrayListMethods arrayList=new ArrayListMethods();
        ArrayListMethods arrayList1=new ArrayListMethods();
        
        boolean flag=true;
        do {
            System.out.println("-----------------\nEnter the choice..\n0 for exit");
            int choice=getInteger(0);
            try{
            switch(choice) {
            case 0:{
                System.out.println("Execution Stopped..");
                flag=false;
                break;
            }
            case 1:{
                List<String> list=arrayList.getList(string);
                System.out.println("ArrayList size is.."+arrayList.getLengthOfList(list));
                break;
            }
            case 2:{
                List<String> list=arrayList.getList(string);
                System.out.println("Enter the number of strings.");
                arrayList.addElementInStringList(list, getStringArray(getInteger(0)));
                arrayList.displayList(list);
                System.out.println("ArrayList size is.."+arrayList.getLengthOfList(list));
                break;
            }
            case 3:{
                List<Integer> list=arrayList.getList(integer);
                System.out.println("Enter the number of Integers.");
                arrayList.addElementInIntegerList(list, getIntegerArray(getInteger(0)));
                arrayList.displayList(list);
                System.out.println("ArrayList size is.."+arrayList.getLengthOfList(list));
                break;
            }
            case 4:{
                List<ArrayListMethods> list=arrayList.getList(arrayList);
                arrayList.addElementInObjectList(list,arrayList,arrayList1);
                arrayList.displayList(list);
                System.out.println("ArrayList size is.."+arrayList.getLengthOfList(list));
                break;
            }
            case 5:{
                List list=arrayList.getList(obj);
                System.out.println("Enter the number of Integers.");
                Integer[] intArray=getIntegerArray(getInteger(0));
                arrayList.addElementInIntegerList(list, intArray);
                System.out.println("Enter the number of strings.");
                String[] stringArray=getStringArray(getInteger(0));
                arrayList.addElementInStringList(list, stringArray);
                arrayList.addElementInObjectList(list, arrayList,arrayList1);
                arrayList.displayList(list);
                System.out.println("ArrayList size is.."+arrayList.getLengthOfList(list));
                break;
            }
            case 6:{
                List<String> list=arrayList.getList(string);
                System.out.println("Enter the number of strings.");
                arrayList.addElementInStringList(list, getStringArray(getInteger(0)));
                System.out.println("Enter the string to search..");
                String searchString=scannerObject.next();
                int index=arrayList.checkIndexOf(list,searchString);
                if(index==-1) {
                    System.out.println("String is not present in list..");
                }else {
                System.out.println("Index of "+searchString+" is "+index);
                }
                arrayList.displayList(list);
                System.out.println("ArrayList size is.."+arrayList.getLengthOfList(list));
                break;
            }
            case 7:{
                List<String> list=arrayList.getList(string);
                System.out.println("Enter the number of strings.");
                arrayList.addElementInStringList(list, getStringArray(getInteger(0)));
                arrayList.displayList(list);
                arrayList.displayListUsingFor(list);
                break;
            }
            case 8:{
                List<String> list=arrayList.getList(string);
                System.out.println("Enter the number of strings.");
                arrayList.addElementInStringList(list, getStringArray(getInteger(0)));
                System.out.println("Enter the index..");
                Integer index=getInteger(0);
                Object middle=arrayList.findObjectInGivenIndex2(list, index);
                System.out.println("\n"+middle);
                arrayList.displayList(list);                
                break;
            }
            case 9:{
                List<String> list=arrayList.getList(string);
                System.out.println("Enter the number of strings.");
                arrayList.addElementInStringList(list, getStringArray(getInteger(0)));
                System.out.println("Enter the string to search..");
                String searchString=scannerObject.next();
                int index=arrayList.checkIndexOf(list,searchString);
                int lastIndex=arrayList.checkLastIndexOf(list,searchString);
                CheckUtils.checkPosition(index, lastIndex);
                System.out.println("First index is "+index+" Last index is "+lastIndex);
                break;
            }
            case 10:{
                List<String> list=arrayList.getList(string);
                System.out.println("Enter the number of strings.");
                arrayList.addElementInStringList(list, getStringArray(getInteger(0)));
                System.out.println("Enter the index value..");
                int insertIndex=getInteger(0);
                System.out.println("Enter the number of Strings do you want to add..");
                arrayList.addElementInMiddle(list, insertIndex, getStringArray(getInteger(0)));
                arrayList.displayList(list);
                System.out.println("ArrayList size is.."+arrayList.getLengthOfList(list));
                break;
            }
            case 11:{
                List<String> list=arrayList.getList(string);
                System.out.println("Enter the number of strings.");
                arrayList.addElementInStringList(list, getStringArray(getInteger(0)));
                System.out.println("Enter the starting index.");
                int startIndex=scannerObject.nextInt();
                System.out.println("Enter the ending index.");
                int endIndex=scannerObject.nextInt();
                List<String> secondList= arrayList.getList(string);
                arrayList.createNewStringList(list,secondList, startIndex, endIndex);
                //System.out.println(list);
                arrayList.displayList(secondList);
                System.out.println("ArrayList size is.."+arrayList.getLengthOfList(secondList));
                break;
            }
            case 12:{
                List<String> list=arrayList.getList(string);
                System.out.println("Enter the number of strings.");
                arrayList.addElementInStringList(list, getStringArray(getInteger(0)));
                arrayList.displayList(list);
                List<String> secondList=arrayList.getList(string);
                System.out.println("Enter the number of strings.");
                arrayList.addElementInStringList(secondList, getStringArray(getInteger(0)));
                arrayList.displayList(secondList);
                List<String> thirdList=arrayList.getList(string);
                arrayList.mergeStringList(list, secondList, thirdList);
                arrayList.displayList(thirdList);
                break;
            }
            case 13:{
            	List<String> list=arrayList.getList(string);
                System.out.println("Enter the number of strings.");
                arrayList.addElementInStringList(list, getStringArray(getInteger(0)));
                arrayList.displayList(list);
                List<String> secondList=arrayList.getList(string);
                System.out.println("Enter the number of strings.");
                arrayList.addElementInStringList(secondList, getStringArray(getInteger(0)));
                arrayList.displayList(secondList);
                List<String> thirdList=arrayList.getList(string);
                arrayList.mergeStringSecondListAtFirst(list, secondList, thirdList);
                arrayList.displayList(thirdList);
                break;
            }
            case 14:{
            	List<Double> list=arrayList.getList(decimal);
            	Double[] decimalArray= {7.6,8.7,9.8,7.54,5.67};
            	arrayList.addElementInDoubleList(list, decimalArray);
            	int index=0;
            	arrayList.removeOneElementInList(list,index);
            	arrayList.displayList(list);
                System.out.println("ArrayList size is.."+arrayList.getLengthOfList(list));
            	break;
            }
            case 15:{
            	List<Double> list=arrayList.getList(decimal);
            	Double[] decimalArray= {7.6,8.7,9.8,7.54,5.67};
            	arrayList.addElementInDoubleList(list, decimalArray);
            	System.out.println("Enter the index to delete..");
            	int index=getInteger(0);
            	arrayList.removeOneElementInList(list,index);
            	arrayList.displayList(list);
                System.out.println("ArrayList size is.."+arrayList.getLengthOfList(list));
            	break;
            }
            case 16:{
            	List<Long> list=arrayList.getList(longArray);
            	Long[] longArray1= {75465L,856L,95665L,75456L,567L,45544L,4654L,5645L,54654L,54645L,6545464L,4564L};
            	arrayList.addElementInLongList(list, longArray1);
            	List<Long> secondList=arrayList.getList(longArray);
                System.out.println("Enter the starting index.");
            	int startIndex=scannerObject.nextInt();
                System.out.println("Enter the ending index.");
                int endIndex=scannerObject.nextInt();
                System.out.println("ArrayList size is.."+arrayList.getLengthOfList(list));
            	arrayList.removeOnMiddleInLongList(list, secondList, startIndex, endIndex);
            	arrayList.displayList(list);
                System.out.println("ArrayList size is.."+arrayList.getLengthOfList(list));
            	break;
            }
            case 17:{
            	List<String> list=arrayList.getList(string);
                System.out.println("Enter the number of strings.");
                arrayList.addElementInStringList(list, getStringArray(getInteger(0)));
            	List<String> secondList=arrayList.getList(string);
                System.out.println("Enter the number of strings.");
                arrayList.addElementInStringList(secondList, getStringArray(getInteger(0)));
                List<String> thirdList=arrayList.getList(string);
                arrayList.printTheElementNotPrensentInSecondList(list, secondList,thirdList);
                arrayList.displayList(thirdList);
                System.out.println("ArrayList size is.."+arrayList.getLengthOfList(list));
                break;
            }
            case 18:{
            	List<String> list=arrayList.getList(string);
                System.out.println("Enter the number of strings.");
                arrayList.addElementInStringList(list, getStringArray(getInteger(0)));
                List<String> secondList=arrayList.getList(string);
                System.out.println("Enter the number of strings.");
                arrayList.addElementInStringList(secondList, getStringArray(getInteger(0)));
                arrayList.removeElementInTheFirstList(list, secondList);
                arrayList.displayList(list);
                System.out.println("ArrayList size is.."+arrayList.getLengthOfList(list));
                break;
            }
            case 19:{
            	List<Long> list=arrayList.getList(longArray);
            	Long[] longArray1= {75465L,856L,95665L,75456L,567L,45544L,4654L,5645L,54654L,54645L,6545464L,4564L};
            	arrayList.addElementInLongList(list, longArray1);
            	arrayList.removeAllElementInList(list);
                arrayList.displayList(list);
                System.out.println("ArrayList size is.."+arrayList.getLengthOfList(list));
                break;
            }
            case 20:{
            	List<String> list=arrayList.getList(string);
                System.out.println("Enter the number of strings.");
                arrayList.addElementInStringList(list, getStringArray(getInteger(0)));
                System.out.println("Enter the string to search..");
                String checkString=scannerObject.next();
            	boolean checkPoint=arrayList.checkGivenElementPresentOrNot(list, checkString);
            	if(checkPoint) {
            		System.out.println("given string is present in the list..");
            	}
                arrayList.displayList(list);
                System.out.println("ArrayList size is.."+arrayList.getLengthOfList(list));
            	break;
            }
            default:{
                System.out.println("Invaild input..");
                break;
            }
            }
            }catch(HelperException exception) {
                System.out.println(exception);
            }
        }while(flag);
    }
}



