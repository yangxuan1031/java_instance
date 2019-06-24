package com.yao.Json;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.json.JSONException;
import org.json.JSONObject;

public class test {
public static void main(String[] args) throws JSONException, ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
/*	ShowJson sj=new ShowJson();
	sj.createJson();
	
	String t=sj.json.getString("name");
	System.out.println(t);*/
	
	
	//反射机制
	Class<?> cls=Class.forName("com.yao.Json.getGension");//获取class对象
	;
	//获取构造器
	Constructor<?> cons=cls.getConstructor(String.class,String.class);
	Object ob=cons.newInstance("阳光","12");
	
	//获取方法
	 Object obc = cls.newInstance();
	Method mm=cls.getDeclaredMethod("getmobile",String.class);
	String result=(String) mm.invoke(obc,"123");
	System.out.println(result);
	//获取属性
	 Object obcd = cls.newInstance();
Field fil=cls.getDeclaredField("name");//获取name属性
fil.setAccessible(true); //解除封装
fil.set(obcd, "流行");
System.out.println(fil.get(obcd));
	
	
}
}
