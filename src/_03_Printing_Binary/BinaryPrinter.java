package _03_Printing_Binary;

public class BinaryPrinter {
	/*
	 * Complete the methods below so they print the passed in parameter in binary.
	 * Do not use the Integer.toBinaryString method!
	 * Use the main method to test your methods.
	 */

	
	public static void printByteBinary(byte b) {
		// We first want to print the bit in the one's place
		// Shift b seven bits to the right
		for (int i = 7; i >= 0; i--) {
		byte bob = (byte) (b >> i);
		
		// Use the & operator to "mask" the bit in the one's place
		// This can be done by "anding" (&) it with the value of 1
		byte mask = (byte) (bob & 0b00000001);       
		// Print the result using System.out.print (NOT System.out.println)
		System.out.print(mask);
		//Use this method to print the remaining 7 bits of b
		}
		}

	
	
	public static void printShortBinary(short s) {
		// Create 2 byte variables
		byte a;
		byte b;
		
		// Use bit shifting and masking (&) to save the first
		// 8 bits of s in one byte, and the second 8 bits of
		// s in the other byte
		
		a = (byte) (s >> 8);
		byte mask = (byte) (a & (0x00ff));
		
		b = (byte) (s & 0x00ff);
		
		printByteBinary(mask);
		System.out.println("");
		printByteBinary(b);
		
		
		// Call printByteBinary twice using the two bytes
		// Make sure they are in the correct order
	}
	
	public static void printIntBinary(int i) {
		// Create 2 short variables
		short y;
		short z;
		// Use bit shifting and masking (&) to save the first
		// 16 bits of i in one short, and the second 16 bits of
		// i in the other short
		y = (short) (i>>16);
		short cow = (short) (y & 0x0000ffff);
		
		z = (short) (i & 0x0000ffff);
		System.out.println("");
		printShortBinary(cow);
		System.out.println("");
		printShortBinary(z);
		// Call printShortBinary twice using the two short variables
		// Make sure they are in the correct order
	}
	
	public static void printLongBinary(long l) {
		int y;
		int z;
		// Use bit shifting and masking (&) to save the first
		// 16 bits of i in one short, and the second 16 bits of
		// i in the other short
		y = (int) (l>>32);
		int cow = (int) (y & 0x0000ffff);
		
		z = (int) (l & 0x0000ffff);
		System.out.println("");
		printIntBinary(cow);
		System.out.println("");
		printIntBinary(z);
	}
	
	public static void main(String[] args) {
		// Test your methods here
		//printByteBinary((byte)0b10111101);
		//printShortBinary((short) 0b1010101010101011);
		//printIntBinary(8);
		printLongBinary((100000000000000000L));
	}
}
