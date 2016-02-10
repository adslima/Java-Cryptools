import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author arthur.paixao
 * @category Hill Cipher Encode/Decode
 */
public class HillCipher {
	public static void main(String[] arg) throws Exception {
		int k[][] = { { 17, 17, 5 }, { 21, 18, 21 }, { 2, 2, 19 } };
		int p[] = new int[300];
		int c[] = new int[300];
		int i = 0;
		// System.out.println("enter key");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/*
		 * for(i=0;i<3;i++) { for(int j=0;j<3;j++) { String str=br.readLine();
		 * k[i][j]=Integer.parseInt(str); } }
		 */

		System.out.println("Plain Text:");
		String str = br.readLine();

		for (i = 0; i < str.length(); i++) {
			int c1 = str.charAt(i);
			// System.out.println(c1);
			p[i] = (c1) - 97;
		}
		i = 0;
		int zz = 0;
		for (int b = 0; b < str.length() / 3; b++) {
			for (int j = 0; j < 3; j++) {
				for (int x = 0; x < 3; x++) {
					c[i] += k[j][x] * p[x + zz];
				}
				i++;
			}
			zz += 3;
		}
		System.out.println("Encrypted Text : ");
		for (int z = 0; z < str.length(); z++)
			System.out.print((char) ((c[z] % 26) + 97));

	}
}
