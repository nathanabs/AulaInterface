/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entities.AluguelDeCarro;
import entities.Fatura;

/**
 *
 * @author Nathan
 */
public class AluguelService {

    private Double precoPorHora;
    private Double precoPorDia;
    private ImpostoBrasilService impostoBrasil;

    public AluguelService(Double precoPorHora, Double precoPorDia, ImpostoBrasilService impostoBrasil) {
        this.precoPorHora = precoPorHora;
        this.precoPorDia = precoPorDia;
        this.impostoBrasil = impostoBrasil;
    }

    public void processoDeFatura(AluguelDeCarro aluguelCarro) {
        long t1 = aluguelCarro.getInicio().getTime();
        long t2 = aluguelCarro.getFim().getTime();

        double horas = (double) (t2 - t1) / 1000 / 60 / 60;
        double pagamentoBasico;
        
        if (horas <= 12) {
            pagamentoBasico = Math.ceil(horas) * precoPorHora;
        } else {
            pagamentoBasico = Math.ceil(horas/24) * precoPorDia;
        }
        
        double imposto = impostoBrasil.imposto(pagamentoBasico);
        
        aluguelCarro.setFatura(new Fatura(pagamentoBasico, imposto));
        
    }

}
