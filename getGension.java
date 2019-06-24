package com.yao.Json;

import java.lang.reflect.Method;

public class getGension {
private String name;
private String age;
public getGension() {
	System.out.println("调用无参的构造方法！");
}
public getGension(String name,String age) {
	this.name=name;
	this.age=age;
	System.out.println(name+age);
}
public getGension(String name) {
	this.name=name;
}
public String getmobile(String a) {
	String b="+86"+a;
	return b;
	
	/*String mobile="+86"+a;
	return mobile;*/
	
}
}
