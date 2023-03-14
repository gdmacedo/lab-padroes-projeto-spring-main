/***********************************************************************************
 * Projeto.: Ganhando Produtividade com Spring Framework
 *           Explorando Padrões de Projetos na Prática com Java
 * 
 * Finalidade: Solução que explora o conceito de Padrões de Projeto na prática. 
 * Para isso, reproduzi neste projetos, continuação do que criamos durante as aulas.
 * ---------------------------------------------------------------------------------
 * Módulo..: service -> impl -> ClienteService.java
 *           
 * Interface que define o padrão <b>Strategy</b> no domínio de cliente. Com
 * isso, se necessário, podemos ter multiplas implementações dessa mesma
 * interface.
 *
 * Author....: Macedo, Glener Diniz 
 * Orientador: Venilton Falvo Jr - Tech Lead, DIO : DIGITAL INNOVATION ONE.
 * *Data.....: 13 de março de 2023 
 ***********************************************************************************/

package one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.model.Cliente;

public interface ClienteService {

	Iterable<Cliente> buscarTodos();

	Cliente buscarPorId(Long id);

	void inserir(Cliente cliente);

	void atualizar(Long id, Cliente cliente);

	void deletar(Long id);

}
