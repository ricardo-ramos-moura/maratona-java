package academy.devdojo.introducao;

public class Operadores {
    public static void main(String[] args) {
        // + - / *
        int number01 = 10;
        int number02 = 10;

        double result = number01 / (double) number02;
        System.out.println(result);


        // % rest
        int rest = 20 % 10;
        System.out.println(rest);

        // > < >= <= !=
        boolean isTenLargerTwenty = 10 > 20;
        boolean isTenSmallerTwenty = 10 < 20;
        boolean isTenLargerEqualTwenty = 10 >= 20;
        boolean isTenSmallerEqualTwenty = 10 <= 20;
        boolean isTenDifferentTwenty = 10 != 20;
        System.out.println("isTenLargerTwenty " + isTenLargerTwenty);
        System.out.println("isTenSmallerTwenty " + isTenSmallerTwenty);
        System.out.println("isTenLargerEqualTwenty " + isTenLargerEqualTwenty);
        System.out.println("isTenSmallerEqualTwenty " + isTenSmallerEqualTwenty);
        System.out.println("isTenDifferentTwenty " + isTenDifferentTwenty);

        // && (AND) || (OR) !
        int age = 30;
        boolean isLargerhirty = age > 30;
        boolean isLargerEqualThirty = age >= 30;
        System.out.println("isLargerhirty " + isLargerhirty);
        System.out.println("isLargerEqualThirty " + isLargerEqualThirty);

        double savingsAccountValue = 200;
        double currentAccountValue = 10000;
        float playstationValue = 5000F;
        boolean isPlaystationPurchasable = currentAccountValue >= playstationValue || savingsAccountValue >= playstationValue;
        System.out.println("isPlaystationPurchasable " + isPlaystationPurchasable);

        // = += -= *= /= %=
        double bonus = 1800;
        bonus += 200;
        System.out.println("+= " + bonus);
        bonus -= 200;
        System.out.println("-= " + bonus);
        bonus *= 2;
        System.out.println("*= " + bonus);
        bonus /= 2;
        System.out.println("/= " + bonus);
        bonus %= 2;
        System.out.println("%= " + bonus);

        // ++ --
        int count = 0;
        count += 1; //count = count + 1;
        count++;
        count--;
        ++count;
        --count;
        System.out.println(count);

    }
}
