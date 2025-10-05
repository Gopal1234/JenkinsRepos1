package controller;
/*@MyAnnotation(
    author = "John Doe",
    date = "2025-01-27",
    description = "This is a demo class annotated with MyAnnotation"
)*/
public class DemoClass {

    @MyAnnotation(
        author = "Jane Doe",
        date = "2025-01-28",
        description = "This method performs a simple task",
        
       id=20
    		
    		)
    public void myMethod() {
        System.out.println("Executing annotated method...");
    }

    public static void main(String[] args) {
        DemoClass obj = new DemoClass();
        obj.myMethod();

        // Access annotation metadata using reflection
        MyAnnotation classAnnotation = DemoClass.class.getAnnotation(MyAnnotation.class);
        if (classAnnotation != null) {
            System.out.println("Class Annotation Metadata:");
            System.out.println("Author: " + classAnnotation.author());
            System.out.println("Date: " + classAnnotation.date());
            System.out.println("Description: " + classAnnotation.description());
        }
    }
}
