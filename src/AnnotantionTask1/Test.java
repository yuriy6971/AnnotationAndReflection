package AnnotantionTask1;
import java.lang.annotation.*;

public class Test {

    public static void printer (String str){
        System.out.println(str);
    }
    public static int sumMethod (int a,int b){
        return (a + b) / 2;
    }
    @AnnotMethod(a = 5, b = 8)
    public static double sgrtsumMetod (int a,int b, int c){
        double s = Math.sqrt(a + b + c);
        return s;
    }
}
