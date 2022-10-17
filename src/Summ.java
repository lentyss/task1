import java.util.Scanner;

class Summ {

    public static void main(String[] args) {
        int a;
        Scanner in = new Scanner(System.in,"cp866"); //Кодировка и сканер
        System.out.print("\n Введите число: \n");
        a = in.nextInt();
        System.out.print(addUpTo(a));
        in.close();
    }

    public static int addUpTo(int a) {
        int rez = 0;
        for (int i = 0; i <= a; i++)
            rez += i;
        return rez;
    }
}