import java.util.Scanner;

public class Words {
    private String textNumber;

    public Words(String textNumber) {
        this.textNumber = textNumber;
    }

    public String Convert(int inputNumber) {
        final String[] belowTwenty = {"ноль", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять", "десять", "одинадцать", "двенадцадь", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"};
        final String[] tens = {" ", "десять", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто"};
        final String[] hundreds = {"тысяча", "сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот", "семьсот", "восемьсот", "девятьсот"};

        String textOut = "";
        if (inputNumber < 20) {
            textOut = belowTwenty[inputNumber];
        } else if (inputNumber < 100) {
            int mid = inputNumber / 10;
            int low = inputNumber % 10;
            textOut = tens[mid];
            if (low != 0)
                textOut = textOut + " " + belowTwenty[low];
            textOut = textOut;
        } else if (inputNumber < 1000) {
            int high = inputNumber / 100;
            int midLow = inputNumber % 100;
            int mid = inputNumber / 10 % 10;
            int low = inputNumber % 10;
            textOut = hundreds[high];
            if (midLow <= 19) {
                textOut = textOut + " " + belowTwenty[midLow];
            }
            else{
                if (mid != 0)
                    textOut = textOut + " " + tens[mid];
                if (low != 0)
                    textOut = textOut + " " + belowTwenty[low];
            }
        }
        return textOut;
    }
}