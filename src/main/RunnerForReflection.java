package main;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import help.HelperException;
import task8.ReflectionMethod;

public class RunnerForReflection {
	public static void main(String[] args) {
		ReflectionMethod rMethod=new ReflectionMethod();
		try {
			Class<?> sample=rMethod.getClass("test.PojoNo8");
			Constructor<?> constructor=rMethod.getConstructor(null,null);
			Object myObj=rMethod.getInstance(null,null);
//			Method method=rMethod.getMethod(sample, "setString", String.class);
//			Method method3=rMethod.getMethod(sample, null, int.class);
//			Object obj3=rMethod.invokeMethod(method3, myObj, 11) ;
//			Object obj2=rMethod.invokeMethod(method, myObj, "siva") ;
//			Method method2=rMethod.getMethod(sample, "toString");
//			Object obj=rMethod.invokeMethod(method2, myObj);
//			System.out.println(obj);
//			Object obj=rMethod.invokeMethod(sample, "setString", "siva");
//			System.out.println(obj);
			
		}
		catch(HelperException ex){
			ex.printStackTrace();
		}
//		Class<?> sample=Class.forName("test.PojoNo8");
//		Constructor myConstructor=sample.getConstructor();
//		Object myObj=myConstructor.newInstance();
//		Method m=sample.getDeclaredMethod("setString", String.class);
//		Method m2=sample.getDeclaredMethod("getString");
//		m.invoke(myObj, "siva");
//		String s=(String) m2.invoke(myObj);
//		System.out.println(myObj.toString()+s);
//		Constructor myConstructor2=sample.getConstructor(String.class, int.class);
//		Object myObj2=myConstructor2.newInstance("pasu",11);
//		Method m3=sample.getDeclaredMethod("getString");
//		String s2=(String)m3.invoke(myObj2);
//		System.out.println(s2);
//		Method m4=sample.getDeclaredMethod("getId");
//		int s3=(int)m4.invoke(myObj2);
//		System.out.println(s3);
	}
}
