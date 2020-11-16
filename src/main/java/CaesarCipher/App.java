package CaesarCipher;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Input a string message : ");
        String message = sc.nextLine();
        System.out.println(" Enter any key value : ");
        int key = sc.nextInt();
        Encode Encoded = new Encode(message,key);
        Decode Decoded = new Decode(Encoded.encrypt(), key);
        String encryption = Encoded.getEncrypt(message,key);
        System.out.println(encryption);
        String Decryption = Decoded.getDecrypt(message,key);
        System.out.println(Decryption);
        sc.close();
    }
}
