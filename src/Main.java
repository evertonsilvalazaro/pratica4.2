import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		double res1,res2,res3,res4;
		int pessoasCanal4=0,pessoasCanal5=0,pessoasCanal7=0,pessoasCanal12=0;
		int totaldepessoas = 0;
		int canal=1;
		while(canal!=0){
			
			System.out.println("informe o canal");
			canal=sc.nextInt();
			switch (canal) {
			
				case 4:
					System.out.println("Informe a quantidade de pessoas assistindo este canal");
					pessoasCanal4+=sc.nextInt();
					
					break;
					
				case 5:
					System.out.println("Informe a quantidade de pessoas assistindo este canal");
					pessoasCanal5+=sc.nextInt();
					
					break;
				
				case 7:
					System.out.println("Informe a quantidade de pessoas assistindo este canal");
					pessoasCanal7+=sc.nextInt();
					
					break;
				
				case 12:
					System.out.println("Informe a quantidade de pessoas assistindo este canal");
					pessoasCanal12+=sc.nextInt();
					
					break;
					
					default:
						System.out.println("canal invalido");
											
			}	

					
		}
		
		totaldepessoas = pessoasCanal4 + pessoasCanal5 + pessoasCanal7 + pessoasCanal12;
		res1=(double)pessoasCanal4/(totaldepessoas)*100; 
		res2=(double)pessoasCanal5/(totaldepessoas)*100;
		res3=(double)pessoasCanal7/(totaldepessoas)*100;
		res4=(double)pessoasCanal12/(totaldepessoas)*100;
		
			System.out.println("A porcentagem de pessoas assistindo o canal 4 é "+res1);
			System.out.println("A porcentagem de pessoas assistindo o canal 5 é "+res2);
			System.out.println("A porcentagem de pessoas assistindo o canal 7 é "+res3);
			System.out.println("A porcentagem de pessoas assistindo o canal 12 é "+res4);	
				
		
	
			
		sc.close();
	}

}
