package Questao4;

import java.util.ArrayList;
import java.util.Scanner;

public class ProdutoDemo {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Produto p1 = new Produto();
        ArrayList<Produto> produtos = new ArrayList<Produto>();
        System.out.println("Catalogos de Produtos");
        p1.adicionarElementos();
        p1.exibirProdutos();
        //p1.buscarProduto(produtos);
        
    }
}
