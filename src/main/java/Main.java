import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> nomes = new ArrayList<>();
        String nome;

        for (int i = 0; i < 6; i++) {
            System.out.println("Informe o nome " + (i+1) + ": ");
            nome = sc.nextLine();
            nomes.add(nome);            
        }

        ArrayList<Brownie> listaArray = new ArrayList<>();


        BrownieCafe brownieCafe = new BrownieCafe();
        brownieCafe.nome = nomes.get(0);
        brownieCafe.preco = new Random().nextDouble()*10;
        listaArray.add(brownieCafe);

        BrownieCafe brownieCafe2 = new BrownieCafe();
        brownieCafe2.nome = nomes.get(1);
        brownieCafe2.preco = new Random().nextDouble()*10;
        listaArray.add(brownieCafe2);

        BrownieCarne brownieCarne =  new BrownieCarne();
        brownieCarne.nome = nomes.get(2);
        brownieCarne.preco = new Random().nextDouble()*10;
        listaArray.add(brownieCarne);

        BrownieCarne brownieCarne2 =  new BrownieCarne();
        brownieCarne2.nome = nomes.get(3);
        brownieCarne2.preco = new Random().nextDouble()*10;
        listaArray.add(brownieCarne2);

        BrownieChocolate brownieChocolate = new BrownieChocolate();
        brownieChocolate.nome = nomes.get(4);
        brownieChocolate.preco = new Random().nextDouble()*10;
        listaArray.add(brownieChocolate);

        BrownieChocolate brownieChocolate2 = new BrownieChocolate();
        brownieChocolate2.nome = nomes.get(5);
        brownieChocolate2.preco = new Random().nextDouble()*10;
        listaArray.add(brownieChocolate2);

        // Antes de ordenar
        System.out.println("ANTES DE ORDENAR");
        System.out.println(" ");
        for (Brownie value : listaArray) {
            System.out.println("Nome: " + value.nome);
            System.out.println("Preco: " + value.preco);
            System.out.println(" ");
        }

        Collections.sort(listaArray);

        // Depois de ordenar
        System.out.println("Depois DE ORDENAR");
        System.out.println(" ");
        for (Brownie brownie : listaArray) {
            System.out.println("Nome: " + brownie.nome);
            System.out.println("Preco: " + brownie.preco);
            System.out.println(" ");
        }

        sc.close();
    }

}
