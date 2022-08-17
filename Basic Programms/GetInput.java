import java.util.*; //for getting input you need to use the scanner class you canfine that class in the java.util package.
//import java.util.scanner;   //you can also specifay the only scanner class from the java.util package.

public class GetInput {
    public static void main(String[] args) {

        Scanner get = new Scanner(System.in);// for input you need to create the scanner class object here you crete the
                                             // (get) object.

        System.out.print("Enter any String = ");
        String Word = get.nextLine();

        System.out.print("Enter Decimal for float = ");
        float decimal = get.nextFloat();

        System.out.print("Enter number = ");
        int number = get.nextInt();

        /*
         * double largeDecimal = get.nextDouble();
         * byte ByteNumber=get.nextByte();
         * boolean BoolNo=get.nextBoolean();
         * long largeNo=get.nextLong();
         * short shortNo=get.nextShort();
         * BigInteger variableName=get.nextBigInteger();
         * BigDecimal variableName=get.nextBigDecimal();
         */
        System.out.println(Word + "\n" + decimal + "\n" + number);

    }
}