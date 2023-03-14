/***********************************************************************************
 * Projeto.: Ganhando Produtividade com Spring Framework
 *           Explorando Padrões de Projetos na Prática com Java
 * 
 * Finalidade: Solução que explora o conceito de Padrões de Projeto na prática. 
 * Para isso, reproduzi neste projetos, continuação do que criamos durante as aulas.
 * ---------------------------------------------------------------------------------
 * Módulo..: model -> ClienteRepository.java
 *           
 * Author....: Macedo, Glener Diniz 
 * Orientador: Venilton Falvo Jr - Tech Lead, DIO : DIGITAL INNOVATION ONE.
 * *Data.....: 13 de março de 2023 
 ***********************************************************************************/

package one.digitalinnovation.gof.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}