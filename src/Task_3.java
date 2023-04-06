import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Task_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int Len = scanner.nextInt();
        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < Len; i++) {
            numbers.add(random.nextInt(100));    
        }
        System.out.println(numbers);
        System.out.println(Collections.max(numbers));
        System.out.println(Collections.min(numbers));
        System.out.println(numbers.stream().mapToInt(Integer::intValue).average());
    }  
}

    

