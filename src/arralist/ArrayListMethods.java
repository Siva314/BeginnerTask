package arralist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import help.HelperException;
import util.CheckUtils;

public class ArrayListMethods{
	
	public <T>void displayList(List<T> list) throws HelperException{
		CheckUtils.nullCheck(list);
        Iterator<T> innerValue=list.iterator();
        while(innerValue.hasNext()) {
            System.out.print(innerValue.next()+" ");
        }
        System.out.println("\n");
    }
	
	public <T>void displayListUsingFor(List<T> list)throws HelperException{
		int length=getLengthOfList(list);
		for(int i=0;i<length;i++) {
			System.out.print(list.get(i)+" ");
		}
        System.out.println("\n");
	}
	
	public <T>List<T> getList(T type){
        List<T> list=new ArrayList<T>();
        return list;
    }
	
    public <T>int getLengthOfList(List<T> list)throws HelperException {
        CheckUtils.nullCheck(list);
        return list.size();
    }
    
    public void addElementInIntegerList(List<Integer> list,Integer... addElements)throws HelperException{
        CheckUtils.nullCheck(list);
        CheckUtils.nullCheck(addElements);
        for(Integer input:addElements) {
            list.add(input);
        }
    }
    
    public void addElementInStringList(List<String> list,String... addElements)throws HelperException{
        CheckUtils.nullCheck(list);
        CheckUtils.nullCheck(addElements);
        for(String input:addElements) {
            list.add(input);
        }
    }
    
    public void addElementInFloatList(List<Float> list,Float... addElements)throws HelperException{
        CheckUtils.nullCheck(list);
        CheckUtils.nullCheck(addElements);
        for(Float input:addElements) {
            list.add(input);
        }
    }
    
    public void addElementInDoubleList(List<Double> list,Double... addElements)throws HelperException{
        CheckUtils.nullCheck(list);
        CheckUtils.nullCheck(addElements);
        for(Double input:addElements) {
            list.add(input);
        }
    }
    
    public void addElementInLongList(List<Long> list,Long... addElements)throws HelperException{
        CheckUtils.nullCheck(list);
        CheckUtils.nullCheck(addElements);
        for(Long input:addElements) {
            list.add(input);
        }
    }
    
