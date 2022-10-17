import java.util.Scanner;

class Edge {

    public static void main(String[] args) {
        int a, b;
        Scanner in = new Scanner(System.in,"cp866"); //Кодировка и сканер
        System.out.print("\n Введите символ: \n");
        a = in.nextInt();
        b = in.nextInt();
        System.out.print(nextEdge(a, b));
        in.close();
    }

    public static int nextEdge(int a, int b) {
        return a+b-1;
    }
}