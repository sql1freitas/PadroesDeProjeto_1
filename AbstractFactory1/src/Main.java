import Client.Client;
import Fabricas.FabricaPerifericos;
import Fabricas.FabricaRazer;
import Fabricas.FabricaRedDragon;
import java.util.Scanner;


/**
 * @author Matheus
 */



public class Main {

    /**
     * Configuração da Classe Client
     * @return
     */
    private static Client Fabricar(){
        Client app;
        FabricaPerifericos fabricaPerifericos = null;
        Scanner input = new Scanner(System.in);


        System.out.println("De qual marca você deseja criar os periféricos?");
        System.out.println("(1)Red Dragon / (2)Razer ");
        Integer opcao = input.nextInt();

        if (opcao == 1){
            fabricaPerifericos = new FabricaRedDragon();
        } else if (opcao == 2) {
            fabricaPerifericos = new FabricaRazer();
        } else {
            System.out.println("Opção inválida!");
        }

        app = new Client(fabricaPerifericos);
        return app;



    }










    public static void main(String[] args){


    Client app = Fabricar();
    app.create();


    }



}