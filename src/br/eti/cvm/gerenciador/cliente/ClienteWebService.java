package br.eti.cvm.gerenciador.cliente;

import org.apache.http.client.fluent.Request;

public class ClienteWebService {

	public static void main(String[] args) throws Exception {
		String conteudo = Request
			.Post("http://localhost:8080/gerenciador/empresas")
			.addHeader("Accept", "application/json")
			.execute()
			.returnContent()
			.asString();
		
		System.out.println("JSON:");
		System.out.println(conteudo);
		System.out.println();
		System.out.println();
		
		conteudo = Request
				.Post("http://localhost:8080/gerenciador/empresas")
				.addHeader("Accept", "application/xml")
				.execute()
				.returnContent()
				.asString();
		
		System.out.println("XML:");
		System.out.println(conteudo);
	}
	
}
