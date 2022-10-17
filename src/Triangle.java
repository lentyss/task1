import java.util.Scanner;

class Triangle {

    public static void main(String[] args) {
        int a, b = 1;
        Scanner in = new Scanner(System.in,"cp866"); //Кодировка и сканер
        while(b != 0) {
            System.out.print("\n Введите основание и высоту: \n");
            a = in.nextInt();
            b = in.nextInt();
            System.out.print("Площадь треугольника: ");
            System.out.print(triArea(a, b));
        }
        in.close();
    }

    public static int triArea(int o, int h) {
        return o * h / 2;
    }
}