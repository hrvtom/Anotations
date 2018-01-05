
public @interface SimpleAnnotation3 {

	// Annotation with multiple attributes

	String firstName(); // this is mandatory attribute

	String lastName() default "NOOE"; // this is optional attribute, it can be left in annotation definition

	String[] parents(); // this annotation is array

}
