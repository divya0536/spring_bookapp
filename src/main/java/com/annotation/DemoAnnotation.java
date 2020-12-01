package com.annotation;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("serial")
class Foo implements Serializable{
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void usingCollection() {
		List list = new ArrayList();
		list.add(10);
	}
	
	@Deprecated
	public void oldApi() {
		System.out.println("written ub 2005");
	}
	
	public void newApi() {
		System.out.println("written ub 2005");
	}
	
}

public class DemoAnnotation{
	
	public static void main(String[] args) {
		Foo f = new Foo();
		f.oldApi();
	}
	

}