    public void addElementInObjectList(List<ArrayListMethods> list,ArrayListMethods... addElements)throws HelperException{
        CheckUtils.nullCheck(list);
        CheckUtils.nullCheck(addElements);
        for(ArrayListMethods input:addElements) {
            list.add(input);
        }
    }
    public int checkIndexOf(List<Integer> list,int checkValue)throws HelperException{
        CheckUtils.nullCheck(list);
        CheckUtils.checkNegative(checkValue);
        return list.indexOf(checkValue);
    }
    public int checkIndexOf(List<String> list, String checkValue)throws HelperException{
        CheckUtils.nullCheck(list);
        CheckUtils.nullCheck(checkValue);
        return list.indexOf(checkValue);
    }
    public int checkIndexOf(List<ArrayListMethods> list, Object checkValue)throws HelperException{
        CheckUtils.nullCheck(list);
        CheckUtils.nullCheck(checkValue);
        return list.indexOf(checkValue);
    }
    public int checkLastIndexOf(List<Integer> list,int checkValue)throws HelperException{
        CheckUtils.nullCheck(list);
        CheckUtils.checkNegative(checkValue);
        return list.lastIndexOf(checkValue);
    }
    public int checkLastIndexOf(List<String> list,String checkValue)throws HelperException{
        CheckUtils.nullCheck(list);
        CheckUtils.nullCheck(checkValue);
        return list.lastIndexOf(checkValue);
    }
    public Integer findObjectInGivenIndex1(List<Integer> list,int index)throws HelperException{
        CheckUtils.checkPosition(getLengthOfList(list),index);
        return list.get(index);
    }
    public String findObjectInGivenIndex2(List<String> list,int index)throws HelperException{
        CheckUtils.checkPosition(getLengthOfList(list),index);
        return list.get(index);
    }
    public Object findObjectInGivenIndex3(List<Object> list,int index)throws HelperException{
        CheckUtils.checkPosition(getLengthOfList(list),index);
        return list.get(index);
    }
    public void addElementInMiddle(List<Integer> list,int index,Integer... arrayToAdd)throws HelperException{
        CheckUtils.nullCheck(arrayToAdd);
        CheckUtils.checkPosition(getLengthOfList(list),index);
        for(Integer appendValue:arrayToAdd) {
            list.add(index,appendValue);
            index++;
        }
    }
    public void addElementInMiddle(List<String> list,int index,String... arrayToAdd)throws HelperException{
        CheckUtils.nullCheck(arrayToAdd);
        CheckUtils.checkPosition(getLengthOfList(list),index);
        for(String appendValue:arrayToAdd) {
            list.add(index,appendValue);
            index++;
        }
    }
    public void addElementInMiddle(List<Object> list,int index,Object... arrayToAdd)throws HelperException{
        CheckUtils.nullCheck(arrayToAdd);
        CheckUtils.checkPosition(getLengthOfList(list),index);
        for(Object appendValue:arrayToAdd) {
            list.add(index,appendValue);
            index++;
        }
    }
    public void createNewIntegerList(List<Integer> list,List<Integer> secondList ,int startIndex,int endIndex)throws HelperException{
        CheckUtils.nullCheck(list);
        CheckUtils.checkIndex(startIndex, endIndex);
        secondList.addAll(list.subList(startIndex, endIndex));
    }
    public void createNewStringList(List<String> list,List<String> secondList ,int startIndex,int endIndex)throws HelperException{
        CheckUtils.nullCheck(list);
        CheckUtils.checkIndex(startIndex, endIndex);
        secondList.addAll(list.subList(startIndex, endIndex));
    }
    public void createNewFloatList(List<Float> list,List<Float> secondList ,int startIndex,int endIndex)throws HelperException{
        CheckUtils.nullCheck(list);
        CheckUtils.checkIndex(startIndex, endIndex);
        secondList.addAll(list.subList(startIndex, endIndex));
    }
    public void createNewLongList(List<Long> list,List<Long> secondList ,int startIndex,int endIndex)throws HelperException{
        CheckUtils.nullCheck(list);
        CheckUtils.checkIndex(startIndex, endIndex);
        secondList.addAll(list.subList(startIndex, endIndex));
    }
    public void mergeStringList(List<String> firstList,List<String> secondList,List<String> temporaryList )throws HelperException{
        CheckUtils.nullCheck(firstList);
        CheckUtils.nullCheck(secondList);
        temporaryList.addAll(firstList);
        temporaryList.addAll(secondList);
    }
    public void mergeIntegerList(List<Integer> firstList,List<Integer> secondList,List<Integer> temporaryList )throws HelperException{
        CheckUtils.nullCheck(firstList);
        CheckUtils.nullCheck(secondList);
        temporaryList.addAll(firstList);
        temporaryList.addAll(secondList);
    }
    public void mergeStringSecondListAtFirst(List<String> firstList,List<String> secondList,List<String> temporaryList )throws HelperException{
        CheckUtils.nullCheck(firstList);
        CheckUtils.nullCheck(secondList);
        temporaryList.addAll(firstList);
        temporaryList.addAll(0,secondList);
    }
    public void mergeIntegerSecondListAtFirst(List<Integer> firstList,List<Integer> secondList,List<Integer> temporaryList )throws HelperException{
        CheckUtils.nullCheck(firstList);
        CheckUtils.nullCheck(secondList);
        temporaryList.addAll(firstList);
        temporaryList.addAll(0,secondList);
    }
    public void removeOneElementInList(List<Double> list,int index) throws HelperException{
        CheckUtils.checkPosition(getLengthOfList(list),index);
    	list.remove(index);
    }
    public void removeOnMiddleInLongList(List<Long> list,List<Long> secondList,int startIndex,int endIndex)throws HelperException {
    	createNewLongList(list,secondList,startIndex,endIndex);
    	list.removeAll(secondList);
    }
    public void printTheElementNotPrensentInSecondList(List<String> firstList,List<String> secondList,List<String> thirdList) throws HelperException{
    	thirdList.addAll(firstList);
    	removeElementInTheFirstList(firstList,secondList);
    	thirdList.removeAll(firstList);
    }
    public void removeElementInTheFirstList(List<String> firstList,List<String> secondList)throws HelperException {
    	CheckUtils.nullCheck(firstList);
    	CheckUtils.nullCheck(secondList);
    	firstList.retainAll(secondList);
    }
    public void removeAllElementInList(List<Long> list) throws HelperException{
    	CheckUtils.nullCheck(list);
    	list.removeAll(list);
    }
    public boolean checkGivenElementPresentOrNot(List<String> list,String checkValue) throws HelperException{
    	CheckUtils.nullCheck(list);
    	return list.contains(checkValue);
    }
}






