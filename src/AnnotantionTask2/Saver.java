package AnnotantionTask2;
import java.lang.annotation.*;
import java.io.*;

public class Saver {

    public static void showString(String str) {
        System.out.println(str);
    }
        @Streamer(path = "C:\\Users\\юра\\Desktop\\file7.txt")
        public static void stream (String path,String str)throws Exception{
        FileWriter fwr = new FileWriter(path);
        try {
            fwr.write(str);
        }finally {
            fwr.close();
        }

        }
    }
