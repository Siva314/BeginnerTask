package task8;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import help.HelperException;
import util.CheckUtils;

public class ReflectionMethod {
	
	public Class<?> getClass(String fileName)throws HelperException{
		CheckUtils.nullCheck(fileName);
		try {
			return Class.forName(fileName);
		} catch (ClassNotFoundException e) {
			throw new HelperException("class not found "+e);
		}
	}
	
	public Constructor<?> getConstructor(Class<?> sampleClass,Class<?>...classes)throws HelperException{
		CheckUtils.nullCheck(sampleClass);
		try {
			return sampleClass.getConstructor(classes);
		} catch (NoSuchMethodException |SecurityException e) {
			throw new HelperException(" "+e);
		}
	}
	
	
	public Method getMethod(Class<?> sampleClass,String methodName,Class<?>...classes) throws HelperException {
		CheckUtils.nullCheck(sampleClass);
		CheckUtils.nullCheck(methodName);
		try {
			return sampleClass.getDeclaredMethod(methodName,classes);
		} catch (NoSuchMethodException |SecurityException e) {
			throw new HelperException(""+e);
		}
	}
	
	public Object getInstance(Constructor<?> constructor , Object... object) throws HelperException {
		CheckUtils.nullCheck(constructor);
		try {
			Object instanceObject=constructor.newInstance(object);
			return instanceObject;
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException| InvocationTargetException e) {
			throw new HelperException(""+e);
		}
	}
	public Object invokeMethod(Method methodName, Object object,Object... inputs) throws HelperException {
		CheckUtils.nullCheck(methodName);
		CheckUtils.nullCheck(object);
		CheckUtils.nullCheck(inputs);
		try {
			return methodName.invoke(object, inputs);
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			throw new HelperException(""+e);
		}
	}
}
