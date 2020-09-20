package com.company;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException,
            IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {

        Class newClass = NewClass.class;

        System.out.println("Information about class:");
        System.out.println();
        System.out.println("Class name: " + newClass.getName());
        System.out.println("Parent`s class: " + newClass.getSuperclass());
        System.out.println("Package class: " + newClass.getPackage());
        System.out.println("Simple name: " + newClass.getSimpleName());
        System.out.println();

        System.out.println("Field:");
        Field[] newClassFields = newClass.getDeclaredFields();
        for (Field field : newClassFields) {
            System.out.println("Field: " + field);
        }
        System.out.println("Field lenght: " + newClassFields.length);
        System.out.println();


        System.out.println("Constructors: ");
        Constructor[] newClassConstructors = newClass.getConstructors();
        for (Constructor constructor : newClassConstructors) {
            System.out.println("Constructor " + constructor);
        }
        System.out.println("Number of constructors: " + newClassConstructors.length);
        System.out.println();


        System.out.println("Methods: ");
        Method[] newClassMethods = newClass.getMethods();
        for (Method method : newClassMethods) {
            System.out.println("Method: " + method);
        }
        System.out.println("Number of methods:" + newClassMethods.length);
        System.out.println();


        System.out.println("Add new animal with reflection");
        Constructor <NewClass> constructor = newClass.getConstructor(String.class, String.class, int.class, int.class);
        NewClass newInstance = constructor.newInstance("dog", "Rex", 2, 21);
        System.out.println(newInstance);
        System.out.println();

        System.out.println("Add animal`s age with reflection ");
        Method newClassMethod = newClass.getMethod("setAge", int.class);
        newClassMethod.invoke(newInstance, 3);
        System.out.println(newInstance);
        System.out.println();

        System.out.println("Add animal`s weight with reflection ");
        Method newClassMethod2 = newClass.getMethod("setWeight", int.class);
        newClassMethod2.invoke(newInstance, 33);
        System.out.println(newInstance);
        System.out.println();

        System.out.println("Replace name with reflection");
        Field fieldName = newClass.getField("name");
        fieldName.set(newInstance, "Ben");
        System.out.println(newInstance);
        System.out.println();

        System.out.println("Put animal on auction");
        newClassMethod = newClass.getMethod("InAuction", int.class);
        newClassMethod.invoke(newInstance, 7);
        System.out.println();

        System.out.println("Add animal to person with reflection");
        newClassMethod = newClass.getMethod("WasTakenBy", String.class);
        newClassMethod.invoke(newInstance, "Nastia");

    }
}
