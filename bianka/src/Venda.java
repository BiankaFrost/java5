/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class Venda {

    /**
     * @return the usaitem
     */
    public Itens getUsaitem() {
        return usaitem;
    }

    /**
     * @param usaitem the usaitem to set
     */
    public void setUsaitem(Itens usaitem) {
        this.usaitem = usaitem;
    }

    /**
     * @return the infoproduto
     */
    public Produto getInfoproduto() {
        return infoproduto;
    }

    /**
     * @param infoproduto the infoproduto to set
     */
    public void setInfoproduto(Produto infoproduto) {
        this.infoproduto = infoproduto;
    }
    private Produto infoproduto;
    private Itens usaitem;
    
}
