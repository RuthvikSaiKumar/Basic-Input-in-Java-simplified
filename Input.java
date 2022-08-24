package blah;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;

public class Input {
    private static final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));


    /**
     * Reads an int number
     *
     * @return An int containing the value of the input
     * @throws RuntimeException if there is an exception while parsing the number or during input
     */
    public static int inputInt() {
        try {
            return Integer.parseInt(in.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Reads an int after showing a message
     *
     * @param msg The message to be displayed before reading the input integer
     * @return An int containing the value of the input
     * @throws RuntimeException if there is an exception while parsing the number or during input
     */
    public static int inputInt(String msg) {
        try {
            System.out.print(msg);
            return Integer.parseInt(in.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Reads a string from the input till the first occurrence of a whitespace
     *
     * @return A String containing the value of the input
     * @throws RuntimeException if there is an exception while parsing the string or during input
     */
    public static String input() {
        try {
            return in.readLine().split(" ")[0];
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Reads a string from the input till the first occurrence of a whitespace after displaying a message
     *
     * @param msg The message to be displayed before reading the input string
     * @return A String containing the value of the input
     * @throws RuntimeException if there is an exception while parsing the string or during input
     */
    public static String input(String msg) {
        try {
            System.out.print(msg);
            return in.readLine().split(" ")[0];
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Reads a string from the input till the first occurrence of a new line character '\n'
     *
     * @return A String containing the value of the input
     * @throws RuntimeException if there is an exception while parsing the string or during input
     */
    public static String inputString() {
        try {
            return in.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Reads a string from the input till the first occurrence of a new line character '\n' after displaying a message
     *
     * @param msg The message to be displayed before reading the input string
     * @return A String containing the value of the input
     * @throws RuntimeException if there is an exception while parsing the string or during input
     */
    public static String inputString(String msg) {
        try {
            System.out.print(msg);
            return in.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Reads a character
     *
     * @return A character containing the value of the input
     * @throws RuntimeException if there is an exception while parsing the character or during input
     */
    public static char inputChar() {
        try {
            return (char) in.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Reads a character after displaying a message
     *
     * @param msg The message to be displayed before reading the input character
     * @return A character containing the value of the input
     * @throws RuntimeException if there is an exception while parsing the character or during input
     */
    public static char inputChar(String msg) {
        try {
            System.out.print(msg);
            return (char) in.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Reads a byte
     *
     * @return A byte containing the value of the input
     * @throws RuntimeException if there is an exception while parsing the number or during input
     */
    public static byte inputByte() {
        try {
            return Byte.parseByte(in.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Reads a byte after showing a message
     *
     * @param msg The message to be displayed before reading the input byte
     * @return A byte containing the value of the input
     * @throws RuntimeException if there is an exception while parsing the number or during input
     */
    public static byte inputByte(String msg) {
        try {
            System.out.print(msg);
            return Byte.parseByte(in.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Reads a short number
     *
     * @return A short containing the value of the input
     * @throws RuntimeException if there is an exception while parsing the number or during input
     */
    public static short inputShort() {
        try {
            return Short.parseShort(in.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Reads a short number after displaying a message
     * @param msg The message to be displayed before reading the input short
     * @return A short containing the value of the input
     * @throws RuntimeException if there is an exception while parsing the number or during input
     */
    public static short inputShort(String msg) {
        try {
            System.out.print(msg);
            return Short.parseShort(in.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    /**
     * Reads a floating point number
     * @return A float containing the value of the input
     * @throws RuntimeException if there is an exception while parsing the number or during input
     */
    public static float inputFloat() {
        try {
            return Float.parseFloat(in.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Reads a floating point number after displaying a message
     * @param msg The message to be displayed before reading the input float
     * @return A float containing the value of the input
     * @throws RuntimeException if there is an exception while parsing the number or during input
     */
    public static float inputFloat(String msg) {
        try {
            System.out.print(msg);
            return Float.parseFloat(in.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Reads a floating point number (double)
     * @return A double containing the value of the input
     * @throws RuntimeException if there is an exception while parsing the number or during input
     */
    public static double inputDouble() {
        try {
            return Double.parseDouble(in.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Reads a floating point number (double) after displaying a message
     * @param msg The message to be displayed before reading the input double
     * @return A double containing the value of the input
     * @throws RuntimeException if there is an exception while parsing the number or during input
     */
    public static double inputDouble(String msg) {
        try {
            System.out.print(msg);
            return Double.parseDouble(in.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Reads a long number
     * @return A long containing the value of the input
     * @throws RuntimeException if there is an exception while parsing the number or during input
     */
    public static long inputLong() {
        try {
            return Long.parseLong(in.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Reads a long number after displaying a message
     * @param msg The message to be displayed before reading the input long
     * @return A double containing the value of the input
     * @throws RuntimeException if there is an exception while parsing the number or during input
     */
    public static long inputLong(String msg) {
        try {
            System.out.print(msg);
            return Long.parseLong(in.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Reads a boolean value
     * @return A boolean containing true or false
     * @throws RuntimeException if there is an exception while parsing the value or during input
     */
    public static boolean inputBoolean() {
        try {
            return Boolean.parseBoolean(in.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Reads a boolean value
     * @param msg The message to be displayed before reading the input boolean
     * @return A boolean containing true or false
     * @throws RuntimeException if there is an exception while parsing the value or during input
     */
    public static boolean inputBoolean(String msg) {
        try {
            System.out.print(msg);
            return Boolean.parseBoolean(in.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Reads an BigInteger number
     *
     * @return A BigInteger containing the value of the input
     * @throws RuntimeException if there is an exception while parsing the number or during input
     */
    public static BigInteger inputBigInteger() {
        try {
            return new BigInteger(in.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Reads an BigInteger after showing a message
     *
     * @param msg The message to be displayed before reading the input number
     * @return An BigInteger containing the value of the input
     * @throws RuntimeException if there is an exception while parsing the number or during input
     */
    public static BigInteger inputBigInteger(String msg) {
        try {
            System.out.print(msg);
            return new BigInteger(in.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Reads an BigDecimal number
     *
     * @return A BigDecimal containing the value of the input
     * @throws RuntimeException if there is an exception while parsing the number or during input
     */
    public static BigDecimal inputBigDecimal() {
        try {
            return new BigDecimal(in.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Reads an BigDecimal after showing a message
     *
     * @param msg The message to be displayed before reading the input number
     * @return An BigDecimal containing the value of the input
     * @throws RuntimeException if there is an exception while parsing the number or during input
     */
    public static BigDecimal inputBigDecimal(String msg) {
        try {
            System.out.print(msg);
            return new BigDecimal(in.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
