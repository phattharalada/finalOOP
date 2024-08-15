/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ComDee
 */
public class Mammal extends Animal {

//    private String name;
//    private int age;
//    private double weight;
    private String fulColor;
    private boolean isDomestic;

    public Mammal(String name, int age, double weight, String fulColor, boolean isDomestic) {
        super(name, age, weight);
        this.fulColor = fulColor;
        this.isDomestic = isDomestic;
    }

    public void nurseYoung() {
        System.out.println("???");
    }

    public void nurseYoung(String name) {
        System.out.println("?");
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
     * @return the fulColor
     */
    public String getFulColor() {
        return fulColor;
    }

    /**
     * @param fulColor the fulColor to set
     */
    public void setFulColor(String fulColor) {
        this.fulColor = fulColor;
    }

    /**
     * @return the isDomestic
     */
    public boolean isIsDomestic() {
        return isDomestic;
    }

    /**
     * @param isDomestic the isDomestic to set
     */
    public void setIsDomestic(boolean isDomestic) {
        this.isDomestic = isDomestic;
    }

    @Override
    public String toString() {
        return String.format("name=%s,age=%d,weight=%f,fulColor=%s,isDomestic=%b", getName(), getAge(), getWeight(), fulColor, isDomestic);
    }
}
