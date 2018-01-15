package src.main;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface SimpleAnnotation3 {

	// Annotation with multiple attributes

	String firstName(); // this is mandatory attribute

	String lastName() default "NOOE"; // this is optional attribute, it can be left in annotation definition

	String[] parent(); // this annotation is array

	int age();

	// SimpleAnnotation3(firstName = "name", parents = {"first", second}, age = 3);
	// SimpleAnnotation3(firstName = "fname", lastName = "lname", parent = {"first", "second"}, age = 16);
	// SimpleAnnotation3(firstName = "fname", lastName = "lname", parent = "single parent", age = 16);

}
