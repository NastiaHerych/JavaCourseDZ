package com.company;

public class Annnot {

    @AnnnotAnnotation(" name ")
    public String name;
    @AnnnotAnnotation(" age ")
    private int age;
    @AnnnotAnnotation(" weight ")
    private int weight;
    @AnnnotAnnotation(" height ")
    private int height;

   public Annnot(){
   }

    public Annnot(String name, int weight, int height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    public Annnot (String name, int weight){
       super();
       this.name = name;
       this.weight = weight;
    }

    public Annnot (String name,int age, int weight, int height){
       super();
       this.name = name;
       this.age = age;
       this.weight = weight;
       this.height = height;
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

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void addToGroup (int groupNumber){
        System.out.println( "Person was added to group number: " + groupNumber);
    }

    public void addKurator (String person){
        System.out.println( "Kurator: " + person);
    }

    @Override
    public String toString(){
       return "Student " + name + " Age: " + age + " Height: " + height + " Weight: " + weight;
    }

}
