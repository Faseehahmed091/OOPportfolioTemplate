import java.util.Random;

public class PinEncryptor {

    public static String encryptPin(int pin) {
        String pinHex = Integer.toHexString(pin);

        Random random = new Random();
        int randomNum1 = random.nextInt(64536) + 1001;
        int randomNum2 = random.nextInt(64536) + 1001;

        String randomHex1 = Integer.toHexString(randomNum1);
        String randomHex2 = Integer.toHexString(randomNum2);

        return randomHex1 + pinHex + randomHex2;
    }

    public static void main(String[] args) {
        int pinToEncrypt = 8491;
        String encryptedPin = encryptPin(pinToEncrypt);

        System.out.println("Original PIN: " + pinToEncrypt);
        System.out.println("Encrypted PIN: " + encryptedPin);
    }
}
