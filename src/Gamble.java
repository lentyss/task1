import java.util.Scanner;

class Gamble {

    public static void main(String[] args) {
        float a;
        int b, c;
        Scanner in = new Scanner(System.in,"cp866"); //Кодировка и сканер
        System.out.print("\n Введите аргументы: \n");
        a = in.nextFloat();
        b = in.nextInt();
        c = in.nextInt();
        System.out.print(profitableGamble(a, b, c));
        in.close();
    }

    public static boolean profitableGamble(float prob, int prize, int pay) {
        if (prob * prize > pay)
            return true;
        return false;
    }
}