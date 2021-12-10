package home_work_1;

public class TaskOne {
    public static void main(String[] args) {

        byte a = 42; // 00101010
        byte b = 15; // 00001111
        byte a2 = -42; // 11010110
        byte b2 = -15; // 11110001

        System.out.println(~a); // 00101010 ~ 11010101
        System.out.println(~b); // 00001111 ~ 11110000
        System.out.println(a & b); // 00101010 & 00001111 - 00001010
        System.out.println(a | b); // 00101010 | 00001111 - 00101111
        System.out.println(a ^ b); // 00101010 ^ 00001111 - 00100101
        System.out.println(a >> 1); // 00101010 >> 00010101
        System.out.println(a << 1); // 00101010 << 01010100
        System.out.println(b >> 1); // 00001111 >> 00000111
        System.out.println(b << 1); // 00001111 << 00011110
        System.out.println(a >>> 1); // 00101010 >>> 00010101
        System.out.println(b >>> 1); // 00001111 >>> 00000111
        System.out.println(a <<= 1); // 00101010 <<= 01010100
        System.out.println(b <<= 1); // 00001111 <<= 00011110

        System.out.println(~a2); // 11010110 ~ 11010101
        System.out.println(~b2); // 11110001 ~ 11110000
        System.out.println(a2 & b2); // 11010110 & 11110001 - 11010000
        System.out.println(a2 | b2); // 11010110 | 11110001 - 11110111
        System.out.println(a2 ^ b2); // 11010110 ^ 11110001 - 10011100
        System.out.println(a2 >> 1); // 11010110 >> 11101011
        System.out.println(a2 << 1); // 11010110 << 10101100
        System.out.println(b2 >> 1); // 11110001 >> 11111000
        System.out.println(b2 << 1); // 11110001 << 11100010
        System.out.println(a2 >>> 1); // 11010110 >>> 01101011
        System.out.println(b2 >>> 1); // 11110001 >>> 11111000
        System.out.println(a2 <<= 1); // 11010110 <<= 10101100
        System.out.println(b2 <<= 1); // 11110001 <<= 11100010

        double a3 = 42.5; // побитовые операции применяются с целыми числами

        //System.out.println(~a3); // bad operand type double for unary operator '~'
        //System.out.println(a3 <<= 1); // Operator '<<' cannot be applied to 'double', 'int'
    }
}