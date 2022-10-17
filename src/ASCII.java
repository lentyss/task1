import java.util.Scanner;

class ASCII {

    public static void main(String[] args) {
        char s;
        Scanner in = new Scanner(System.in,"cp866"); //Кодировка и сканер
        System.out.print("\n Введите символ: \n");
        s = in.next().charAt(0);
        System.out.print(ctoa(s));
        in.close();
    }

    public static int ctoa(char symb) {
        return (int)symb;
    }
}