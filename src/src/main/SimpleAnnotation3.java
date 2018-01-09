package src.main;

public @interface SimpleAnnotation3 {

	// Annotation with multiple attributes

	String firstName(); // this is mandatory attribute

	String lastName() default "NOOE"; // this is optional attribute, it can be left in annotation definition

	String[] parents(); // this annotation is array

	int age();

	// SimpleAnnotation3(firstName = "name", parents = {"first", second}, age = 3);
	// SimpleAnnotation3(firstName = "fname", lastName = "lname", parents = {"first", second}, age = 16);

}
