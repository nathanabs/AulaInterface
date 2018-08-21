/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import entities.AluguelDeCarro;
import entities.Veiculo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import service.AluguelService;
import service.ImpostoBrasilService;

/**
 *
 * @author Nathan
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel do carro:");
        System.out.print("Modelo do carro: ");
        String modeloCarro = sc.nextLine();
        System.out.print("Inicio do aluguel (dd/MM/yyyy HH:mm): ");
        Date inicio = sdf.parse(sc.nextLine());
        System.out.print("Entrega do carro (dd/MM/yyyy HH:mm): ");
        Date fim = sdf.parse(sc.nextLine());

        AluguelDeCarro aluguel = new AluguelDeCarro(inicio, fim, new Veiculo(modeloCarro));
        System.out.print("Preco por hora: ");
        double precoPorHora = sc.nextDouble();
        System.out.print("Preco por dia: ");
        double precoPorDia = sc.nextDouble();

        AluguelService servicoAluguel = new AluguelService(precoPorHora, precoPorDia, new ImpostoBrasilService());

        servicoAluguel.processoDeFatura(aluguel);
        System.out.println("Fatura:");
        System.out.println("Pagamento basico: " + String.format("%.2f", aluguel.getFatura().getPagamentoBasico()));
        System.out.println("Tax: " + String.format("%.2f", aluguel.getFatura().getImposto()));
        System.out.println("Total payment: " + String.format("%.2f", aluguel.getFatura().getTotalPagamento()));

        sc.close();
    }

}
