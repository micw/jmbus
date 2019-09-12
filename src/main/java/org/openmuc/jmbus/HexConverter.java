/*
 * Copyright 2010-15 Fraunhofer ISE
 *
 * This file is part of jMBus.
 * For more information visit http://www.openmuc.org
 *
 * jMBus is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * jMBus is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with jMBus.  If not, see <http://www.gnu.org/licenses/>.
 *
 */
package org.openmuc.jmbus;

public class HexConverter {

	public static void appendShortHexString(int b, StringBuilder builder) {
		String hexString = Integer.toHexString(b & 0xff);
		if (hexString.length() == 1) {
			builder.append("0");
		}
		builder.append(hexString);
	}

	public static void appendShortHexString(StringBuilder builder, byte[] byteArray, int offset, int length) {
		for (int i = offset; i < (offset + length); i++) {
			appendShortHexString(byteArray[i], builder);
		}
	}

	public static void appendHexString(int b, StringBuilder builder) {
		builder.append("0x");
		appendShortHexString(b, builder);
	}

	public static void appendHexString(StringBuilder builder, byte[] byteArray, int offset, int length) {
		int l = 1;
		for (int i = offset; i < (offset + length); i++) {
			if ((l != 1) && ((l - 1) % 8 == 0)) {
				builder.append(' ');
			}
			if ((l != 1) && ((l - 1) % 16 == 0)) {
				builder.append('\n');
			}
			l++;
			appendHexString(byteArray[i], builder);
			if (i != offset + length - 1) {
				builder.append(' ');
			}
		}
	}

	public static String toHexString(byte b) {
		StringBuilder builder = new StringBuilder();

		return builder.append("0x").append(toShortHexString(b)).toString();
	}

	public static String toHexString(byte[] byteArray) {
		return toHexString(byteArray, 0, byteArray.length);
	}

	public static String toHexString(byte[] byteArray, int offset, int length) {
		StringBuilder builder = new StringBuilder();

		int l = 1;
		for (int i = offset; i < (offset + length); i++) {
			if ((l != 1) && ((l - 1) % 8 == 0)) {
				builder.append(' ');
			}
			if ((l != 1) && ((l - 1) % 16 == 0)) {
				builder.append('\n');
			}
			l++;
			builder.append(toHexString(byteArray[i]));
			if (i != offset + length - 1) {
				builder.append(' ');
			}
		}

		return builder.toString();
	}

	public static String toShortHexString(int b) {
		StringBuilder builder = new StringBuilder();

		String hexString = Integer.toHexString(b);
		if (hexString.length() == 1) {
			builder.append('0');
		}

		return builder.append(hexString).toString();
	}

	public static String toShortHexString(byte b) {
		return toShortHexString(b & 0xff);
	}

	public static String toShortHexString(byte[] byteArray) {
		return toShortHexString(byteArray, 0, byteArray.length);
	}

	public static String toShortHexString(byte[] byteArray, int offset, int length) {
		StringBuilder builder = new StringBuilder();
		for (int i = offset; i < (offset + length); i++) {
			builder.append(toShortHexString(byteArray[i]));
		}

		return builder.toString();
	}

	public static byte[] fromShortHexString(String shortHexString) throws NumberFormatException {

		validate(shortHexString);

		int length = shortHexString.length();

		byte[] data = new byte[length / 2];
		for (int i = 0; i < length; i += 2) {
			int firstCharacter = Character.digit(shortHexString.charAt(i), 16);
			int secondCharacter = Character.digit(shortHexString.charAt(i + 1), 16);

			if (firstCharacter == -1 || secondCharacter == -1) {
				throw new NumberFormatException("string is not a legal hex string.");
			}

			data[i / 2] = (byte) ((firstCharacter << 4) + secondCharacter);
		}
		return data;
	}

	private static void validate(String s) {
		if (s == null) {
			throw new IllegalArgumentException("string s may not be null");
		}

		if ((s.length() == 0) || ((s.length() % 2) != 0)) {
			throw new NumberFormatException("string is not a legal hex string.");
		}
	}

	/**
	 * Don't let anyone instantiate this class.
	 */
	private HexConverter() {
	}
}
