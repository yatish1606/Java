public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(3,12));
        System.out.println(calcFeetAndInchesToCentimeters(45.0));
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if(feet < 0 || (inches < 0 && inches > 12)) {
            return  -1;
        }

        double centimeters = feet * 30 + inches * 2.54;
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if(inches < 0) {
            return  -1;
        }

        double feet = inches/12;

        return calcFeetAndInchesToCentimeters(feet,inches);

    }
}
