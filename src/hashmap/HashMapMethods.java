package hashmap;

import java.util.HashMap;
import java.util.Map;

import help.HelperException;
import util.CheckUtils;

public class HashMapMethods {
	public <K,V>Map<K,V> getMap(K key,V value){
		Map<K,V> map=new HashMap<K,V>();
		return map;
	}
	public <k,V>int getMapLength(Map<k,V> map)throws HelperException{
		CheckUtils.nullCheck(map);
		return map.size();
	}
	public Map<Integer,Integer> addIntegerItemsInIntegerMap(Map<Integer,Integer> map,Integer key,Integer value)throws HelperException{
		CheckUtils.nullCheck(map);
		map.put(key,value);
		return map;
	}
	public Map<Integer,String> addStringItemsInIntegerMap(Map<Integer,String> map,Integer key,String value)throws HelperException{
		CheckUtils.nullCheck(map);
		map.put(key,value);
		return map;
	}
	public Map<String,String> addStringItemsInStringMap(Map<String,String> map,String key,String value)throws HelperException{
		CheckUtils.nullCheck(map);
		map.put(key,value);
		return map;
	}
	public Map<String,Integer> addIntegerItemsInStringMap(Map<String,Integer> map,String key,Integer value)throws HelperException{
		CheckUtils.nullCheck(map);
		map.put(key,value);
		return map;
	}
	public Map<String,HashMapMethods> addObjectItemsInStringMap(Map<String,HashMapMethods> map,String key,HashMapMethods value)throws HelperException{
		CheckUtils.nullCheck(map);
		map.put(key,value);
		return map;
	}
	public boolean checkIntegerKeyIsPresentOrNotInIntegerMap(Map<Integer,Integer> map,Integer key)throws HelperException{
		CheckUtils.nullCheck(map);
		return map.containsKey(key);
	}
	public boolean checkIntegerKeyIsPresentOrNotInStringMap(Map<Integer,String> map,Integer key)throws HelperException{
		CheckUtils.nullCheck(map);
		return map.containsKey(key);
	}
	public boolean checkStringKeyIsPresentOrNotInStringMap(Map<String,String> map,String key)throws HelperException{
		CheckUtils.nullCheck(map);
		return map.containsKey(key);
	}
	public boolean checkStringKeyIsPresentOrNotInIntegerMap(Map<String,Integer> map,String key)throws HelperException{
		CheckUtils.nullCheck(map);
		return map.containsKey(key);
	}
	public boolean checkIntegerValueIsPresentOrNotInIntegerMap(Map<Integer,Integer> map,Integer value)throws HelperException{
		CheckUtils.nullCheck(map);
		return map.containsValue(value);
	}
	public boolean checkIntegerValueIsPresentOrNotInStringMap(Map<String,Integer> map,Integer value)throws HelperException{
		CheckUtils.nullCheck(map);
		return map.containsValue(value);
	}
	public boolean checkStringValueIsPresentOrNotInStringMap(Map<String,String> map,String value)throws HelperException{
		CheckUtils.nullCheck(map);
		return map.containsValue(value);
	}
	public boolean checkIntegerValueIsPresentOrNotInStringMap(Map<Integer,String> map,String value)throws HelperException{
		CheckUtils.nullCheck(map);
		return map.containsValue(value);
	}
	public Map<String,String> replaceTheValueInStringMap(Map<String,String> map)throws HelperException{
		CheckUtils.nullCheck(map);
		map.replaceAll((key,value)->value.toUpperCase());
		return map;
	}
	public Map<String,Integer> replaceTheValueInIntegerMap(Map<String,Integer> map)throws HelperException{
		CheckUtils.nullCheck(map);
		map.replaceAll((key,value)->value*value);
		return map;
	}
	public String getStringValueUsingKey(Map<String,String> map,String key)throws HelperException{
		CheckUtils.nullCheck(map);
		return map.get(key);
	}
	public int getIntegerValueUsingKey(Map<String,Integer> map,String key)throws HelperException{
		CheckUtils.nullCheck(map);
		return map.get(key);
	}
	public String getDefaultValueInMap(Map<String,String> map,String key) throws HelperException{
		CheckUtils.nullCheck(map);
		return map.getOrDefault(key, "Zoho");
	}
	public Map<String,String> removeTheKeyInMap(Map<String,String> map,String key) throws HelperException{
		CheckUtils.nullCheck(map);
		map.remove(key);
		return map;
	}
	public Map<String,String> removeTheKeyInMap(Map<String,String> map,String key,String value) throws HelperException{
		CheckUtils.nullCheck(map);
		map.remove(key,value);
		return map;
	}
	public Map<String,String> replaceTheValueInMapUsingKey(Map<String,String> map,String key,String value) throws HelperException{
		CheckUtils.nullCheck(map);
		map.replace(key, value);
		return map;
	}
	public Map<String,String> replaceTheValueMatchesTheGivenValue(Map<String,String> map,String key,String searchValue,String replaceValue)throws HelperException{
		CheckUtils.nullCheck(map);
		map.replace(key, searchValue, replaceValue);
		return map;
	}
	public Map<String,String> copyOneMapToAnother(Map<String,String> firstMap,Map<String,String> secondMap) throws HelperException{
		CheckUtils.nullCheck(firstMap);
		CheckUtils.nullCheck(secondMap);
		secondMap.putAll(firstMap);
		return secondMap;
	}
	public void iterateMap(Map<String,String> map) {
		for(Map.Entry<String, String> position:map.entrySet()) {
			System.out.println("Key is "+position.getKey()+"\t"+"value is "+position.getValue());
		}
	}
	public Map<String,String> removeAllElementInMap(Map<String,String> map)throws HelperException{
		CheckUtils.nullCheck(map);
		map.clear();
		return map;
	}
}
