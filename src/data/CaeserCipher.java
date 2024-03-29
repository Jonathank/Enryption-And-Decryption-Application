package data;

public class CaeserCipher {
	
	protected char[] encoder = new char[26];	//Encryption array
	protected char[] decoder = new char[26];	//Decryption array
	
	//constructor that initializes the encryption and decryption arrays
	public CaeserCipher(int rotation) {
		for(int k=0;k<26;k++) {
			encoder[k] = (char)('A' + (k + rotation)%26);
			decoder[k] = (char)('A' + (k-rotation + 26)%26);
			
		}
	}
	
	//retyrns transformation of original String using given code
	private String transform(String original, char[] code) {
		char[] msg = original.toCharArray();
		for(int k=0;k<msg.length;k++) 
			if(Character.isUpperCase(msg[k])) {
		int j = msg[k] - 'A';
		msg[k] = code[j];
			}
		return new String(msg);
	}
	
	//Returns String representing encrypted message
	public String encrypt(String message) {
		return transform(message,encoder);
	}
	//Returns String representing decrypted message
	public String decrypt(String secret) {
		return transform(secret,decoder);
	}
	
	
	
	

}
