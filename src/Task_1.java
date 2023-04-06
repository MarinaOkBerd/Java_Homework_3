import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Task_1 {

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
        selectionSort(numbers);
        System.out.println(Arrays.toString(numbers.toArray()));
        int[] numbers2 = new int[Len];
        for (int i = 0; i < numbers2.length; i++) {
            numbers2[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(numbers2));
        mergeSort(numbers2, Len);
        System.out.println(Arrays.toString(numbers2));
        }

        public static void selectionSort(List<Integer> list) {
            for (int i = 0; i < list.size() - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < list.size(); j++) {
                    if (list.get(j) < list.get(minIndex)){
                        minIndex = j;
                    }   
                }
                int list_2 = list.get(i);
                list.set(i, list.get(minIndex));
                list.set(minIndex, list_2);    
            }
        }
        
        public static void mergeSort(int[] a, int n) {
            if (n < 2) {
                return;
            }
            int mid = n / 2;
            int[] l = new int[mid];
            int[] r = new int[n - mid];
        
            for (int i = 0; i < mid; i++) {
                l[i] = a[i];
            }
            for (int i = mid; i < n; i++) {
                r[i - mid] = a[i];
            }
            mergeSort(l, mid);
            mergeSort(r, n - mid);
            merge(a, l, r, mid, n - mid);
        }

        public static void merge(int[] a, int[] l, int[] r, int left, int right) {
            int i = 0, j = 0, k = 0;
            while (i < left && j < right) {
                if (l[i] <= r[j]) {
                    a[k++] = l[i++];
                }
                else {
                    a[k++] = r[j++];
                }
            }
            while (i < left) {
                a[k++] = l[i++];
            }
            while (j < right) {
                a[k++] = r[j++];
            }
        }
    }
