import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("What to do?");
            System.out.println("1 - first task");
            System.out.println("2 - second task");
            System.out.println("3 - third task");
            System.out.println("4 - fourth task");

            int choice = in.nextInt();

            if (choice == 1) {
                System.out.println("ведите желаемый номер чесла Фибоначчи:");
                int numberIn = in.nextInt();
                FibNum countFib = new FibNum(1, 1);
                String[] text = new String[50];
                for (int i = 0; i < numberIn; i++) {
                    text = countFib.getCurrent(numberIn);
                    System.out.println(text[i]);
                }
            } else if (choice == 2) {
                System.out.println("Введите размерность необходимого массива:");
                int numberIn = in.nextInt();
                System.out.println("Сколько чисел вы хотите вывести?");
                int limit = in.nextInt();
                Array startArray = new Array(numberIn);
                String[] arr = Array.PrintArray(startArray, limit);
                for(int i = 0; i < limit; i++){
                    System.out.println(arr[i]);
                }
            } else if (choice == 3) {
                System.out.println("Введите размерность необходимого массива:");
                int numberIn = in.nextInt();
                Array avarageValue = new Array(numberIn);
                int result;
                result = Array.getAvarage(avarageValue);
                System.out.println(result);
            }else if (choice == 4) {
                System.out.println("Введите число, которое хотите вывести в текстовом формате(<1000):4");
                int numberIn = in.nextInt();
                String text;
                Words converter = new Words("");
                text = converter.Convert(numberIn);
                System.out.println(text);
            }else {
                break;
            }
        }
        in.close();
    }
}