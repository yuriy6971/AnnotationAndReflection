package AnnotantionTask1;
import java.lang.annotation.*;
import java.lang.reflect.*;


public class TestMain {
    public static void main(String[] args)throws Exception {
        Class<?> cls = Test.class;// получаем объект ,описывающий класс Test

        Method [] met = cls.getDeclaredMethods();// получаем массив объектов типа Method,список методов класса Test.
        for (Method method : met){ // с помощью цикла и оператора сравнеия достаем из списка аннотированный метод.
            if (method.isAnnotationPresent(AnnotMethod.class)){
                AnnotMethod ann = method.getAnnotation(AnnotMethod.class);// по типу аннотации получаем связанный с ней объект.
                double result = (Double) method.invoke(null,ann.a(),ann.b(),ann.c());// передаем в метод параметры аннотации.
                System.out.println(result);
            }
        }

    }
}
