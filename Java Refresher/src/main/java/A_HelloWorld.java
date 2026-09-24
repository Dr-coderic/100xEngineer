public class A_HelloWorld {
    public static void main(String[] args) {

        String name = "Vaibhav";

        // System.out.print()
        System.out.print("Hello World");
//        system.out.print("Hello World");    --> compilation error: java is case-sensitive
        System.out.print("My name is: " + name );

        System.out.println();
        //System.out.println()
        System.out.println("Hello world");
        System.out.println("My name is: " + name);

        // --> single line of comment

        /*
        * multi line comment
        *
        */

        //printing numbers
        System.out.println(10);
        System.out.println(10+5);   // when an operator is placed in b/w numbers, first the value is calculated then the result is printed.
        System.out.println(10-5);   //5
        System.out.println(10*5);   //50
        System.out.println(10/5);   //2
        System.out.println(-10);
        System.out.println(11.268);

//        Quiz
        System.out.println(8-5);    //  3
        System.out.println(10);     //  10
        System.out.println("10");   //  10
        System.out.println("5*3");  //  5*3
        System.out.println(5*3);    //  15


        //Concatenation
        System.out.println("Ram" + " aur" + " Lakhan"); //first concat - Ram aur Lakhan --> then print
        System.out.println("My age is " + 25);          // My age is 25
        System.out.println("Random " + 10 + 30);        //Random 1030
        // ^ reason, addition happens left to right, -->"Random "+ 10 + 30 --> "Ransom 10" + 30 --> "Random 1030"
        System.out.println(10 + 30 + " Random");          // 40 Random


        //Escape characters -- to print " , ' etc
        System.out.println("\'10\'");       // '10'


//        Data types
//          String, "-"
//        Numbers - int, short, long, byte, double, float
//        char
//



    }
}
