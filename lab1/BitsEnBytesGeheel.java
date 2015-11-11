package lab1;

public class BitsEnBytesGeheel {
	public static int mb = 12;

	public static void main(String[] args) {
		int kb = mb * 1024;
		int bytes = kb * 1024;
		int nibbles = bytes * 2;
		int bits = bytes * 8;

		System.out.format("%d MB = %d KB = %d B = %d n = %d b.\n", mb, kb, bytes, nibbles, bits);
	}
}
