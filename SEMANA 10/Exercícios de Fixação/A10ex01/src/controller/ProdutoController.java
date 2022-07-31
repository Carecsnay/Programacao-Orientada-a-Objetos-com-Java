/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.ProdutoDao;
import model.Produto;

/**
 *
 * @author BRUNO
 */
public class ProdutoController {
   
    public boolean salvar (Produto produto) {
        ProdutoDao dao = new ProdutoDao();
        return dao.salvar(produto);
    }
    
    public boolean excluir (int id) {
        ProdutoDao dao = new ProdutoDao();
        return dao.excluir(id);
    }
}
