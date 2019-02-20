package AnnotantionTask1;
import java.lang.annotation.*;
@Target(value = ElementType.METHOD)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface AnnotMethod {
    int a ();
    int b ();
    int c()default (10);
}
