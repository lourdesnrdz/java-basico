public class WhileLoop {

    static boolean isTurnOnLight = false;

    public static void main(String[] args) {
        turnOnOFFLight();

        int i = 1;
        while (isTurnOnLight && i <= 10){
            printSOS();
            i++;
        }

    }

    public static void printSOS() {
        System.out.println(". . . _ _ _ . . .");
    }

    public static boolean turnOnOFFLight() {
        // Operador Ternario:
        isTurnOnLight = (isTurnOnLight) ? false : true;

        // IF y ELSE:
//        if (isTurnOnLight) {
//            isTurnOnLight = false;
//        } else {
//            isTurnOnLight = true;
//        }

        return isTurnOnLight;
    }
}
