package br.unicamp.ic.inf335;

import java.util.ArrayList;
import java.util.Collections;

import br.unicamp.ic.inf335.beans.ProdutoBean;

public class Brecho {

	private static ArrayList<ProdutoBean> produtos = new ArrayList<ProdutoBean>();
	
	public static void main(String[] args) {
		ProdutoBean p1 = new ProdutoBean("CD00001","Celular Galaxy S10", "128 Gb, Preto, com Carregador", 1250.0, "Poucos riscos, estado de novo.");
		ProdutoBean p2 = new ProdutoBean("CD00002","Prod 2 ...", "Bla Bla Bla", 1100.0, "Bla Bla Bla");
		ProdutoBean p3 = new ProdutoBean("CD00003","Prod 3 ...", "Bla Bla Bla", 120.0, "Bla Bla Bla");
		ProdutoBean p4 = new ProdutoBean("CD00004","Prod 4 ...", "Bla Bla Bla", 1300.0, "Bla Bla Bla");
		ProdutoBean p5 = new ProdutoBean("CD00005","Prod 5 ...", "Bla Bla Bla", 9400.0, "Bla Bla Bla");
		ProdutoBean p6 = new ProdutoBean("CD00006","Prod 6 ...", "Bla Bla Bla", 1500.0, "Bla Bla Bla");

		produtos.add(p1);
		produtos.add(p2);
		produtos.add(p3);
		produtos.add(p4);
		produtos.add(p5);
		produtos.add(p6);
		
		// Imprime produtos
		for (int i=0; i<produtos.size(); i++) {
			System.out.println("Codigo = " + produtos.get(i).getCodigo() + " Nome = " + produtos.get(i).getNome() + " Valor = " + produtos.get(i).getValor());
		}
		
		// Ordena produtos
		Collections.sort(produtos);
		
		System.out.println("-------------------- Produtos Ordenados -------------------");
		// Imprime produtos ordenados
		for (int i=0; i<produtos.size(); i++) {
			System.out.println("Codigo = " + produtos.get(i).getCodigo() + " Nome = " + produtos.get(i).getNome() + " Valor = " + produtos.get(i).getValor());
		}
		
		// Calcula M�dia
		Double media = 0.0;
		int i = 0;
		while (i<produtos.size()) {
			media += produtos.get(i).getValor();
			i++;
		}
		media = media / i;
		System.out.println("Media de Valores = " + media);
	}
}
