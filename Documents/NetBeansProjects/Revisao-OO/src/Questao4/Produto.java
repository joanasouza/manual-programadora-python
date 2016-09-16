/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author joana.souza
 */
public class Produto {
    private String desc; //descricao do projeto
    private double preco;
    private int saldo;
    private ArrayList<Produto> produtos = new ArrayList<Produto>();

    public Produto(String desc, double preco, int saldo) {
        this.desc = "Produto X";
        this.preco = 0.0;
        this.saldo = 0;
    }
    
    public Produto() {}
    public String getDesc() {
        return desc;
    }
    
    public void adicionarElementos() {
        Produto p1 = new Produto();
        
       for(int i = 0; i < produtos.size(); i++) {
           produtos.add(p1);
            
        }
    }
    public void buscarProduto(ArrayList<Produto> produtos) {
        Scanner entrada = new Scanner(System.in);
        String nomeProduto;
        System.out.println("Produto a ser buscado: ");
        nomeProduto = entrada.next();
        String res = entrada.next();
        while(res.equals("fim") == false) {
        for(int i = 0; i < produtos.size(); i++) {
            if(produtos.get(i).equals(nomeProduto)) {
                System.out.println(produtos.get(i).getPreco()); 
                System.out.println(produtos.get(i).getSaldo());
            }
            else {
                System.out.println("Produto inexistente no catálogo!");
            }
        }
        }
    }
    public void exibirProdutos() {
    for(int i = 0; i < produtos.size(); i++) {
            System.out.println(produtos.get(i).getDesc()); 
            System.out.println(produtos.get(i).getPreco()); 
            System.out.println(produtos.get(i).getSaldo());
        }
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}
