/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ComDee
 */
class Bird extends Animal implements Flyable{
//    private String name;
//    private int age;
//    private double weight;
    private double wingSpan;
    private boolean canFly;
    
    public Bird(String name,int age,double weight,double wingSpan,boolean canFly){
        super(name,age,weight);
        this.wingSpan = wingSpan;
        this.canFly = canFly;
    }
    @Override
    public void fly(){
        System.out.println("Fly");
    }
    
    public void layEgg(){
        System.out.println("Egg");
    }

//    /**
//     * @return the name
//     */
//    @Override
//    public String getName() {
//        return name;
//    }
//
//    /**
//     * @param name the name to set
//     */
//    @Override
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    /**
//     * @return the age
//     */
//    @Override
//    public int getAge() {
//        return age;
//    }
//
//    /**
//     * @param age the age to set
//     */
//    @Override
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    /**
//     * @return the weight
//     */
//    @Override
//    public double getWeight() {
//        return weight;
//    }
//
//    /**
//     * @param weight the weight to set
//     */
//    @Override
//    public void setWeight(double weight) {
//        this.weight = weight;
//    }

    /**
     * @return the wingSpan
     */
    public double getWingSpan() {
        return wingSpan;
    }

    /**
     * @param wingSpan the wingSpan to set
     */
    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }

    /**
     * @return the canFly
     */
    public boolean isCanFly() {
        return canFly;
    }

    /**
     * @param canFly the canFly to set
     */
    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }
    @Override
    public String toString() {
        return String.format("name=%s,age=%d,weight=%f,wingSpan=%f,canFly=%b",getName(), getAge(), getWeight(),wingSpan,canFly);
    }
    
}
