package com.annotation;


	import java.lang.reflect.Modifier;

	class MyFoo {
		
		@MyAnno(hello = "we all are champ", isDone = true)
		public void doWork() {
			System.out.println("some logic...");
		}
	}

	public class DemoAnnProcessing {
		public static void main(String[] args) throws ClassNotFoundException {
			
//			MyFoo foo = new MyFoo();
//			foo.doWork();
			
			// Annotation processing: java reflectin
			
			Class clazz  = Class.forName("com.annotation.MyFoo");
			
			java.lang.reflect.Method[] methods = clazz.getDeclaredMethods();
			
			for(java.lang.reflect.Method m: methods) {
				System.out.println(m.getName());
				if(m.isAnnotationPresent(MyAnno.class)) {
					MyAnno ann = m.getDeclaredAnnotation(MyAnno.class);
					System.out.println(ann.isDone());
					System.out.println(ann.hello());
				}
			}
		}
	}


