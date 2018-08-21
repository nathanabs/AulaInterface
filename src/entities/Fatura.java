/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author Nathan
 */
public class Fatura {

    private Double pagamentoBasico;
    private Double imposto;

    public Fatura() {
    }

    public Fatura(Double pagamentoBasico, Double imposto) {
        this.pagamentoBasico = pagamentoBasico;
        this.imposto = imposto;
    }

    public Double getPagamentoBasico() {
        return pagamentoBasico;
    }

    public void setPagamentoBasico(Double pagamentoBasico) {
        this.pagamentoBasico = pagamentoBasico;
    }

    public Double getImposto() {
        return imposto;
    }

    public void setImposto(Double imposto) {
        this.imposto = imposto;
    }
    
    public double getTotalPagamento(){
        return getImposto()+getPagamentoBasico();
    }
}
