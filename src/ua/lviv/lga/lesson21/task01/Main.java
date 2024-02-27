package ua.lviv.lga.lesson21.task01;

import ua.lviv.lga.lesson21.exampl.Fielder;

import java.io.*;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        File file = new File("annotation.txt");
        List<String> list = new ArrayList<String>();
        list = getAnnotationBook(Book.class);
        writeToFile(file, list);
    }

    public static List<String> getAnnotationBook(Class<?> customClass) throws Exception {
        Field[] fields = customClass.getDeclaredFields();
        List<String> list = new ArrayList<String>();

        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            BookAnnotation ff = field.getAnnotation(BookAnnotation.class);
            if (ff instanceof BookAnnotation) {
                System.out.println(field.getType().getSimpleName() + " " + field.getName() + "    info: " + ff.param());
                list.add(field.getType().getSimpleName() + " " + field.getName() + " " + ff.param());


            }
        }
        return (list);
    }

    public static void writeToFile(File file, Object obj) throws Exception {

        OutputStream os = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(os);
        oos.writeObject(obj);
        if (os != null) os.close();
        if (oos != null) oos.close();

    }

}
