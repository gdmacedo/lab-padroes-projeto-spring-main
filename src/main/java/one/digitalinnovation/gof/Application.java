/***********************************************************************************
 * Projeto.: Ganhando Produtividade com Spring Framework
 *           Explorando Padrões de Projetos na Prática com Java
 * 
 * Finalidade: Solução que explora o conceito de Padrões de Projeto na prática. 
 * Para isso, reproduzi neste projetos, continuação do que criamos durante as aulas.
 * ---------------------------------------------------------------------------------
 * Módulo..: service -> Application.java
 *           
 * Projeto Spring Boot gerado via Spring Initializr.
 * Os seguintes módulos foram selecionados:
 * - Spring Data JPA
 * - Spring Web
 * - H2 Database
 * - OpenFeign
 * 
 * Author....: Macedo, Glener Diniz 
 * Orientador: Venilton Falvo Jr - Tech Lead, DIO : DIGITAL INNOVATION ONE.
 * *Data.....: 13 de março de 2023 
 ***********************************************************************************/

 package one.digitalinnovation.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients // Inclusão para habilitar o client do Feing e saber que o nosso projeto via usar o Feing.
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
