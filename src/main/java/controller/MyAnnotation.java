package controller;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Define the annotation
@Retention(RetentionPolicy.RUNTIME) // Annotation will be available at runtime
@Target({ElementType.TYPE, ElementType.METHOD}) // Can be applied to classes and methods
public @interface MyAnnotation {
    String author(); // Element for author
    String date();   // Element for date
    String description() default "No description provided"; // Default value
   int id();
}
