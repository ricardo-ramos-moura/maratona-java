package academy.devdojo.introducao;

public class EstruturasCondicionais {
    public static void main(String[] args) {
        int age = 15;
        boolean isAuthorizedBuyAlcoholicDrink = age >= 18;

        if (isAuthorizedBuyAlcoholicDrink){
            System.out.println("Autorizado a comprar Bebida Alcólica.");
        }

        if (!isAuthorizedBuyAlcoholicDrink){
            System.out.println("Não autorizado a comprar Bebida Alcólica.");
        }

        boolean aux = false;
        if (aux == true){
            System.out.println("Dentro e algo que nunca deve ser feito");
        }


    }
}
