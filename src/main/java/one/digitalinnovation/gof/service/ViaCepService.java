/***********************************************************************************
 * Projeto.: Ganhando Produtividade com Spring Framework
 *           Explorando Padrões de Projetos na Prática com Java
 * 
 * Finalidade: Solução que explora o conceito de Padrões de Projeto na prática. 
 * Para isso, reproduzi neste projetos, continuação do que criamos durante as aulas.
 * ---------------------------------------------------------------------------------
 * Módulo..: service -> impl -> ViaCepService.java
 *           
 * Client HTTP, criado via <b>OpenFeign</b>, para o consumo da API do <b>ViaCEP</b>.
 * 
 * @see <a href="https://spring.io/projects/spring-cloud-openfeign">Spring Cloud OpenFeign</a>
 * @see <a href="https://viacep.com.br">ViaCEP</a>
 * 
 *
 * Author....: Macedo, Glener Diniz 
 * Orientador: Venilton Falvo Jr - Tech Lead, DIO : DIGITAL INNOVATION ONE.
 * *Data.....: 13 de março de 2023 
 ***********************************************************************************/

 package one.digitalinnovation.gof.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import one.digitalinnovation.gof.model.Endereco;

/**
 */
@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface ViaCepService {

	@GetMapping("/{cep}/json/")
	Endereco consultarCep(@PathVariable("cep") String cep);
}
