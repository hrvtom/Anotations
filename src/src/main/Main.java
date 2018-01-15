package src.main;

import static java.lang.System.out;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;

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

		for (Method method : methods) { // methods of the TestClass
			// For repeatable annotations .getDeclaredAnnotations() returns Container Annotation
			Annotation[] annotations = method.getDeclaredAnnotations();
			readAnnotations(annotations);
			out.format(" %s%n%n", method.toGenericString());

		}

		// repeatable annotation
		out.println(">>>> Repaetable annotations <<<<");
		try {
			Method method = tcClass.getDeclaredMethod("methodSix", (Class<?>[]) null);
			// .getDeclaredAnnotaionsByType() returns all declared annotations of this type, repeatable or not
			// doesn't return repeatable container
			Annotation[] rannotations = method.getDeclaredAnnotationsByType(SimpleAnnotation4.class);
			readAnnotations(rannotations);
			out.format(" %s%n%n", method.toGenericString());

		} catch (Exception e) {
			out.println("Shit happened " + e.toString());
		}
	}

	private static void readAnnotations(Annotation[] annotations) {
		if (annotations.length == 0)
			out.println("No Annotations");
		for (Annotation annotation : annotations) {// Annotations of for each TestClass method
			out.format("     %s%n", annotation.toString());
			// Each Annotation is also a Class
			Class aclass = annotation.annotationType(); // this is annotation's class
			Method[] amethods = aclass.getDeclaredMethods(); // Annotation's parameters are actually Annotation's
																// class
																// methods

			out.println("     Default values");
			for (Method amethod : amethods) { // get the value of each annotation parameter
				out.format("           %s = %s%n", amethod.getName(), amethod.getDefaultValue());
			}
			out.println("     Actuall values"); // calling the method(parameter) will get us the parameter value
			for (Method amethod : amethods) { // get the value of each annotation parameter
				try {
					Object value = amethod.invoke(annotation, (Object[]) null);
					if (value instanceof Object[]) {
						out.format("           %s = %s%n", amethod.getName(), Arrays.toString((Object[]) value));
					} else {
						out.format("           %s = %s%n", amethod.getName(), value);
					}
				} catch (Exception e) {
					out.format("Failed to get the value %s for the attribute %s%n", amethod.getName(),
							aclass.getName());
				}
			}

		}

	}

}
