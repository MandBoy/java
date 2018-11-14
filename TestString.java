public class TestString {
    
    public static void main(String[] args){

        String TestString = "Category";
        System.out.println(TestString.charAt(2)); //output: t
        System.out.println(TestString.length()); //output: 8

        //------format------------

        String name = "sonoo";
        String sf1 = String.format("name is %s", name);
        String sf2 = String.format("value is %f", 32.334334);
        String sf3 = String.format("value is %32.12f", 32.33434);

        System.out.println(sf1); //name is sonoo
        System.out.println(sf2); //value is 32.33434
        System.out.println(sf3); //value is         32.334340000000

        String str1 = String.format("%d", 101);          // Integer value
        String str2 = String.format("%s", "Amar Singh"); // String value
        String str3 = String.format("%f", 101.00);       // Float value
        String str4 = String.format("%x", 101);          // Hexadecimal value
        String str5 = String.format("%c", 'c');          // Char value
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);

        String str6 = String.format("%d", 101);
        String str7 = String.format("|%10d|", 101);  // Specifying length of integer
        String str8 = String.format("|%-10d|", 101); // Left-justifying within the specified width
        String str9 = String.format("|% d|", 101);
        String str10 = String.format("|%010d|", 101); // Filling with zeroes
        System.out.println(str6);
        System.out.println(str7);
        System.out.println(str8);
        System.out.println(str9);
        System.out.println(str10);


    }
}