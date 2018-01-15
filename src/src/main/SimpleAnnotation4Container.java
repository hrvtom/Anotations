package src.main;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// this class is container for the repeatable annotations
@Retention(RetentionPolicy.RUNTIME) // Annotated the same as annotation
@Target(ElementType.METHOD)
public @interface SimpleAnnotation4Container {
	SimpleAnnotation4[] value();
}
