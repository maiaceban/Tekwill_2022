public class Main {
    /**
     * Invalid declaration of variables
     *
     */
    public static void main(String[] args) {
        /*
        Given two or more variables a and b etc. with invalid declarations. Add a type to them.
         */
        byte b = 123;
        short s = 32767;
        int i = 2_147_483_647;
        long l = 9_223_372_036_854_775_807L;
        float f = 2_147_483_647.2_147_483_647F;
        double d = 9_223_372_036_854_775_807.9_223_372_036_854_775_807;
        char c = 'M';
        boolean bool = true;


        System.out.println("byte b = " + b);
        System.out.println("short s = " + s);
        System.out.println("int i = " + i);
        System.out.println("long l = " + l);
        System.out.println("float f = " + f);
        System.out.println("double d = " + d);
        System.out.println("char c = " + c);
        System.out.println("boolean bool = " + bool);
    }
}