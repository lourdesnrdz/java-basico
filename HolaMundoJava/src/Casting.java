public class Casting {
    public static void main(String[] args) {
        //En un año ubicar 30 perrotos
        //Cuantos perritos ubique al mes

        double monthlyDogs = 30.0 / 12.0;
        System.out.println(monthlyDogs);

        //Estimación
        // se truncan los decimales
        // no se redondea
        int estimatedMonthlyDogs = (int) monthlyDogs;
        System.out.println(estimatedMonthlyDogs);

        //Exactitud
        int a = 30;
        int b = 12;
        System.out.println((double) a/b);

        // el resultado de la division entera
        // solo la castea a double
        double c = (double) a / b;
        System.out.println(c);

        char n = '1';
        int nI = n; //ASCII

        System.out.println(nI);

        short nS = (short) n;
        System.out.println(nS);
    }
}
