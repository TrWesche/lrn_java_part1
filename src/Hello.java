public class Hello {
    public static void main(String[] args) {
        boolean firstBool = false;
        byte firstByte = 0x12;
        byte secondByte = 12;
        char firstChar = 'a';
        short firstShort = 30;
        int firstInt = 101;
        long firstLong = 1234567L;
        float firstFloat = 14.24f;
        double firstDouble = 123.45d;
        String testString = "This is a Test";

        int secondInt = 200;
        int thirdInt = firstInt + secondInt;
        int fourthInt = thirdInt - 1000;

        System.out.println("Hello World");
        System.out.println("and Hello Trenton");

        System.out.println(firstBool);
        System.out.println(firstByte);
        System.out.println(secondByte);
        System.out.println(firstChar);
        System.out.println(firstShort);
        System.out.println(firstInt);
        System.out.println(firstLong);
        System.out.println(firstFloat);
        System.out.println(firstDouble);
        System.out.println(testString);

        System.out.println(thirdInt);
        System.out.println(fourthInt);

        int maxIntValue = Integer.MAX_VALUE;
        int minIntValue = Integer.MIN_VALUE;

        System.out.println("Integer Max Value = " + maxIntValue + ", Integer Min Value = " + minIntValue);
        System.out.println("Overflow Int = " + (maxIntValue + 1));
        System.out.println("Underflow Int = " + (minIntValue - 1));

        byte maxByteValue = Byte.MAX_VALUE;
        byte minByteValue = Byte.MIN_VALUE;

        char maxCharValue = Character.MAX_VALUE;
        char minCharValue = Character.MIN_VALUE;

        short maxShortValue = Short.MAX_VALUE;
        short minShortValue = Short.MIN_VALUE;

        long maxLongValue = Long.MAX_VALUE;
        long minLongValue = Long.MIN_VALUE;

        // Casting
        // Note: Even though min Byte Value is a byte it is being cast to an int for evaluate with the expression
        //       This requires you cast the type back to byte for storage.
        byte dividedByteVal = (byte) (minByteValue / 2);


        byte challenge1Byte = 13;
        short challenge1Short = 100;
        int challenge1Int = 40;
        long challenge1Long = 50000l + (10 * (challenge1Byte + challenge1Short + challenge1Int) );
        System.out.println(challenge1Long);


        // Floating Point & Double
        // Float Precision = 7
        // Double Precision = 16
        // Opt for double: it processes faster, is the native data type used in most math libraries, and is the default
        // floating point type

        double lbsToConvert = 150d;
        double lbsToKgConstant = 0.45359237d;
        double convertedKg = lbsToConvert * lbsToKgConstant;
        System.out.println(convertedKg);

        // For Super Precise Calculations the built in float point types should generally not be used.
        // There is a type "BigDecimal" which is specifically made for this case.
        //BigDecimal


        // Java char is unicode (takes 2 bytes), the two values below are the same
        char charVal1 = '\u0044'; // This is the character D
        char charVal2 = 'D';

        // Boolean Values
        // Typically have "is" appended to the parameter name

        // Java Strings
        String testString2 = "This is a String";
        testString2 = testString2 + " appending unicode character: /u00A9";

        String testString3 = "10";
        int testIntAppend1 = 50;
        testString3 = testString + testIntAppend1;
        // This will result in 1050, Java does dynamic casting

        // Strings in Java are immutable, i.e. a String value is not changed in place when changes are made new
        // memory is allocated and the data for the modified string is inserted which the previous string value's
        // memory is released back to the operating system.

        // StringBuffers do not use this sort of method, to be discussed later


        // Java Operators & Precedence
        // =                                    Assignment Operator
        // +, -, *, /, %                        Evaluation Operators
        // ++, --, +=, -=, *=, /=               Evaluations Shortcuts
        // ==, !=, >=, >, <=, <, &&, ||         Logical Operators
        // &, |, ~, <<, >>, >>>, ^              Bitwise Operators: ~ complement, << >> signed bit shifts, >>> unsigned bit shift, ^ XOR
        // !                                    Logical Complement Operators
        // instanceof                           Type Comparison


        // If/Then Statement
        boolean isAlien = false;
        if (isAlien == false) {

        } else if (isAlien == true) {

        } else {

        }

        // Ternary Opeartor (if/else statement)
        boolean wasAlien = isAlien ? true : false;
    }
}
