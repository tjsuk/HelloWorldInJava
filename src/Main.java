import javax.imageio.plugins.tiff.TIFFTagSet;

void main() {
/*    IO.println("Hello, World!");

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

    Scanner reader = new Scanner(System.in);
    IO.print("What is your name: ");

    String yourName = reader.nextLine();
    IO.print("What is your age: ");
    byte yourAge = reader.nextByte();
    yourAge++;
    System.out.printf("Your name is %s and you will %d years old next year.",yourName, yourAge);



    Integer type1 = 127;
    Integer type2 = 127;
    IO.println(type1 == type2);

    // byte -> short -> int -> long
    // long -> int -> short -> byte

    // long longNum = 100;
    // int intNum = (int)longNum;

    /*
    int numInt1 = 2;

    short numShort2 = 3;
    float result = 2/(float)3.0;

    long numLong3 = 342_934_092l;
    float pi3 = 3.99999999999999999999999999f;
    double result1 = numInt1 + pi3;
    IO.println(result);


    double price = 1.49; // litre price for petrol (£)
    int capacity = 20; // in litres
    double totalCostToFillTankFromEmpty = capacity * price;
    IO.println((int)totalCostToFillTankFromEmpty);



    char letter = 'B';
    int giveMeTheNumber = letter;
    IO.println(giveMeTheNumber);

    int letterValue = 97;
    char thisIsTheCharacter = (char)letterValue;
    IO.println(thisIsTheCharacter);

    char digit  = '8';
    int value = digit - '0';
    IO.println(value);

    char newLetter = (char)(letter + 32);
    IO.println(newLetter);



    final float VAT_RATE = 0.20f;


    final int quantity = 1_000;
    int total = quantity * 5;
    IO.println(1000 * 5);

    IO.println(3 + 6 * 7 / 9.0f);
    IO.println(3 == 7);

    byte b1 = -1;
    byte b2 = b1++;
    IO.println(b2);
    IO.println(b1);
    IO.println(-b2);

    byte a11 = 1;
    a11 += 5;  // a11 = a11 + 5;
    IO.println(a11);
    a11 -= 4;
    IO.println(a11);
    a11 *= 10;
    IO.println(a11);
    a11 /= 4;
    IO.println(a11);
    a11 %= 5;
    IO.println(a11);

    IO.println(1l/2l * 10); // 0

    int a12 = 5;
    double b12 = a12 + (25.0 / 10);  // a12 + 2.5
    IO.println(b12);


    byte age = 14;
    if (age >= 16) {
        IO.println("Can vote!");
    }
    else if (age == 15){
        IO.println("Can't vote, can next year!");
    }
    else {
        IO.println("Not eligible for voting at the moment!");
    }


    final short SCORE = 160;

    if (SCORE >= 150){
        IO.println("You're a genius!");
    }



    String user = "Admin";
    String pwd = "Password";

    String userInput = "admin";
    String userPwd = new String("Password01");

    if (user.toLowerCase().equals(userInput.toLowerCase()) && (pwd.equals(userPwd))){
        IO.println("Both matches");
//        if (!(pwd == userPwd)) {
//            IO.println("Password doesn't match");
//        }
    }


    int age = 18;
    boolean isMember = false;

    if (age >= 18) {

        if (isMember){
            IO.println("Eligible for member perks");
        } else {
            IO.println("Not a member, but meets age restriction.");
        }

    } else {
        IO.println("Too young to be a member.");
    }

    // AND
    byte age = 19;
    boolean isAdult = age >= 18;
    boolean hasID = true;
    boolean canEnter = isAdult && hasID;  // true

    // NAND
    boolean a = true;
    boolean b = false;
    boolean result = !(a && b); // true

    // OR
    boolean isAdmin = false;
    boolean isEditor = false;
    boolean canModify = isAdmin || isEditor; // false

    // NOR
    a = false;
    b = false;
    result = !(a || b); // true

    // BUFFER
    a = false;
    result = a; // false

    // NOT
    result = !a; // true

    // XOR
    a = true;
    b = false;
    result = a ^ b; // true

    // XNOR
    a = true;
    b = false;
    result = !(a ^ b); // false

    // a b c d -> a ^ b && c || d

    // boolean algebra

    // Identity Law
    // a && true => a
    // a || false => a
    boolean isEnabled = true;
    boolean output1 = isEnabled && true; //true ## boolean output1 = isEnabled;
    boolean output2 = isEnabled || false; // true ## boolean output2 = isEnabled;

    // Null (Domination) Law
    // a && false = false
    // a || true = true

    // Idempotent Law
    // a && a = a
    // a || a = a

    // Complement Law
    // a && !a = false
    // a || !a = true

    // Double Negation Law
    // !!a = a

    // Commutative Law
    // A && B = B && A
    // A || B = B || A

    // Associative Law
    // A && (B && C) = (A && B) && C
    // A || (B || C) = (A || B) || C

    // Distributive Law
    // A && (B || C) = (A && B) || (A && C)
    // A || (B && C) = (A || B) && (A || C)

    // Absorption Law
    // A || (A && B) = A
    // A && (A || B) = A

    // De Morgan's Law
    // !(A && B) = !A || !B
    // !(A || B) = !A && !B




    String weekday = "Monday";
    weekday = weekday.toUpperCase();

    switch(weekday){
        case "MONDAY":
            IO.println("Start of the week.");
            break;
        case "FRIDAY":
            IO.println("End of the week");
            break;
        default:
            IO.println("Mid week");
    }

    String level = "1";

    switch(level){
        case "1": IO.println("Level 1"); break;
        case "2": IO.println("Level 2"); break;

        default: IO.println("Not a level");
    }

    String role = "SUPERUSER";

    switch (role){
        case "ADMIN": IO.println("I am da BOSS!");
        case "SUPERUSER": IO.println("I am da Database boss!");
        break;
        default: IO.println("Not a boss!");
    }


    String cmd = "stop";

    if (cmd.equals("start")) {
        //do something
    } else if (cmd.equals("stop")) {
        // do something
    } else if (cmd.equals("restart")) {
        // do something
    } else if (cmd.equals("start")) {
        // do something
    } else {
        // do something
    }

    switch (cmd) {
        case "start": {
            IO.println("start");
            break;
        }
        case "stop": {
            /* do something
            break;
        }
        case "restart": {
            IO.println("restart");
            break;
        }
        default: {
            IO.println("No idea!");
        }
    }



    // Menu : 1. Dogs, 2. Cats, 3. Gerbils, 4. Goldfish ...
    String option = "1";
    switch(option){
        case "1" -> IO.println("Dogs");
        case "2" -> IO.println("Cats");
        case "3" -> IO.println("Gerbils");
        case "4" -> IO.println("Goldfish");
        default -> IO.println("What the hell is that?");
    }

    int score = 0;
    switch(score){
        case 0,1,2,3,4 -> IO.println("Very low.");
        case 5,6,7,8,9 -> IO.println("Average");
        case 10 -> IO.println("High");
        default -> IO.println("Out of scope");
    }

    // for odd numbers
    for (int i = 2; i <= 10; i++){
        if (i%2 == 1)
            IO.println(i);
    }

    // LESS COMPLEX
    for (int i = 1; i <= 10; i+=2){
        IO.println(i);
    }


    byte count = 0;
    boolean useLoop = true;
    while (useLoop){
        IO.println("Currently using the loop");
        count++;
        if (count < 10){
            useLoop = true;
        }
        else{
            useLoop = false;
        }
    }

    // Don't use While True!
    while (true){
        // Oh crap I'm stuck in a loop, I know I will use Break!
    }


    // do while


    Scanner reader = new Scanner(System.in);
    String choice;
    do {
        IO.println("""
    Menu 
    option 1:
    option 2:
    ...
     
    """);
        IO.print("Enter your name: ");
        choice = reader.nextLine();
        // validate your reader.
    }
    while (choice.isBlank());

    // using continue to ignore a condition
    for (int i = 0; i <= 30; i++) {
        if (i%5 == 0) continue;
            IO.println("Found 5 at index " + i);
    }

    // Infinite loop
    while(true){
        IO.print("Hello World ");
    }
    // break out using the run stop option in your ide
    // in a shell use ctrl + c


    // Infinite loop inside a for loop
    for (int i = 0;  i >= 0 ; i++) {
        IO.println(i);
    }

    // int[] numbers = new int[10];
    int[] numbers = {1,2,3,4,5,6,7,8,9,10};
    // int[] numbers = new int[]{1,2,3,4,5,6,7,8,9,10};

    // int[] numbers;
    // numbers = new int[1_000_000];
    // IO.println(numbers[100_456]);

    // for (int i = 0; i < numbers.length; i++) {
    //    IO.print(numbers[i] + " ");
    //    }

    int[] copy = Arrays.copyOf(numbers, numbers.length);
    for (int i = 0; i < copy.length; i++) {
        IO.print(copy[i] + " ");
    }
    IO.println();
    IO.println(copy.length);

    int[] copyRange = Arrays.copyOfRange(numbers,1,4);
    for (int i = 0; i < copyRange.length; i++) {
        IO.print(copyRange[i] + " ");
    }

    IO.println();

    int[] copyOfNumbers = numbers;
    for (int i = 0; i < copyOfNumbers.length; i++) {
        IO.print(copyOfNumbers[i] + " ");
    }

    // copyOfNumbers[9] = 1000;

    IO.println(numbers[9] + " " + copyOfNumbers[9] + " " + copy[9]);

    int[] clonedArray = numbers.clone();
    clonedArray[9] = 1000;
    IO.println(numbers[9] + " " + clonedArray[9]);


    int[] numbers = {1,2,3,4,5,6,7,8,9,10};

    for (int i = 0; i < numbers.length; i++) {
        IO.println(numbers[i]);
    }

    for(int number:numbers){
        IO.println(number);
    }

    int[] numbers = new int[1_000_000];
    for (int i = 0; i < numbers.length; i++) {
        numbers[i] = i + 1;
    }


    binarySearch(numbers,1_000_000);

    // Parallel Arrays
    int[] numbers; // uninitialised array
    String[] names = {"Max","Bella","Rocky"};
    int[] ages = {5, 3, 7};
    String[] types = {"Dog","Cat","Dog"};

    for (int i = 0; i < names.length; i++) {
        // IO.printf("The <type> is called <name> and is <age> years old");
        System.out.printf("The %s is called %s and is %d years old. %n",types[i],names[i],ages[i]);
        System.out.println("The " + types[i] + " is called " + names[i] + " and is " + ages[i] + " years old.");
    }

    int[][] grid = new int[3][10];
    grid[0][1] = 5;

    // Changes the format of the array (Jagged Array)
    grid[1] = new int[]{6, 7, 8};
    grid[2] = new int[]{1,2,3,4,5,6,7,8,9,10,11};
    //IO.println(grid[0][1]);

    // Traditional for loop
    for (int i = 0; i < grid.length; i++) {
        for (int j = 0; j < grid[i].length; j++) {
            IO.print(grid[i][j] + " ");
        }
        IO.println();
    }

    IO.println();

    // Enhanced for loop
    for (int[] row : grid){
        for (int cell : row){
            IO.print(cell + " ");
        }
        IO.println();
    }

    int[][] jaggedArray = new int[3][];
    jaggedArray[0] = new int[5];
    jaggedArray[1] = new int[]{1,2,3,4};
    jaggedArray[2] = new int[1];

    for (int[] row : jaggedArray){
        for (int cell : row){
            IO.print(cell + " ");
        }
        IO.println();
    }


    ArrayList<Integer> list = new ArrayList<>();
    list.add(45);
    list.add(56);
    list.add(3);
    //IO.println(list.get(0));

    for (int i = 0; i < list.size(); i++) {
        IO.println(list.get(i));
    }


    double price = 12.5;
    System.out.printf("Price = £%.2f%n",price);

    System.out.printf("%-10s %10.2f%n","Total:",34.99);

 */

}




public static int binarySearch(int[] arr, int target){

    int left = 0;
    int right = arr.length - 1;
    int count = 0;

    while (left <= right) {
        count++;
        IO.print(" " + count);
        int mid = left + (right - left) / 2;

        if (arr[mid] == target) return mid;
        if (arr[mid] < target) left = mid + 1;
        else right = mid - 1;
    }
    return -1;
}

