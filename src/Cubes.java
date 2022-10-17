import java.util.Scanner;

public class Cubes {
    public static void main(String args[]){
        String numbers;
        Scanner in = new Scanner(System.in, "cp866");
        System.out.print("Введите массив чисел: ");
        numbers = in.nextLine();
        String arraystring[] = numbers.split(" ");
        Integer cubes[] = new Integer[arraystring.length];
        for (int i = 0; i < arraystring.length; i++) {
            cubes[i] = Integer.parseInt(arraystring[i]);
        }
        System.out.printf("Сумма кубов: %d \n", sumOfCubes(cubes));
    }
    public static int sumOfCubes(Integer[] cubes){
        int sum_cub = 0;
        for (int i = 0; i < cubes.length; i++){
            sum_cub += Math.pow(cubes[i], 3);
        }
        return sum_cub;
    }
}