/*Classe Modelo (Model)
Representa os dados e a regra de negócio da aplicação.
Geralmente é uma classe que espelha uma tabela do banco de dados.
Só guarda informações e, às vezes, validações.
Em aplicações Spring, normalmente é uma classe anotada com @Entity.
 */

package br.com.api.pessoa.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity  //Indica que a classe é uma entidade JPA (Java Persistence API) e será mapeada para uma tabela no banco de dados. 'vai gerar uma tabela no banco de dados'
@Table(name="pessoa") //Especifica o nome da tabela no banco de dados que esta entidade irá mapear. Se não for especificado, o nome da tabela será o mesmo que o nome da classe.'vai definir o nome da tabela'
public class PessoaModelo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //Indica que o valor do campo será gerado automaticamente pelo banco de dados, geralmente usado para chaves primárias.'gera id para cada pessoa'
    private long codigo;
    private String nome;
    private int idade;
    private String cidade;



    
}
