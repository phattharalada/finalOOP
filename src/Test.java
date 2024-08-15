/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ComDee
 */
public class Test {
    public static void main(String[] args) {
        //class Mammal & class  bird
        Animal mammal = new Mammal("Mam",2,100.0,"Gray",true);
        Animal bird = new Bird("BB",5,20.0,10.0,true);
        System.out.println(mammal.toString());
        System.out.println(bird.toString());
        //class Animal
        Animal a = new Animal("n",5,5.0);
        System.out.println(a.toString());
        //test method Getter
        System.out.println(mammal.getName());
        System.out.println(bird.getName());
        //test method Setter
        System.out.println(mammal.setAge(20));
        
        
    }
}
