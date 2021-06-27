public class IfStatement {
    public static void main(String[] args) {
        boolean isBluetoothEnabled = true;
        int filesSent = 3;

        if (isBluetoothEnabled){
            //Send file
            filesSent++;
            System.out.println("File sent");
        }
    }
}
