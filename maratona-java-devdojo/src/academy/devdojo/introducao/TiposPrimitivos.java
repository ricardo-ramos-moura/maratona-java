package academy.devdojo.introducao;

public class TiposPrimitivos {
    public static void main(String[] args) {
        //int, double, float, char, byte, short, long, boolean
        int age = 10;
        long bigNumber = 100000;
        double salaryDouble = 2000;
        float salaryFloat = 2500;
        byte ageByte = -128;
        short ageShort = 10;
        boolean trueBoolean = true;
        boolean falseBoolean = false;
        char character = 'R';
        System.out.println("Age is " + age + " years");
        System.out.println(falseBoolean);
        System.out.println("Char: " + character);

        float salaryDoubleCast = (float) 2500.0D;
        System.out.println("Salary cast is " + salaryDoubleCast);

    }
}
