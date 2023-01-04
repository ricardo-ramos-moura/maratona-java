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



    }
}
