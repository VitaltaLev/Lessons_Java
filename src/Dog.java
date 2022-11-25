/**
* насследование
*/
public class Dog extends Animal{ // класс Dog является Animal так как он унаследовался от Animal (класс dog расширяет(extends) класс Animal
    public void bark(){ // создадим метод только для собаки (только собака умеет лаять)
        System.out.println("I am barking");

    }
}
