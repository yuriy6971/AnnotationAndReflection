package AnnotantionTask2;
import java.lang.annotation.*;

@Target(value = ElementType.METHOD)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface Streamer {
    String path();
}
