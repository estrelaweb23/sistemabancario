package negocio;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class GerenciadoraClientesTest_Ex1 {

	@Test
	public void testPesquisaCliente() {
  
		/* Montagem do cenário */

		// criando alguns clientes
		
	Cliente cliente01 = new Cliente(1, "Gustavo Farias", 31, "gugafarias@gmail.com", 1, true);
	Cliente cliente02 = new Cliente(2, "Felipe Augusto", 34, "felipeaugusto@gmail.com", 2, true);
	Cliente cliente03 = new Cliente(3,"Aline Santana",33,"alinesantanaweb@hotmail.com",3,true);
	Cliente cliente04 = new Cliente(4,"Daniele Nobre",36,"danielenobre@gmail.com",4,true);
		
	//inserindo alguns clientes criados na lista do banco
	
	List<Cliente> clientesDoBanco = new ArrayList<>();
	clientesDoBanco.add(cliente01);
	clientesDoBanco.add(cliente02);
	clientesDoBanco.add(cliente03);
	clientesDoBanco.add(cliente04);
	
	
	//Criando uma gerenciadora de cientes passando a lista de clientes criada
	
	GerenciadoraClientes gerClientes = new GerenciadoraClientes(clientesDoBanco);
	
	/* Execução */
	//Pesquisa de Cliente - Teste do método pesquisa cliente
	
	Cliente cliente = gerClientes.pesquisaCliente(1);
	
	/* Verificação */
	assertThat(cliente.getId(), is(1));
	assertThat(cliente.getEmail(), is("gugafarias@gmail.com"));
	
	}

}
