/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author SESI_SENAI
 */
public class Vip extends Ingresso {

  
    protected double valorAdicional = 5.00;
    protected double valorVip;

    public void adicionarVip() {
        valorVip = valor + valorAdicional;
    }

    @Override
    public void imprimeValor() {

        System.out.println("O valor do ingresso é: " + valorVip);
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public double getValorVip() {
        return valorVip;
    }
    
    

}
