import java.util.Scanner;

class Remainder {

    public static void main(String[] args) {
        int a, b = 1;
        Scanner in = new Scanner(System.in,"cp866"); //Кодировка и сканер
        while(b != 0) {
            System.out.print("\n Введите a, b: \n");
            a = in.nextInt();
            b = in.nextInt();
            System.out.print("Остаток от деления: ");
            System.out.print(remaind(a, b));
        }
        in.close();
    }

    public static int remaind(int del, int ch) {
        return del % ch;
    }
}