package com.company;

import java.io.*;

public class Methods {

    public static void serialize (Serializable object, File file) throws IOException{
        OutputStream outputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(object);
        outputStream.close();
        objectOutputStream.close();
    }

    public static Serializable deserealize(File file) throws IOException, ClassNotFoundException {
        InputStream inputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        Serializable object = (Serializable) objectInputStream.readObject();
        objectInputStream.close();
        inputStream.close();
        return object;
    }



}
