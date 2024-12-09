package assignments;

public class Assignment1 {
    public static void main (String[] args) {Operators();
        PrintName();
        Swap();}
// Working with variables and datatypes
    public static void Operators() {
        int x = 4;
        int y = 36;
        int z = 1;
        int sum = x + y;
        int diff = x - y;
        int mul = x * y * z;
        int div = y / z;
        int mod = y % z;
        System.out.println("Sum=" + sum + " " + "Diff=" + diff + " " + "Mult=" + mul + " " + "Mod=" + mod);
    }
// Print Hello world in different lines
    public static void PrintName() {
        System.out.println("Hello\nWorld");
        //System.out.println("World");
    }
// Swap two different variables
    public static void Swap() {
        int a = 2;
        int b = 4;
        System.out.println("Original a="+a+" Original b="+b);
        int c= a;
        a= b;
        b= c;
        System.out.println("a="+a+" b="+b);

        //Using XOR operator
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a="+a+" b="+b);

        //Using addition and subtraction
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a="+a+" b="+b);
    }
}

