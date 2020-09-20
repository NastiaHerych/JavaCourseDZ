package com.company;

public class NewClass {

    public String type;
    public String name;
    private int age;
    private int weight;

    public NewClass(){
    }

    public NewClass(String type, String name, int age, int weight){
       super();
        this.name = name;
        this.type = type;
        this.age = age;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void InAuction (int number){
        System.out.println("An animal was put on auction under number " + number);
    }

    public void WasTakenBy (String person){
        System.out.println("Person " + person + " has take an animal");
    }

    @Override
    public String toString(){
        return "Animal " + type + " name: " + name + " age: "
                + age + " weight: " + weight;
    }

}
