import java.util.Scanner;

import services.LoginService;
public class Program {
	
		public static void main(String[] args){
			
			Scanner sc = new Scanner (System.in);
			Boolean repetir = true;
			do {
				System.out.println("Digite uma das opções abaixo");
				System.out.println("0- Sair");
				System.out.println("1 - Modificar Login");
				int opcao = sc.nextInt();
				LoginService loginService = new LoginService();
				switch (opcao) {
				case 0 :
					repetir = false;
					break;
				case 1 :
					loginService.save();
					break;
				default :
					System.out.println("Opção não encontrada");
					break;
				}
			}while(repetir);

			}			
	}

