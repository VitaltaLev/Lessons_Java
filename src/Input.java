/**
 * Ввод данных. Класс сканер https://www.youtube.com/watch?v=Y2iB_DwdyfM&list=PLAma_mKffTOSUkXp26rgdnC0PicnmnDak&index=7
 */
import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);         // Scanner - это класс, а new Scanner - новый объект коасса Scanner s - ссылается на объект класса сканер
        System.out.println("введите что-нибуть");   // вывод сообщения
        String string = s.nextLine();               // Создаем новый объект класса String и ссылаем на то что введем с клавиатуры метод nextLine (в String хранятся данные с клавиатуры)
        System.out.println("Вы ввели "+string);     // Выводим сообщение
    }
}
