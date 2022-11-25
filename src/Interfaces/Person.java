package Interfaces;

public class Person implements Info { //Класс обязан реализовывать в себе метод showInfo
    public String name;

    public Person(String name){
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello");
    }
    @Override
    public void showInfo(){ //Сигнатура метода
        System.out.println("Name is "+this.name);
    }
}
