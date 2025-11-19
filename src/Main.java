void main() {
    IO.println("Hello, World!");

    byte smallNumber = 127;
    short shortValue = 3000;
    int number = 100_000;
    long distance = 500_000_000_000l;

    float temp = 36.6f;
    double pi = 3.14159265446546545454654;

    char grade = 'A';
    boolean isActive = true; //false

    Byte smallNumberW = Byte.MAX_VALUE;
    byte maxNumber = Byte.MAX_VALUE;

    float maxDec = Float.MAX_VALUE;


    IO.println(smallNumberW);
    IO.println(maxNumber);

    IO.println(maxDec);

    int x = 10;
    Integer boxed = x; //autoboxing

    Integer y = 25;
    int unboxed = y;  // unboxing
    Integer z = null;


    int primitiveValue = 8;
    Integer wrapperValue = primitiveValue;  //autoboxing
    int extractedInfo = wrapperValue; // unboxing

    byte b = 120;
    short s = b;
    int i = s;
    long l = i;

    long ls = 64_001; // 00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000001
    byte iq = (byte)ls; // 00000000

    // 01111111 11111111 = 32,767
    // 00000000 00000001
    // 10000000 00000000 = -32,768

    IO.println(ls);
    IO.println(iq);

    // byte 127 -128 (255)
    // 0000 0000 -> 1111 1111 (unsigned int type)
    // 1000 0000 -> -128
    // 0111 1111 -> 127 (one's complement conversion)
    // add 1        128 (two's complement conversion)

    // 0000 0001 -> denary value 1
    // 1111 1110 -> denary value -2
    // add 1
    // 1111 1111 -> denary value -1

    // 1111 1111 -> -1
    // 0000 0001 -> +1
    // 0000 0000 -> 0

    // 0110 1101 0110 1101  It's a short, Not a Byte value -> 28,013
    // 0110 1101 -> 109
    short number1 = 28013;
    byte number2 = (byte)number1;
    IO.println("Number2 = " + number2);
    // 0110 1101 x 10 = 1101 1010

    int pi2 = (int)3.14;

    int k = (int)1_000_000_000_000l;  // outside of scope
    IO.println(k);

    short a1 = 34;
    int a2 = a1;
    a1 = 35;

    IO.println(a1);
    IO.println(a2);

    String caveman1 = "Fred Flintstone";
    String caveman2 = "Fred Flintstone";
    IO.println(caveman1);
    caveman1 = "Wilma Flintstone";
    String caveman3 = "Wilma Flintstone";
    IO.println(caveman1);
    caveman1 = caveman1.toUpperCase();
    IO.println("");

    String customer = "Alice";
    byte positionInQ = 5;
    float debt = 100.00f;

    IO.println("Hello " + customer + ", you are number " + positionInQ + " on my list!");

    String formattedText = String.format("Hello %s, you are number %d on my list! You owe us £%.2f",customer, positionInQ, debt);

    IO.println(formattedText);
    System.out.printf("Hello %s, you are number %d on my list! You owe us £%.2f",customer, positionInQ, debt);

    IO.println(String.format("%10s","cat"));
    IO.println(String.format("%-10s","dog"));
    IO.println(String.format("%d%%",10));

    String multiline = """
            Hello
            World
            """;

    IO.println(multiline);
/*
    Scanner reader = new Scanner(System.in);
    IO.print("What is your name: ");

    String yourName = reader.nextLine();
    IO.print("What is your age: ");
    byte yourAge = reader.nextByte();
    yourAge++;
    System.out.printf("Your name is %s and you will %d years old next year.",yourName, yourAge);
*/


    Integer type1 = 127;
    Integer type2 = 127;
    IO.println(type1 == type2);
}
