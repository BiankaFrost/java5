
import java.io.File;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class Pessoa {

    /**
     * @return the fixo
     */
    public Telefone getFixo() {
        return fixo;
    }

    /**
     * @param fixo the fixo to set
     */
    public void setFixo(Telefone fixo) {
        this.fixo = fixo;
    }

    /**
     * @return the celular
     */
    public Telefone getCelular() {
        return celular;
    }

    /**
     * @param celular the celular to set
     */
    public void setCelular(Telefone celular) {
        this.celular = celular;
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cpf
     */
    public int getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the RG
     */
    public int getRG() {
        return RG;
    }

    /**
     * @param RG the RG to set
     */
    public void setRG(int RG) {
        this.RG = RG;
    }

    /**
     * @return the dt_nasc
     */
    public int getDtnasc() {
        return dtnasc;
    }

    /**
     * @param dtnasc the dt_nasc to set
     */
    public void setDtnasc(int dtnasc) {
        this.dtnasc = dtnasc;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the foto
     */
    public File getFoto() {
        return foto;
    }

    /**
     * @param foto the foto to set
     */
    public void setFoto(File foto) {
        this.foto = foto;
    }
    
    private int codigo;
    private String nome;
    private int cpf;
    private int RG;
    private int dtnasc;
    private String email;
    private File foto;
    private Telefone fixo;
    private Telefone celular;
    
    
    
    
}
