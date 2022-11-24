/**
 * Инкапсуляция Сеттеры и геттеры
 */
public class ClassesAndObjects {
    public static void main(String[] arsg) {
        Person person1 = new Person();
        person1.setName("КакоеТоИмя");        // Доступ к полю через метод
        person1.setAge(12);                     // Доступ к полю через метод
        System.out.println("Выводим значение в main методе: "+person1.getName());
        System.out.println("Выводим значение в main методе: "+person1.getName());
        // person1.speak();
    }
}

class Person {
    private String name;             // private - это поле доступно и видно в пределах этого класса (Person)!!!
    private int age;                // private - это поле доступно и видно в пределах этого класса (Person)!!!

    public void setName(String userName) {      // Сеттер
        if (userName.isEmpty()) {
            System.out.println("Ты ввел пустое имя"); // проеверка на ввод пустого имени
        } else {
            name = userName;
        }
    }

    public String getName() {                    // Геттер
        return name;                            // возвращаем стороку которая является полем
    }

    public void setAge(int userAge) {
        if(userAge<0){
            System.out.println("Возраст должен быть положитеьным");
        } else {
        age = userAge;}
    }

    public int getAge() {
        return age;
    }

    int calculateYearsToRetirement() {
        int years = 65 - age;
        return years;
    }

    void speak() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Меня зовут " + name + ", мне " + age + " лет");
        }
    }
}