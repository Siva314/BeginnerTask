package test;
import help.HelperException;
import util.CheckUtils;

public class StringBuilderMethods {

    public int getLength(StringBuilder stringBuilder) throws HelperException  {
    	CheckUtils.nullCheck(stringBuilder);
        return stringBuilder.length();
    } 
    public StringBuilder getStringBuilder() {
    	StringBuilder stringBuilder=new StringBuilder();
    	return stringBuilder;
    }
    public StringBuilder addStringsToBuilder(StringBuilder builder,String... strings) {
    	int length=strings.length;
    	for(int i=0;i<length;i++) {
    		builder.append(strings[i]);
    	}
    	return builder; 
    }
    public StringBuilder addStringsToBuilderWithSymbol(StringBuilder builder , String symbol,String... strings)throws HelperException {
    	int lengthOfStringBuilder=getLength(builder);
    	CheckUtils.nullCheck(strings);
    	int lengthOfStringArray=strings.length;
    	if(lengthOfStringBuilder>0) {
    		builder.append(symbol);
    	}
    	for(int i=0;i<lengthOfStringArray;i++) {
    		builder.append(strings[i]);
    		builder.append(symbol);
    	}
    	return builder.deleteCharAt(builder.length()-1);
    }
    public StringBuilder insertAtMiddle(StringBuilder builder,String symbol,String...strings) throws HelperException{
    	CheckUtils.nullCheck(builder);
    	CheckUtils.nullCheck(strings);
    	int length=strings.length;
    	for(int i=0;i<length;i++) {
    		int position=builder.lastIndexOf(symbol);
    		builder.insert(position,strings[i]);
    		builder.insert(position,symbol);
    	}    	
    	return builder;
    }
    public StringBuilder deleteFirst(StringBuilder builder,String symbol) throws HelperException{
    	CheckUtils.nullCheck(builder);
    	int position=builder.indexOf(symbol);
    	return builder.delete(0, position);
    }
    public StringBuilder changeSymbol(StringBuilder builder,char searchSymbol,String symbol)throws HelperException {
    	int length=getLength(builder);
    	for(int i=0;i<length;i++) {
    		if(builder.charAt(i)==searchSymbol) {
    			builder.replace(i,i+1,symbol);
    		}
    	}
    	return builder;
    }
    public StringBuilder reverseTheBuilder(StringBuilder builder)throws HelperException {
    	CheckUtils.nullCheck(builder);
    	return builder.reverse();
    }
    public StringBuilder deleteAtMiddle(StringBuilder builder,int startingPosition,int endingPosition) throws HelperException{
    	CheckUtils.checkIndex(startingPosition,endingPosition);
    	return builder.delete(startingPosition, endingPosition);
    }
    public StringBuilder replaceAtMiddle(StringBuilder builder,int startingPosition,int endingPosition,String subString) throws HelperException{
    	CheckUtils.nullCheck(builder);
    	CheckUtils.checkIndex(startingPosition,endingPosition);
    	return builder.replace(startingPosition, endingPosition,subString);
    }
    public int findFirstIndex(StringBuilder builder,String symbol) throws HelperException{
    	CheckUtils.nullCheck(builder);
    	return builder.indexOf(symbol);
    }
    public int findLastIndex(StringBuilder builder,String symbol)throws HelperException {
    	CheckUtils.nullCheck(builder);
    	return builder.lastIndexOf(symbol);
    }
}