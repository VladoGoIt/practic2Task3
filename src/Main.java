import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double a;
        double b;
        double c;


        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter firs side");
            a = scanner.nextDouble();

            System.out.println("Enter second side");
            b = scanner.nextDouble();

            System.out.println("Enter third side");
            c = scanner.nextDouble();

            double area = triangleArea(a, b, c);

            System.out.println(area);
            System.out.println("______________________");
            System.out.println();
            System.out.println();
            System.out.println();
            int v;

            int f;
            int h;
            int j;

            int x;
            int m;


        }






    }

    public static double triangleArea(double a, double b, double c){
        double p = (a+b+c)/2;
        double s = Math.sqrt((p*(p-a)*(p-b)*(p-c)));
        return s;
    }

}
