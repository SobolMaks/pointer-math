public class MyMath {

      static   final double Pi = 3.14;
      static   final double r = 10;


        public static double Perimeter(double r, double Pi) {
            double Perimeter = 2 * (Pi * r);
            return Perimeter;
        }

        public static double Area(double r, double Pi) {
                double Area = Pi * r * r;
                return Area;

               }

        public static double Volume(double r, double Pi) {

                double Volume = 4 / 3 * Pi * r * r * r;
                return Volume;
        }
}






