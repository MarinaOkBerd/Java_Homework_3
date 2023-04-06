import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int Len = scanner.nextInt();
        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < Len; i++) {
            numbers.add(random.nextInt(100));    
        }
        System.out.print(numbers);
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) % 2 != 0){
                result.add(numbers.get(i));
            }    
        }
        System.out.print(result);
    }  
}
