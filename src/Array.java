import java.util.Random;

public class Array {
    private int[] numbersArr;
    private int rangeOfArray;

    public Array(int rangeOfArray) {
        this.rangeOfArray = rangeOfArray;
        int[] arr = new int[rangeOfArray];
        this.numbersArr = arr;
    }

    private static Array FillRandom(Array workArray) {
        Random randomNum = new Random();
        for (int i = 0; i < workArray.rangeOfArray; i++) {
            workArray.numbersArr[i] = randomNum.nextInt(100);
        }
        return workArray;
    }

    public static int getAvarage(Array workArray) {
        workArray = FillRandom(workArray);
        int arrSum = 0, count = 0;
        for (int i = 0; i < workArray.rangeOfArray; i++) {
            arrSum += workArray.numbersArr[i];
            count++;
        }
        return arrSum / count;
    }

    public static String[] PrintArray(Array workArray, int limit) {
        workArray = FillRandom(workArray);
        String[] arr = new String[limit];
        for (int i = 0; i < limit; i++) {
            if (workArray.numbersArr[i] % 2 == 0)
                arr[i] = String.format("%d!!!", workArray.numbersArr[i]);
            else
                arr[i] = String.format("%d", workArray.numbersArr[i]);
        }
        return arr;
    }
}
