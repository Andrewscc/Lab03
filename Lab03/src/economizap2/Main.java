package economizap2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
			int op=0;
			while(op!=4){
				System.out.println("= = = = Bem-vindo(a) ao EconomizaP2 = = = =");
				System.out.println("Digite a op��o desejada:\n");
				System.out.println("1 - Cadastrar um Produto\n 2 - Vender um Produto\n 3 - Imprimir Balan�o\n 4 - Sair\n");
				System.out.println();
				System.out.println("Op��o:");
				op = Integer.parseInt(teclado.nextLine());
				switch(op){
					case 1: 
						Produtos novoCadastro = new Produtos();
						break;
					case 2: 
						vender();
						break;
					case 3:
						imprimir();
						break;
					default:
						break;
				}
			}
				
		}

}
