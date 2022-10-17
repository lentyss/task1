import java.util.Scanner;

class Animals {

    public static void main(String args[]) {
        int a, b, c;
        Scanner in = new Scanner(System.in,"cp866"); //Кодировка и сканер

        System.out.print("\n Введите количество цыплят, коров и поросят: \n");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        System.out.print("Общее кол-во ног всех животных: ");
        System.out.print(clegs(a, b, c));
        in.close();
    }

    public static int clegs(int chickens, int cows, int pigs) {
        int rez = chickens*2 + cows*4 + pigs*4;
        return rez;
    }
}