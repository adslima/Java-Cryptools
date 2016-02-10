import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author arthur.paixao
 * @category Vernam Cipher Encode/Decode
 */

public class VernamCipher {
	public static void main(String args[]) throws IOException {
		String line, key, result1, result2;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter g:");
		int g = Integer.parseInt(in.readLine());
		System.out.println("Enter a:");
		int a = Integer.parseInt(in.readLine());
		System.out.println("Enter b:");
		int b = Integer.parseInt(in.readLine());
		System.out.println("Enter p:");
		int p = Integer.parseInt(in.readLine());
		int keyint = (int) (Math.pow(g, a * b)) % p;
		key = Integer.toString(keyint);
		System.out.println("Key:");
		System.out.println(key);
		System.out.println("Enter the string:");
		line = in.readLine();
		System.out.println("Encrypted:");
		result1 = "";
		for (int i = 0; i < line.length(); i++) {
			result1 += (char) (line.charAt(i) ^ key.charAt(i % key.length()));
		}
		System.out.println(result1);
		System.out.println("Decrypted:");
		result2 = "";
		for (int i = 0; i < result1.length(); i++) {
			result2 += (char) (result1.charAt(i) ^ key.charAt(i % key.length()));
		}
		System.out.println(result2);
	}
}
