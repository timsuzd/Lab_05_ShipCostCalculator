public class Main {
    static void main()
    {
        // int number with no fraction can be negative

        int age = 18;
        double salary = 12.00;
        String name = "Tim";
        String greeting = "Hello World";
        boolean isRaining = false;


        IO.println("Hello World!"); //string literal

        IO.println(greeting); //variable

        IO.println(isRaining);

        // arithmetic * / + - %
        int intOperandA = 10;
        int intOperandB = 6;
        int intSum = 0;
        int intProduct = 0;
        int intDifference = 0;
        int intQuotient = 0;
        int intModulo = 0;

        intSum = intOperandA + intOperandB;
        intProduct = intOperandA * intOperandB;
        intDifference = intOperandA - intOperandB;
        intQuotient = intOperandA / intOperandB;
        intModulo = intOperandA % intOperandB;
        IO.println("The sum of " + intOperandA + " + " + intOperandB + " is " + intSum);
        IO.println("The product of " + intOperandA + " * " + intOperandB + " is " + intProduct);
        IO.println("The difference of " + intOperandA + " - " + intOperandB + " is " + intDifference);
        IO.println("The quotient of " + intOperandA + " / " + intOperandB  + " is " + intQuotient);
        IO.println("The remainder when dividing " + intOperandA + " by " + intOperandB + " is " + intModulo);

        double doubleOperandA = 7.318;
        double doubleOperandB = 141.009;
        double doubleSum = 0;
        double doubleProduct = 0;
        double doubleDifference = 0;
        double doubleQuotient = 0;
        double doubleModulo = 0;

        doubleSum = doubleOperandA + doubleOperandB;
        doubleProduct = doubleOperandA * doubleOperandB;
        doubleDifference = doubleOperandA - doubleOperandB;
        doubleQuotient = doubleOperandA / doubleOperandB;
        doubleModulo = doubleOperandA % doubleOperandB;
        IO.println("The sum of " + doubleOperandA + " + " + doubleOperandB + " is " + doubleSum);
        IO.println("The product of " + doubleOperandA + " * " + doubleOperandB + " is " + doubleProduct);
        IO.println("The difference of " + doubleOperandA + " - " + doubleOperandB + " is " + doubleDifference);
        IO.println("The quotient of " + doubleOperandA + " / " + doubleOperandB  + " is " + doubleQuotient);
        IO.println("The remainder when dividing " + doubleOperandA + " by " + doubleOperandB + " is " + doubleModulo);

        double purchasePrice = 23.91;
        final double SALES_TAX_RATE = .05;
        double salesTax = 0;
        double total = 0;

        salesTax = purchasePrice * SALES_TAX_RATE;
        total = purchasePrice + salesTax;

        // Java 1.8 : System.out.println
        // Modern Java 24+ IO.println
        IO.println("_____________________________________________________________________________________________________________________________");
        IO.println("The sales tax on $" + purchasePrice + " is $" + salesTax);
        IO.println("The total cost is $" + total);
    }



}