public class Funtions {

    public static void main(String[] args) {
        double y = 3;
        //Area de un circulo
        //pi * r^2
        double area = circleArea(y);
        System.out.println(circleArea(y));

        //Area de una esfera
        //4*PI*r^2
        System.out.println(sphereArea(y));

        // Volumen de una esfera
        // (4/3) * PI * r^3
        System.out.println(sphereVolume(y));

        System.out.println("Pesos a Dolares: " + convertToDolar(1000, "COP"));
    }

    public static double circleArea(double r) {
        return Math.PI * Math.pow(r, 2);
    }

    public static double sphereArea(double r) {
        return 4 * Math.PI * Math.pow(r, 2);
    }

    public static double sphereVolume(double r) {
        return (4/3) * Math.PI * Math.pow(r, 3);
    }

    public static double convertToDolar(double quantity, String currency) {
        switch (currency) {
            case "MXN":
                quantity = quantity * 0.052;
                break;
            case "COP":
                quantity = quantity * 0.00031;
                break;
        }
        return quantity;
    }
}
