public class Excercise {
    public static void main(String[] args) {
        //Excercise 1
        //My Name
        String myName = "Lourdes";
        String momName = "Mireya";
        String sisName = "Fabi";
        String broName = "Pepe";

        // I have 2 siblings
        int numSiblings = 2;

        System.out.println("My Name is " + myName);
        System.out.println("My mother's name is " + momName);
        System.out.println("I have " + numSiblings + " siblings, my brother's name is " + broName + " and my sister's name is " + sisName );

        //Excercise 2
        char c = 'z'; //conviertelo a int
        int i = 250; //conviertelo a long y luego de long a short
        double d = 301.067; //conviertelo a long
        int i2 = 100; //súmale 5000.66 y conviertelo a float
        int i3 = 737; //multiplícalo por 100 y conviertelo a byte
        double d2 = 298.638; //divídelo entre 25 y conviertelo a long

        int cInt = (int) c; //exactitud
        long iLong = (long) i; //exactitud
        short iShort = (short) i; //exactitud
        long dLong = (long) d; //estimacion
        float i2Float = (float) i2 + (float) 5000.66; //estimacion
        byte i3Byte = (byte) (i3 * 100); //exactitud
        long d2Long = (long) (d2 / 25.0); //estimacion

        System.out.println("Char to int: " + cInt);
        System.out.println("int to long: " + iLong);
        System.out.println("int to short: " + iShort);
        System.out.println("double to long: " + dLong);
        System.out.println("int + 5000.66 and to float: " + i2Float);
        System.out.println("int * 100 and to byte: " + i3Byte);
        System.out.println("double / 25 and to long: " + d2Long);

        //Excercise 3
        // On Windows, verify what JDK version is executing in your system
        // Open Editar variables de entorno del sistema and select variables de entorno
        // On Path and Java Home, modify the JDK version to the one you want to use


    }
}
