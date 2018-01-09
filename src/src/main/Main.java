package src.main;

import static java.lang.System.out;

import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) {

		// If there is no instance than it is possible to use .class
		Class<?> tcClass = TestClass.class;
		Class<?> bClass = boolean.class;
		boolean b;
		// Class bClass = b.getClass(); // this is error, also .getClass can't be invoked on primitive type
		TestClass tc = new TestClass();
		tcClass = tc.getClass();

		out.format("Class name %s%n", bClass.getName());
		out.format("Cannonical class name %s%n", bClass.getCanonicalName());
		out.format("Class name %s%n", tcClass.getName());
		out.format("Cannonical class name %s%n", tcClass.getCanonicalName());
		Method[] methods = tcClass.getDeclaredMethods();

		for (Method method : methods) {
			out.format(" %s%n", method.toGenericString());
		}
	}

}
