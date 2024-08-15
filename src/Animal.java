/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ComDee
 */
class Animal {
    private String name;
    private int age;
    private double weight;
    
    public Animal(String name,int age,double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    void eat(){
        System.out.println("EAT");
    }
    void sleep(){
        System.out.println("Zzz..");
    }
    void makeSound(){
        System.out.println("Makesound");
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public int setAge(int age) {
        this.age = age;
        return this.age;
    }

    /**
     * @return the weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }
    @Override
    public String toString() {
        return String.format("name=%s,age=%d,weight=%f",getName(), getAge(), getWeight());
    }
}
