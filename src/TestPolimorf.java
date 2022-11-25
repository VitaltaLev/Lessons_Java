/**
 * Полиморфизм
 */
public class TestPolimorf {
    public static void main(String[] args) {
        Animal animal = new Animal();           // В методе main создаем объект этого класса (новое Животное)
        Dog dog = new Dog();                    // новая собака
        animal.sleep();                           // Вызываем метод eat уживотного
        dog.eat();                              // Вызываем метод eat собаки у объекта класса dog есть метод eat только потому что он уаследовал его от родительского класса animal
        dog.bark();                             // вызываем метод который достался
        dog.showName();
    }
}
