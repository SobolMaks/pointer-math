public class MyMath {

    public static void main(String[] args) {


            final double Pi;
            Pi = 3.14;
            final double a = 10;
            final double b = 25;
            double Perimeter1 = 2 * Pi * a;
            double Perimeter2 = 2 * Pi * b;
            System.out.println("Якщо радиус 10 см топериметр круга дорівнює " + Perimeter1 + ", а якщо радиус 25 см то периметр круга дорівнює " + Perimeter2);

            double Area1 = Pi * a * a;
            double Area2 = Pi * b * b;
            System.out.println("Якщо радиус 10 см площа круга буде  " + Area1 + ", а якщо радиус 25 см то площа круга буде " + Area2);


            double Volumel = 4 / 3 * Pi * a * a * a;
            double Volume2 = 4 / 3 * Pi * b * b * b;
            System.out.println("Якщо радиус 10 см обьем шара буде" + Volumel + ", а якщо радиус 25 см то обьем шара буде " + Volume2);
        }
    }


