public class IfStatement {
    public static void main(String[] args) {
        boolean isBluetoothEnabled = false;
        int filesSent = 3;

        if (isBluetoothEnabled){
            //Send file
            filesSent++;
            System.out.println("File sent");
        } else {
            filesSent--;
            System.out.println("Please enable Bluetooth");
        }

        System.out.println(isBluetoothEnabled);
        System.out.println(filesSent);
    }
}
