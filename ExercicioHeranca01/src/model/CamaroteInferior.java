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
public class CamaroteInferior extends Vip {
    
    private String localizacao;

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    
    
    
    public void localizacaoIngressoInf(){
        
        System.out.println("Ingresso do camarote Inferior!");
        
    }
    

    
}
