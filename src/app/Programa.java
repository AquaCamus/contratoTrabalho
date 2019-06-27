package app;

import java.util.Date;
import java.util.Scanner;

import entidades.HoraContrato;

public class Programa {

	public static void main(String[] args) {
		String departamento;
		String nome;
		String nivel;
		Double salarioBase;
		int numContratos;
		HoraContrato contrato;
		Date data;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o nome do departamento: \n");
		departamento = scan.nextLine();
		
		
	}

}

/*Enter department's name: Design
Enter worker data:
Name: Alex
Level: MID_LEVEL
Base salary: 1200.00
How many contracts to this worker? 3
Enter contract #1 data:
Date (DD/MM/YYYY): 20/08/2018
Value per hour: 50.00
Duration (hours): 20
Enter contract #2 data:
Date (DD/MM/YYYY): 13/06/2018
Value per hour: 30.00
Duration (hours): 18
Enter contract #3 data:
Date (DD/MM/YYYY): 25/08/2018
Value per hour: 80.00
Duration (hours): 10*/
