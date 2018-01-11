package src.main;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface SimpleAnnotation2 {

	// this is simple annotation with one mandatory attribute
	// argument value must be defined in annotation but since it is the only argument in annotation
	// instead of @SimpleAnnptation2(value="some string") it can be used like
	// @SimpleAnnotation2("some string")

	String value();
}
