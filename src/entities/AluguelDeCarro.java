/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.Date;

/**
 *
 * @author Nathan
 */
public class AluguelDeCarro {

    private Date inicio;
    private Date fim;
    private Veiculo modelo;
    private Fatura fatura;

    public AluguelDeCarro() {
    }
    

    public AluguelDeCarro(Date inicio, Date fim, Veiculo modelo) {
        this.inicio = inicio;
        this.fim = fim;
        this.modelo = modelo;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFim() {
        return fim;
    }

    public void setFim(Date fim) {
        this.fim = fim;
    }

    public Veiculo getModelo() {
        return modelo;
    }

    public void setModelo(Veiculo modelo) {
        this.modelo = modelo;
    }

    public Fatura getFatura() {
        return fatura;
    }

    public void setFatura(Fatura fatura) {
        this.fatura = fatura;
    }
    
}
