public class ForLoop {
    static boolean isTurnOnLight = false;

    public static void main(String[] args) {
        turnOnOFFLight();

        for(int i = 1; isTurnOnLight && i <= 10; i++){
            printSOS();
        }
        
    }

    public static void printSOS() {
        System.out.println(". . . _ _ _ . . .");
    }

    public static boolean turnOnOFFLight() {
        // Operador Ternario:
        isTurnOnLight = (isTurnOnLight) ? false : true;
        return isTurnOnLight;
    }
}
