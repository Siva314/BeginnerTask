package hashmap;

import java.util.Map;
import java.util.Scanner;
import help.HelperException;

public class RunnerForHashMap {
	
	static Scanner scannerObject=new Scanner(System.in);
    /*
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
    }*/
    
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
	public static void main(String[] agrs) {
		HashMapMethods hashmap=new HashMapMethods();
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
            	Map<Integer,String> map=hashmap.getMap( 4,"siva");
            	System.out.println("Map size is "+hashmap.getMapLength(map));
            	break;
            }
            case 2:{
            	Map<String,String> map=hashmap.getMap( "1","siva");
            	hashmap.addStringItemsInStringMap(map,"1","siva");
            	hashmap.addStringItemsInStringMap(map,"2","siva");
            	hashmap.addStringItemsInStringMap(map,"3","null");
            	System.out.println(map);
            	System.out.println("Map size is "+hashmap.getMapLength(map));
            	break;
            }
            case 3:{
            	Map<Integer,Integer> map=hashmap.getMap( 4,1);
            	hashmap.addIntegerItemsInIntegerMap(map,1,3);
            	hashmap.addIntegerItemsInIntegerMap(map,2,4);
            	hashmap.addIntegerItemsInIntegerMap(map,4,6);
            	System.out.println(map);
            	System.out.println("Map size is "+hashmap.getMapLength(map));
            	break;
            }
            case 4:{
            	Map<String,Integer> map=hashmap.getMap( "4",1);
            	hashmap.addIntegerItemsInStringMap(map,"1",3);
            	hashmap.addIntegerItemsInStringMap(map,"2",4);
            	hashmap.addIntegerItemsInStringMap(map,"4",6);
            	System.out.println(map);
            	System.out.println("Map size is "+hashmap.getMapLength(map));
            	break;
            }
            case 5:{
            	Map<String,HashMapMethods> map=hashmap.getMap( "4",hashmap);
            	hashmap.addObjectItemsInStringMap(map,"1",hashmap);
            	hashmap.addObjectItemsInStringMap(map,"2",hashmap);
            	hashmap.addObjectItemsInStringMap(map,"4",hashmap);
            	System.out.println(map);
            	System.out.println("Map size is "+hashmap.getMapLength(map));
            	break;
            }
            case 6:{
            	Map<String,String> map=hashmap.getMap( "1","siva");
            	hashmap.addStringItemsInStringMap(map,"1",null);
            	hashmap.addStringItemsInStringMap(map,"2","siva");
            	hashmap.addStringItemsInStringMap(map,"3","value");
            	System.out.println(map);
            	System.out.println("Map size is "+hashmap.getMapLength(map));
            	break;
            }
            case 7:{
            	Map<String,String> map=hashmap.getMap( "1","siva");
            	hashmap.addStringItemsInStringMap(map,null,"1");
            	hashmap.addStringItemsInStringMap(map,"2","siva");
            	hashmap.addStringItemsInStringMap(map,"3","value");
            	System.out.println(map);
            	System.out.println("Map size is "+hashmap.getMapLength(map));
            	break;
            }
            case 8:{
            	Map<String,String> map=hashmap.getMap( "1","siva");
            	hashmap.addStringItemsInStringMap(map,"1","sdjcnsn");
            	hashmap.addStringItemsInStringMap(map,"2","siva");
            	hashmap.addStringItemsInStringMap(map,"3","value");
            	System.out.println(map);
            	System.out.println("enter the key to search..");
            	String search=scannerObject.next();
            	boolean checkPoint=hashmap.checkStringKeyIsPresentOrNotInStringMap(map, search);
            	if(checkPoint) {
            		System.out.println("Key is present in the map..");
            	}else {
            		System.out.println("Key is not present in the map..");
            	}
            	System.out.println(map);
            	System.out.println("Map size is "+hashmap.getMapLength(map));
            	break;
            }
            case 9:{
            	Map<String,String> map=hashmap.getMap( "1","siva");
            	hashmap.addStringItemsInStringMap(map,"1","sdjcnsn");
            	hashmap.addStringItemsInStringMap(map,"2","siva");
            	hashmap.addStringItemsInStringMap(map,"3","value");
            	System.out.println(map);
            	System.out.println("enter the value to search..");
            	String search=scannerObject.next();
            	boolean checkPoint=hashmap.checkStringValueIsPresentOrNotInStringMap(map, search);
            	if(checkPoint) {
            		System.out.println("Value is present in the map..");
            	}else {
            		System.out.println("Value is not present in the map..");
            	}
            	System.out.println(map);
            	System.out.println("Map size is "+hashmap.getMapLength(map));
            	break;
            }
            case 10:{
            	Map<String,String> map=hashmap.getMap( "1","siva");
            	hashmap.addStringItemsInStringMap(map,"1","sdjcnsn");
            	hashmap.addStringItemsInStringMap(map,"2","siva");
            	hashmap.addStringItemsInStringMap(map,"3","value");
            	System.out.println(map);
            	hashmap.replaceTheValueInStringMap(map);
            	System.out.println(map);
            	System.out.println("Map size is "+hashmap.getMapLength(map));
            	break;
            }
            case 11:{
            	Map<String,String> map=hashmap.getMap( "1","siva");
            	hashmap.addStringItemsInStringMap(map,"1","sdjcnsn");
            	hashmap.addStringItemsInStringMap(map,"2","siva");
            	hashmap.addStringItemsInStringMap(map,"3","value");
            	System.out.println("Enter the key to search..");
            	String searchKey=scannerObject.next();
            	String value=hashmap.getStringValueUsingKey(map,searchKey);
            	System.out.println("Given key is "+searchKey+" and value is "+value);
            	System.out.println(map);
            	System.out.println("Map size is "+hashmap.getMapLength(map));
            	break;
            }
            case 12:{
            	Map<String,String> map=hashmap.getMap( "1","siva");
            	hashmap.addStringItemsInStringMap(map,"1","sdjcnsn");
            	hashmap.addStringItemsInStringMap(map,"2","siva");
            	hashmap.addStringItemsInStringMap(map,"3","value");
            	System.out.println("Enter the key to search..");
            	String searchKey=scannerObject.next();
            	String output=hashmap.getDefaultValueInMap(map, searchKey);
            	System.out.println(map);
            	System.out.println("Map size is "+hashmap.getMapLength(map));
            	System.out.println(output);
            	System.out.println(map);
            	System.out.println("Map size is "+hashmap.getMapLength(map));
            	break;
            }
            case 13:{
            	Map<String,String> map=hashmap.getMap( "1","siva");
            	hashmap.addStringItemsInStringMap(map,"1","sdjcnsn");
            	hashmap.addStringItemsInStringMap(map,"2","siva");
            	hashmap.addStringItemsInStringMap(map,"3","value");
            	System.out.println("Enter the key to search..");
            	String searchKey=scannerObject.next();
            	hashmap.removeTheKeyInMap(map, searchKey);
            	System.out.println(map);
            	System.out.println("Map size is "+hashmap.getMapLength(map));
            	break;
            }
            case 14:{
            	Map<String,String> map=hashmap.getMap( "1","siva");
            	hashmap.addStringItemsInStringMap(map,"1","sdjcnsn");
            	hashmap.addStringItemsInStringMap(map,"2","siva");
            	hashmap.addStringItemsInStringMap(map,"3","value");
            	System.out.println("Enter the key to search..");
            	String searchKey=scannerObject.next();            	
            	System.out.println("Enter the Value to search..");
            	String searchValue=scannerObject.next();
            	System.out.println(map);
            	System.out.println("Map size is "+hashmap.getMapLength(map));
            	hashmap.removeTheKeyInMap(map,searchKey,searchValue);
            	System.out.println(map);
            	System.out.println("Map size is "+hashmap.getMapLength(map));
            	break;
            }
            case 15:{
            	Map<String,String> map=hashmap.getMap( "1","siva");
            	hashmap.addStringItemsInStringMap(map,"1","sdjcnsn");
            	hashmap.addStringItemsInStringMap(map,"2","siva");
            	hashmap.addStringItemsInStringMap(map,"3","value");
            	System.out.println("Enter the key to search..");
            	String searchKey=scannerObject.next();            	
            	System.out.println("Enter the Value to replace..");
            	String searchValue=scannerObject.next();
            	System.out.println(map);
            	System.out.println("Map size is "+hashmap.getMapLength(map));
            	hashmap.replaceTheValueInMapUsingKey(map, searchKey, searchValue);
            	System.out.println(map);
            	System.out.println("Map size is "+hashmap.getMapLength(map));
            	break;
            }
            case 16:{
            	Map<String,String> map=hashmap.getMap( "1","siva");
            	hashmap.addStringItemsInStringMap(map,"1","sdjcnsn");
            	hashmap.addStringItemsInStringMap(map,"2","siva");
            	hashmap.addStringItemsInStringMap(map,"3","value");
            	System.out.println("Enter the key to search..");
            	String searchKey=scannerObject.next(); 
            	System.out.println("Enter the value to search..");
            	String searchValue=scannerObject.next();
            	System.out.println("Enter the Value to replace..");
            	String replaceValue=scannerObject.next();
            	System.out.println(map);
            	System.out.println("Map size is "+hashmap.getMapLength(map));
            	hashmap.replaceTheValueMatchesTheGivenValue(map, searchKey, searchValue,replaceValue);
            	System.out.println(map);
            	System.out.println("Map size is "+hashmap.getMapLength(map));
            	break;
            }
            case 17:{
            	Map<String,String> map=hashmap.getMap( "1","siva");
            	hashmap.addStringItemsInStringMap(map,"1","sdjcnsn");
            	hashmap.addStringItemsInStringMap(map,"2","siva");
            	hashmap.addStringItemsInStringMap(map,"3","value");            	
            	Map<String,String> secondMap=hashmap.getMap( "1","siva");
            	hashmap.addStringItemsInStringMap(secondMap,"4","sdjcnsn");
            	hashmap.addStringItemsInStringMap(secondMap,"5","siva");
            	hashmap.addStringItemsInStringMap(secondMap,"6","value"); 
            	System.out.println(map);
            	System.out.println("Map size is "+hashmap.getMapLength(map));
            	System.out.println(secondMap);
            	System.out.println("Map size is "+hashmap.getMapLength(secondMap));
            	hashmap.copyOneMapToAnother(map, secondMap);
            	System.out.println(map);
            	System.out.println("Map size is "+hashmap.getMapLength(map));
            	System.out.println(secondMap);
            	System.out.println("Map size is "+hashmap.getMapLength(secondMap));
            	break;
            }
            case 18:{
            	Map<String,String> map=hashmap.getMap( "1","siva");
            	hashmap.addStringItemsInStringMap(map,"1","sdjcnsn");
            	hashmap.addStringItemsInStringMap(map,"2","siva");
            	hashmap.addStringItemsInStringMap(map,"3","value");
            	hashmap.iterateMap(map);
            	break;
            }
            case 19:{
            	Map<String,String> map=hashmap.getMap( "1","siva");
            	hashmap.addStringItemsInStringMap(map,"1","sdjcnsn");
            	hashmap.addStringItemsInStringMap(map,"2","siva");
            	hashmap.addStringItemsInStringMap(map,"3","value"); 
            	System.out.println(map);
            	System.out.println("Map size is "+hashmap.getMapLength(map));
            	hashmap.removeAllElementInMap(map);
            	System.out.println(map);
            	System.out.println("Map size is "+hashmap.getMapLength(map));
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
