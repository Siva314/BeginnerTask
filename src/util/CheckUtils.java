package util;
import java.util.Objects;
import help.HelperException;

public class CheckUtils {
	
    public static void nullCheck(Object obj) throws HelperException {
    	
        if(Objects.isNull(obj)) 
        {
             throw new HelperException("Input should not be null..");
     	   
         }
     }
     public static void checkIndex(int start,int end)throws HelperException {
     	if(start>end) {
     		throw new HelperException("Invaild index..");
     	}
     }
     public static void checkLength(int Length)throws HelperException {
     	if(Length<10) {
     		throw new HelperException("Minimum length .. Enter the string more then length 10..");
     	}
     }
     public static void checkEmpty(String checkString) throws HelperException {
         if (checkString.isEmpty()) {
             throw new HelperException("String should not be empty..");
         }
     }
         
     public static void checkPosition(int length,int position)throws HelperException{
         if (length < position || position<0) {
         	throw new HelperException("you enter a invaild value..");
         }
      }
     public static void checkNegative(int size) throws HelperException{
    	 if(size<0) {
    		 throw new HelperException("Negative index..");
    	 }
     }
     public static void checkMonth(int month) throws HelperException {
    	 if(month>13||month<0) {
    		 throw new HelperException("Enter the month between 1 to 12");
    	 }
     }
//     public static void checkFile(String fileName) throws HelperException{
//    	 if(file.)
//     }
}
