package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contrato;
import model.entities.Prestacoes;
import services.PaypalService;
import services.ServicoContrato;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("ddd/MM/yyyy");
		
		System.out.println("Inserir dados do conmtrato:");
		System.out.print("Nuḿero: ");
		int numero = sc.nextInt();
		sc.nextLine();
		System.out.print("Date  (dd/MM/yyyy): ");
		Date date = sdf.parse(sc.nextLine());
		
		System.out.print("Valor do contrato:");
		double totalValor = sc.nextDouble();
		
		Contrato contrato = new Contrato(numero, date, totalValor);
		
		System.out.println("Digite o número de parcelas: "); 
		int n = sc.nextInt();
		
		ServicoContrato servicoContrato = new ServicoContrato(new PaypalService());
		
		servicoContrato.processarContrato(contrato, n);
		
		System.out.println("Parcelas");
		for(Prestacoes x : contrato.getPrestacoes()) {
			System.out.println(x);
		}
		
		sc.close();
	}

}
