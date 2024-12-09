package day1;

public class Basics {
    public static void main(String[] args) {
        int name = 135;
        float age = 25.56232322342323423F;
        String s = "john doe";
        System.out.println(name + " " + age + " " + s);
        Operators();
        PrintName();
        Swap();
    }

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

    public static void PrintName() {
        System.out.println("Hello\nWorld");
        //System.out.println("World");
    }

    public static void Swap() {
        int a = 2;
        int b = 4;
        System.out.println("a="+a+" b="+b);
        int c= a;
        a= b;
        b= c;
        System.out.println("a="+a+" b="+b);
    }
}


