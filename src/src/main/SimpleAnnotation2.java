package src.main;

public @interface SimpleAnnotation2 {

	// this is simple annotation with one mandatory attribute
	// argument value must be defined in annotation but since it is the only argument in annotation
	// instead of @SimpleAnnptation2(value="some string") it can be used like
	// @SimpleAnnotation2("some string")

	String value();
}
