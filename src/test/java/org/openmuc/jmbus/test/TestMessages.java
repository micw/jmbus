package org.openmuc.jmbus.test;

import org.junit.Ignore;

@Ignore
public class TestMessages {
	/* RESP-UD EMH DIZ */
	public static byte[] testMsg1 = new byte[] { (byte) 0x68, (byte) 0x21, (byte) 0x21, (byte) 0x68, (byte) 0x08,
			(byte) 0x01, (byte) 0x72, (byte) 0x02, (byte) 0x37, (byte) 0x62, (byte) 0x00, (byte) 0xa8, (byte) 0x15,
			(byte) 0x00, (byte) 0x02, (byte) 0x07, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x8c, (byte) 0x10,
			(byte) 0x04, (byte) 0x09, (byte) 0x04, (byte) 0x00, (byte) 0x00, (byte) 0xc4, (byte) 0x00, (byte) 0x2a,
			(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x01, (byte) 0xfd, (byte) 0x17, (byte) 0x00,
			(byte) 0x8c, (byte) 0x16 };

	/* RESP-UD NZR DHZ 5/63 M-BUS 2/230-1 single phase meter */
	public static byte[] testMsg2 = new byte[] { (byte) 0x68, (byte) 0x32, (byte) 0x32, (byte) 0x68, (byte) 0x08,
			(byte) 0x05, (byte) 0x72, (byte) 0x08, (byte) 0x06, (byte) 0x10, (byte) 0x30, (byte) 0x52, (byte) 0x3b,
			(byte) 0x01, (byte) 0x02, (byte) 0x01, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x04, (byte) 0x03,
			(byte) 0xfa, (byte) 0x04, (byte) 0x00, (byte) 0x00, (byte) 0x04, (byte) 0x83, (byte) 0x7f, (byte) 0xfa,
			(byte) 0x04, (byte) 0x00, (byte) 0x00, (byte) 0x02, (byte) 0xfd, (byte) 0x48, (byte) 0x44, (byte) 0x09,
			(byte) 0x02, (byte) 0xfd, (byte) 0x5b, (byte) 0x00, (byte) 0x00, (byte) 0x02, (byte) 0x2b, (byte) 0x00,
			(byte) 0x00, (byte) 0x0c, (byte) 0x78, (byte) 0x08, (byte) 0x06, (byte) 0x10, (byte) 0x30, (byte) 0x0f,
			(byte) 0x0e, (byte) 0x71, (byte) 0x16 };

	/* RESP-UD Elster F2 heat meter */
	public static byte[] testMsg3 = new byte[] { (byte) 0x68, (byte) 0x90, (byte) 0x90, (byte) 0x68, (byte) 0x08,
			(byte) 0x01, (byte) 0x72, (byte) 0x75, (byte) 0x96, (byte) 0x91, (byte) 0x00, (byte) 0xcd, (byte) 0x4e,
			(byte) 0x08, (byte) 0x04, (byte) 0x06, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x04, (byte) 0x07,
			(byte) 0xc8, (byte) 0x1e, (byte) 0x00, (byte) 0x00, (byte) 0x04, (byte) 0x15, (byte) 0xfe, (byte) 0xbf,
			(byte) 0x00, (byte) 0x00, (byte) 0x84, (byte) 0x40, (byte) 0x15, (byte) 0xf8, (byte) 0xbf, (byte) 0x00,
			(byte) 0x00, (byte) 0x02, (byte) 0x5a, (byte) 0x79, (byte) 0x02, (byte) 0x02, (byte) 0x5e, (byte) 0xa6,
			(byte) 0x01, (byte) 0x02, (byte) 0x62, (byte) 0xd3, (byte) 0x00, (byte) 0x04, (byte) 0x22, (byte) 0x38,
			(byte) 0x09, (byte) 0x00, (byte) 0x00, (byte) 0x04, (byte) 0x26, (byte) 0x3d, (byte) 0x07, (byte) 0x00,
			(byte) 0x00, (byte) 0x04, (byte) 0x3d, (byte) 0x05, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x04,
			(byte) 0x2e, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x04, (byte) 0x6d, (byte) 0x2b,
			(byte) 0x11, (byte) 0x78, (byte) 0x11, (byte) 0x84, (byte) 0x40, (byte) 0x6e, (byte) 0x00, (byte) 0x00,
			(byte) 0x00, (byte) 0x00, (byte) 0x84, (byte) 0x80, (byte) 0x40, (byte) 0x6e, (byte) 0x00, (byte) 0x00,
			(byte) 0x00, (byte) 0x00, (byte) 0x1f, (byte) 0xe8, (byte) 0x03, (byte) 0x01, (byte) 0x08, (byte) 0x13,
			(byte) 0x00, (byte) 0x01, (byte) 0x01, (byte) 0x00, (byte) 0x00, (byte) 0x75, (byte) 0x96, (byte) 0x91,
			(byte) 0x00, (byte) 0xcd, (byte) 0x4e, (byte) 0x08, (byte) 0x04, (byte) 0x07, (byte) 0xac, (byte) 0xff,
			(byte) 0x03, (byte) 0x75, (byte) 0x96, (byte) 0x91, (byte) 0x00, (byte) 0x01, (byte) 0x01, (byte) 0x01,
			(byte) 0x02, (byte) 0xff, (byte) 0x0f, (byte) 0x05, (byte) 0x3c, (byte) 0x33, (byte) 0x66, (byte) 0x5a,
			(byte) 0x66, (byte) 0xcb, (byte) 0x05, (byte) 0xdf, (byte) 0x05, (byte) 0xff, (byte) 0xff, (byte) 0x9d,
			(byte) 0x39, (byte) 0x13, (byte) 0x01, (byte) 0xa0, (byte) 0x05, (byte) 0x61, (byte) 0x31, (byte) 0xd3,
			(byte) 0x16 };

	/* Siemens water meter ?? */
	public static byte[] testMsg4 = new byte[] { (byte) 0x68, (byte) 0x59, (byte) 0x59, (byte) 0x68, (byte) 0x08,
			(byte) 0x00, (byte) 0x72, (byte) 0x82, (byte) 0x13, (byte) 0x02, (byte) 0x08, (byte) 0x65, (byte) 0x32,
			(byte) 0x99, (byte) 0x06, (byte) 0xeb, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x0c, (byte) 0x13,
			(byte) 0x01, (byte) 0x01, (byte) 0x00, (byte) 0x00, (byte) 0x0b, (byte) 0x22, (byte) 0x52, (byte) 0x09,
			(byte) 0x02, (byte) 0x04, (byte) 0x6d, (byte) 0x38, (byte) 0x08, (byte) 0x6e, (byte) 0x19, (byte) 0x32,
			(byte) 0x6c, (byte) 0x00, (byte) 0x00, (byte) 0x0c, (byte) 0x78, (byte) 0x82, (byte) 0x13, (byte) 0x02,
			(byte) 0x08, (byte) 0x06, (byte) 0xfd, (byte) 0x0c, (byte) 0x0a, (byte) 0x00, (byte) 0x01, (byte) 0x00,
			(byte) 0xfa, (byte) 0x01, (byte) 0x0d, (byte) 0xfd, (byte) 0x0b, (byte) 0x05, (byte) 0x31, (byte) 0x32,
			(byte) 0x48, (byte) 0x46, (byte) 0x57, (byte) 0x01, (byte) 0xfd, (byte) 0x0e, (byte) 0x00, (byte) 0x0b,
			(byte) 0x3b, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x0f, (byte) 0x37, (byte) 0xfd, (byte) 0x17,
			(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
			(byte) 0x02, (byte) 0x7a, (byte) 0x0d, (byte) 0x00, (byte) 0x02, (byte) 0x78, (byte) 0x0d, (byte) 0x00,
			(byte) 0x11, (byte) 0x16 };

	/* Siemens heat meter WFH21 */
	public static byte[] testMsg5 = new byte[] { (byte) 0x68, (byte) 0x5e, (byte) 0x5e, (byte) 0x68, (byte) 0x08,
			(byte) 0x05, (byte) 0x72, (byte) 0x91, (byte) 0x64, (byte) 0x00, (byte) 0x08, (byte) 0x65, (byte) 0x32,
			(byte) 0x99, (byte) 0x06, (byte) 0xda, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x0c, (byte) 0x13,
			(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x0b, (byte) 0x22, (byte) 0x86, (byte) 0x40,
			(byte) 0x04, (byte) 0x04, (byte) 0x6d, (byte) 0x24, (byte) 0x0a, (byte) 0x61, (byte) 0x1c, (byte) 0x32,
			(byte) 0x6c, (byte) 0x00, (byte) 0x00, (byte) 0x0c, (byte) 0x78, (byte) 0x91, (byte) 0x64, (byte) 0x00,
			(byte) 0x08, (byte) 0x06, (byte) 0xfd, (byte) 0x0c, (byte) 0x0a, (byte) 0x00, (byte) 0x01, (byte) 0x00,
			(byte) 0xfa, (byte) 0x01, (byte) 0x0d, (byte) 0xfd, (byte) 0x0b, (byte) 0x05, (byte) 0x31, (byte) 0x32,
			(byte) 0x48, (byte) 0x46, (byte) 0x57, (byte) 0x01, (byte) 0xfd, (byte) 0x0e, (byte) 0x00, (byte) 0x4c,
			(byte) 0x13, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x42, (byte) 0x6c, (byte) 0x5f,
			(byte) 0x1c, (byte) 0x0f, (byte) 0x37, (byte) 0xfd, (byte) 0x17, (byte) 0x00, (byte) 0x00, (byte) 0x00,
			(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x02, (byte) 0x7a, (byte) 0x25,
			(byte) 0x00, (byte) 0x02, (byte) 0x78, (byte) 0x25, (byte) 0x00, (byte) 0x82, (byte) 0x16 };

	/* meter_1.txt from Mariusz Ryndzionek */
	public static byte[] testMsg6 = new byte[] { (byte) 0x68, (byte) 0x50, (byte) 0x50, (byte) 0x68, (byte) 0x08,
			(byte) 0x0d, (byte) 0x72, (byte) 0x13, (byte) 0x40, (byte) 0x56, (byte) 0x41, (byte) 0x74, (byte) 0x52,
			(byte) 0x52, (byte) 0x0c, (byte) 0x04, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x0c, (byte) 0xfb,
			(byte) 0x01, (byte) 0x20, (byte) 0x22, (byte) 0x00, (byte) 0x00, (byte) 0x8c, (byte) 0x10, (byte) 0xfb,
			(byte) 0x01, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x8c, (byte) 0x20, (byte) 0x16,
			(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x0c, (byte) 0x16, (byte) 0x00, (byte) 0x53,
			(byte) 0x06, (byte) 0x00, (byte) 0x0c, (byte) 0x2e, (byte) 0x62, (byte) 0x65, (byte) 0x01, (byte) 0x00,
			(byte) 0x0b, (byte) 0x3e, (byte) 0x54, (byte) 0x04, (byte) 0x00, (byte) 0x0a, (byte) 0x5a, (byte) 0x06,
			(byte) 0x07, (byte) 0x0a, (byte) 0x5e, (byte) 0x84, (byte) 0x03, (byte) 0x0a, (byte) 0x62, (byte) 0x22,
			(byte) 0x03, (byte) 0x0a, (byte) 0x27, (byte) 0x04, (byte) 0x00, (byte) 0x04, (byte) 0x6d, (byte) 0x39,
			(byte) 0x09, (byte) 0x6b, (byte) 0x1a, (byte) 0x72, (byte) 0x6c, (byte) 0x00, (byte) 0x00, (byte) 0x97,
			(byte) 0x16 };

	/* meter_2.txt from Mariusz Ryndzionek */
	public static byte[] testMsg7 = new byte[] { (byte) 0x68, (byte) 0x88, (byte) 0x88, (byte) 0x68, (byte) 0x08,
			(byte) 0x01, (byte) 0x72, (byte) 0x75, (byte) 0x96, (byte) 0x91, (byte) 0x00, (byte) 0x74, (byte) 0x52,
			(byte) 0x08, (byte) 0x04, (byte) 0x06, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x04, (byte) 0x07,
			(byte) 0xc8, (byte) 0x1e, (byte) 0x00, (byte) 0x00, (byte) 0x04, (byte) 0x15, (byte) 0xfe, (byte) 0xbf,
			(byte) 0x00, (byte) 0x00, (byte) 0x84, (byte) 0x40, (byte) 0x15, (byte) 0xf8, (byte) 0xbf, (byte) 0x00,
			(byte) 0x00, (byte) 0x02, (byte) 0x5a, (byte) 0x79, (byte) 0x02, (byte) 0x02, (byte) 0x5e, (byte) 0xa6,
			(byte) 0x01, (byte) 0x02, (byte) 0x62, (byte) 0xd3, (byte) 0x00, (byte) 0x04, (byte) 0x22, (byte) 0x38,
			(byte) 0x09, (byte) 0x00, (byte) 0x00, (byte) 0x04, (byte) 0x26, (byte) 0x3d, (byte) 0x07, (byte) 0x00,
			(byte) 0x00, (byte) 0x04, (byte) 0x3d, (byte) 0x05, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x04,
			(byte) 0x2e, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x04, (byte) 0x6d, (byte) 0x2b,
			(byte) 0x11, (byte) 0x78, (byte) 0x11, (byte) 0x84, (byte) 0x40, (byte) 0x6e, (byte) 0x00, (byte) 0x00,
			(byte) 0x00, (byte) 0x00, (byte) 0x1f, (byte) 0xe8, (byte) 0x03, (byte) 0x01, (byte) 0x08, (byte) 0x13,
			(byte) 0x00, (byte) 0x21, (byte) 0x01, (byte) 0x00, (byte) 0x00, (byte) 0x75, (byte) 0x96, (byte) 0x91,
			(byte) 0x00, (byte) 0xcd, (byte) 0x4e, (byte) 0x08, (byte) 0x04, (byte) 0x07, (byte) 0xac, (byte) 0xf8,
			(byte) 0x03, (byte) 0x75, (byte) 0x96, (byte) 0x91, (byte) 0x33, (byte) 0x01, (byte) 0x41, (byte) 0x01,
			(byte) 0x02, (byte) 0xff, (byte) 0x0f, (byte) 0x05, (byte) 0x3c, (byte) 0x33, (byte) 0x63, (byte) 0x5a,
			(byte) 0x66, (byte) 0xcb, (byte) 0x05, (byte) 0xdf, (byte) 0x05, (byte) 0xff, (byte) 0xff, (byte) 0x9d,
			(byte) 0x39, (byte) 0x13, (byte) 0x01, (byte) 0xa0, (byte) 0x05, (byte) 0x61, (byte) 0x31, (byte) 0x55,
			(byte) 0x16 };

	public static void main(String[] args) {

		byte b = (byte) 0xBF;

		System.out.println(b);

		int c = 0xff & b;

		System.out.println(c);

		if (args.length < 1) {
			System.err.println("Add message as hex string");
			System.exit(1);
		}

		String message = args[0];

		if ((message.length() % 2) != 0) {
			System.err.println("Invalid string length");
			System.exit(1);
		}

		int i = 0;
		int columnCount = 0;
		while (i < message.length()) {
			System.out.print("(byte) 0x" + message.substring(i, i + 2) + ", ");
			i += 2;
			columnCount++;
			if (columnCount == 8) {
				System.out.println();
				columnCount = 0;
			}
		}
	}

	public static void printBuffer(byte[] buffer) {
		for (int i = 0; i < buffer.length; i++) {
			System.out.println(i + ": " + String.format("%02x", 0xff & buffer[i]));
		}
	}

}
