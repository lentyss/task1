import java.util.Scanner;

class Calculator {

    public static void main(String[] args) {
        int a, b, rez;
        Scanner in = new Scanner(System.in,"cp866"); //Кодировка и сканер
        System.out.print("\n Введите а и b, и результат: \n");
        a = in.nextInt();
        b = in.nextInt();
        rez = in.nextInt();
        System.out.print(operation(a, b, rez));
        in.close();
    }

    public static String operation(int a, int b, int N) {
        if (a + b == N)
            return "added";
        else if (a - b == N)
            return "subtracted";
        else if (a * b == N)
            return "multiplied";
        else if (a / b == N)
            return "divided";
        else
            return "none";
    }
}