package com.company;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void makeFile(Object object, File file) throws IOException {
        OutputStream outputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(object);
        objectOutputStream.close();
        outputStream.close();
    }

    public static void addToList(List<String> list, File file) throws IOException {
        Files.write(file.toPath(), list);
    }

    public static List<String> getValues(Class<?> customClass) {
        List<String> values = new ArrayList<String>();
        Field[] classFields = customClass.getDeclaredFields();
        for (int i = 0; i < classFields.length; i++) {
            Field field = classFields[i];
            if (field.getAnnotation(AnnnotAnnotation.class) instanceof AnnnotAnnotation) {
                values.add(field.getType().getSimpleName() + " " + field.getName() + " ---> "
                        + field.getAnnotation(AnnnotAnnotation.class).value());
            }
        }
        return values;
    }


    public static void main(String[] args) throws IOException {
        List<String> annotationValuesList = getValues(Annnot.class);
        for (String string : annotationValuesList) {
            System.out.println(string);
        }
        makeFile(annotationValuesList, new File("AnnnotAnnotation.obj"));
       addToList(annotationValuesList, new File("AnnnotAnnotation.txt"));
    }
}
