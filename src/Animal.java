/**
 * Полиморфизм
 */
public class Animal {
    String name = "Sum animal";
    public void eat() {             // Животное умеет есть, мы класс снабдили методом eat
        System.out.println("Animal am eating");
    }
    public void sleep() {            // Животное умеет есть, мы класс снабдили методом eat
        System.out.println("I am slipping");
    }
    public void showName(){
            System.out.println(name);
    }
}