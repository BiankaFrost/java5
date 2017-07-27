/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class Funcionario extends Pessoa{

    /**
     * @return the carttrab
     */
    public String getCarttrab() {
        return carttrab;
    }

    /**
     * @param carttrab the carttrab to set
     */
    public void setCarttrab(String carttrab) {
        this.carttrab = carttrab;
    }

    /**
     * @return the tiposangue
     */
    public char getTiposangue() {
        return tiposangue;
    }

    /**
     * @param tiposangue the tiposangue to set
     */
    public void setTiposangue(char tiposangue) {
        this.tiposangue = tiposangue;
    }

    /**
     * @return the planodesaude
     */
    public String getPlanodesaude() {
        return planodesaude;
    }

    /**
     * @param planodesaude the planodesaude to set
     */
    public void setPlanodesaude(String planodesaude) {
        this.planodesaude = planodesaude;
    }

    /**
     * @return the salario
     */
    public float getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(float salario) {
        this.salario = salario;
    }

    /**
     * @return the banco
     */
    public DadosBancarios getBanco() {
        return banco;
    }

    /**
     * @param banco the banco to set
     */
    public void setBanco(DadosBancarios banco) {
        this.banco = banco;
    }

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
    private String carttrab;
    private char tiposangue;
    private String planodesaude;
    private float salario;
    private DadosBancarios banco;
    private Endereco endereço;
    
    
}
