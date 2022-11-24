/**
 * Цикл for https://www.youtube.com/watch?v=UYbdAmgcNVc&list=PLAma_mKffTOSUkXp26rgdnC0PicnmnDak&index=5
 */
public class ForLoop {
    public static void main(String[] arsg) {
        for(int i = 10; i>=10; i = i-5){ // i = 0 стартовая позиция итерации;  i<=10 - условие при ктором будет выполняться итерация;i++ функция которая будет выполняться при итерации
            System.out.println("Hello"+ i);        // i++ == i == i + 1 (true)
        }
    }
}
