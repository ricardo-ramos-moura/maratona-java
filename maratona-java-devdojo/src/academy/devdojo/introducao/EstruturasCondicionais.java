package academy.devdojo.introducao;

public class EstruturasCondicionais {
    public static void main(String[] args) {
        int age = 15;
        boolean isAuthorizedBuyAlcoholicDrink = age >= 18;

        if (isAuthorizedBuyAlcoholicDrink){
            System.out.println("Autorizado a comprar Bebida Alcólica.");
        }else{
            System.out.println("Não autorizado a comprar Bebida Alcólica.");
        }

        if (!isAuthorizedBuyAlcoholicDrink){
            System.out.println("Não autorizado a comprar Bebida Alcólica.");
        }

        boolean aux = false;
        if (aux == true){
            System.out.println("Dentro e algo que nunca deve ser feito");
        }

        //Idade < 15 categoria infantil
        //Idade >= 15 && idade < 18 categoria juvenil
        //Idade >= 18 && idade categoria adulto
        age = 20;
        String category;
        if (age < 15){
            category = "Categoria Infantil";
        }else if (age >= 15 && age < 18){
            category = "Categoria Juvenil";
        }else{
            category = "Categoria Adulto";
        }
        System.out.println(category);


    }
}
