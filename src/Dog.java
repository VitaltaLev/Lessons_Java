/**
* насследование
*/
public class Dog extends Animal{ // класс Dog является Animal так как он унаследовался от Animal (класс dog расширяет(extends) класс Animal
       public void eat() {
           System.out.println("Dog is eating");
    }
    public void bark(){ // создадим метод только для собаки (только собака умеет лаять)
        System.out.println("I am barking"); }
    public void showName() {
            System.out.println(name);
    }
}
