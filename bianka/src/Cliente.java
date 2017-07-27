/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class Cliente extends Pessoa {

    /**
     * @return the endereço
     */
    public Endereco getEndereço() {
        return endereço;
    }

    /**
     * @param endereço the endereço to set
     */
    public void setEndereço(Endereco endereço) {
        this.endereço = endereço;
    }
   private Endereco endereço;
   
    
}
