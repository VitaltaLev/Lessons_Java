/**
 * Инкапсуляция Сеттеры и геттеры
 */
public class ClassesAndObjects {
    public static void main(String[] arsg) {
        Person person1 = new Person();
        person1.name = "КакоетоИмя"; // мы обращаемся к полям  строка кода 13, 14 через точку (прямое обращение)
        person1.age = 12;
    }
}

class Person{
    String name;                    // при смене имени данного поля придется переименовывать строку 7
    int age;

    int calculateYearsToRetirement(){
        int years = 65-age;
        return years;
    }
    void speak(){
        for(int i = 0; i<3; i++);{
        System.out.println("Меня зовут "+ name+ ", мне "+age+" лет");}
    }
}