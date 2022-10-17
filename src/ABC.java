import java.util.Scanner;

class ABC {

    public static void main(String[] args) {
        int a, b, c;
        Scanner in = new Scanner(System.in,"cp866"); //Кодировка и сканер
        System.out.print("\n Введите числа: \n");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        System.out.print(abcmath(a, b, c));
        in.close();
    }

    public static boolean abcmath(int a, int b, int c) {
        if ((a * Math.pow(2, b)) % c == 0)
            return true;
        return false;
    }
}
