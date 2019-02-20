package AnnotantionTask2;
import java.lang.annotation.*;
import java.lang.reflect.*;
import java.io.FileWriter;

public class TestMain1 {
    public static void main(String[] args)throws Exception {
        TextContainer tx = new TextContainer();
        String string = tx.str;
        Class<?> cls = Saver.class;
        Method [] met = cls.getDeclaredMethods();
        for (Method method : met){
            if (method.isAnnotationPresent(Streamer.class)){
                Streamer stream1 = method.getAnnotation(Streamer.class);
                method.invoke(null,stream1.path(),string);
            }
        }
    }
}
