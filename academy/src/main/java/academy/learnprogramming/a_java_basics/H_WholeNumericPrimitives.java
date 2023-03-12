package academy.learnprogramming.a_java_basics;

public class H_WholeNumericPrimitives {

    public static void main(String[] args) {
        //long max = 32123456789; //integer number is too long
        long max1 = 32123456789l;
        long max2 = 32123456789L;
        long max3 = 32_123_456_789L;
        //long n = _2; //compilation error
        long n = 2_300;

        //int oct = 08; //integer number is too long
        int oct = 8; // octal (numbers from 0 to 7)
        int firstOct = 010; // 8 decimal
        int secondOct = 022; // 18 decimal

        int sumOct = firstOct + secondOct; // 26 decimal, 32 octal
        System.out.println("first = " + firstOct + " second = " + secondOct);
        System.out.println("decimal sum = " + sumOct + " octSum = " + Integer.toOctalString(sumOct));
        /*first = 8 second = 18
        decimal sum = 26 octSum = 32*/

        // hexadecimal (0-9 and A-F)
        int firstHex = 0xF; // 15 decimal
        int secondHex = 0x1E; // 30 decimal
        int sumHex = firstHex + secondHex; // 45 decimal, 2d hex
        System.out.println("first = " + firstHex + " second = " + secondHex);
        System.out.println("decimalSum = " + sumHex + " hexSum = " + Integer.toHexString(sumHex));
        /*first = 15 second = 30
        decimalSum = 45 hexSum = 2d*/

        // binary
        int firstBin = 0b1001; // 9 decimal
        int secondBin = 0b0111; // 7 decimal
        int sumBin = firstBin + secondBin; // 16 decimal, 10000 binary

        //int thirdBin = 0b2; // bin only 0 or 1
        System.out.println("first = " + firstBin + " second = "+ secondBin);
        System.out.println("decimalBin = " + sumBin + " binSum = " + Integer.toBinaryString(sumBin));
        /*first = 9 second = 7
        decimalBin = 16 binSum = 10000*/
    }
}
