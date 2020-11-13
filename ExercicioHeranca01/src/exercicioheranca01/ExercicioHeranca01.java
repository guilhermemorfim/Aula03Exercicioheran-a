/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioheranca01;

import model.CamaroteInferior;
import model.CamaroteSuperior;

/**
 *
 * @author SESI_SENAI
 */
public class ExercicioHeranca01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CamaroteSuperior c1 = new CamaroteSuperior();
        CamaroteInferior c2 = new CamaroteInferior();
        
        
        c2.localizacaoIngressoInf();
        
        c1.adicionarVip();
        c1.imprimeValor();
        
        
    
    }
    
}
