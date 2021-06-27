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

    /**
     * Calculate the area of a circle
     * @param r radius value
     * @return value of area of circle
     */
    public static double circleArea(double r) {
        return Math.PI * Math.pow(r, 2);
    }

    /**
     * Calculate the area of a sphere
     * @param r radius value
     * @return value of area of sphere
     */
    public static double sphereArea(double r) {
        return 4 * Math.PI * Math.pow(r, 2);
    }

    /**
     * Calculate the volume of a sphere
     * @param r radius value
     * @return value of volume of sphere
     */
    public static double sphereVolume(double r) {
        return (4/3) * Math.PI * Math.pow(r, 3);
    }

    /**
     * Description: Función que especificando su moneda convierte una cantidad de dinero a dolares
     * @param quantity Cantidad de dinero
     * @param currency Tipo de moneda: Solo acepta MXN o COP
     * @return quantity Devuelve la cantidad actualizada en Dolares
     */
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
