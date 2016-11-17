package economizap2;

import java.util.ArrayList;
import java.util.Scanner;

public class Produtos {
	
	Scanner teclado = new Scanner(System.in);
	
	private String nome;
	private double preco;
	private String tipo;
	private int estoque;
	
	ArrayList<String> listaNomes = new ArrayList();
	ArrayList<Double> listaPreco = new ArrayList();
	ArrayList<String> listaTipo = new ArrayList();
	ArrayList<Integer> listaEstoque = new ArrayList();
	
	
	public Produtos(){ 
		String controle = "Sim";
		while (controle.equals("Sim")){
			System.out.println("= = = = Cadastro de Produtos = = = =");
			System.out.print("Digite o nome do produto: ");
			setNome(teclado.nextLine());
			listaNomes.add(nome);
			System.out.print("Digite o preço unitário do produto: ");
			setPreco(Double.parseDouble(teclado.nextLine()));
			listaPreco.add(preco);
			System.out.print("Digite o tipo do produto: ");
			setTipo(teclado.nextLine());
			listaTipo.add(tipo);
			System.out.print("Digite a quantidade no estoque: ");
			setEstoque(Integer.parseInt(teclado.nextLine()));
			listaEstoque.add(estoque);
			System.out.println("");
			System.out.printf("%d %s cadastrado com sucesso." ,estoque, nome);
			System.out.println("");
			System.out.print("Deseja cadastrar outro produto? ");
			controle = teclado.nextLine();
		}
			
	}
		
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		 this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		 this.preco = preco;
	}

	public String getTipo() {
		return tipo;
	}

	public void  setTipo(String tipo) {
		 this.tipo = tipo;
	}


	public int getEstoque() {
		return estoque;
	}


	public void setEstoque(int estoque) {
		 this.estoque = estoque;
	}
	
	public void vender(){
		String controle = "Sim";
		while (controle.equals("Sim")){
			System.out.println("= = = = Venda de Produtos = = = =");
			System.out.print("Digite o nome do produto: ");
			nome = teclado.nextLine();
			for(int i=0; i<listaNomes.size(); i++){
				if(listaNomes.get(i).equals(nome)){
					System.out.printf("==> %s (%s). R$%.2f", listaNomes.get(i),listaTipo.get(i),listaPreco.get(i));
					System.out.println("");
					System.out.print("Digite a quantidade que deseja vender: ​");
					int quantidade = Integer.parseInt(teclado.nextLine());
					if(listaEstoque.get(i)>= quantidade){
						System.out.printf("==> Total arrecadado: R$%.2f",listaPreco.get(i)*quantidade);
						listaEstoque.set(i,listaEstoque.get(i)-quantidade);
					}else{
						System.out.printf("Não é possível vender pois não há %s suficiente." , nome);
						System.out.println("");
					}
				}else{
					System.out.printf("==> %s nao cadastrada no sistema." , nome);
				}
			}
			System.out.print("Deseja vender outro produto? ");
			controle = teclado.nextLine();
		}
		
	}
}
