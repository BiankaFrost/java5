/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class Telefone {

    /**
     * @return the descrição
     */
    public String getDescriçao() {
        return descriçao;
    }

    /**
     * @param descriçao the descrição to set
     */
    public void setDescriçao(String descriçao) {
        this.descriçao = descriçao;
    }

    /**
     * @return the ddd
     */
    public int getDdd() {
        return ddd;
    }

    /**
     * @param ddd the ddd to set
     */
    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    /**
     * @return the numerodotel
     */
    public int getNumerodotel() {
        return numerodotel;
    }

    /**
     * @param numerodotel the numerodotel to set
     */
    public void setNumerodotel(int numerodotel) {
        this.numerodotel = numerodotel;
    }
    private String descriçao;
    private int ddd;
    private int numerodotel;
    
}
