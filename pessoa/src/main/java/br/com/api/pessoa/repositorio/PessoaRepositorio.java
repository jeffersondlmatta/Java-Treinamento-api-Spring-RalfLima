package br.com.api.pessoa.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.api.pessoa.modelo.PessoaModelo;

@Repository
public interface PessoaRepositorio extends CrudRepository<PessoaModelo, Long>{
    //CrudRepository é uma interface do Spring Data JPA que fornece métodos CRUD (Create, Read, Update, Delete) básicos para manipulação de entidades no banco de dados.
    //PessoaModelo é a entidade que esta interface irá gerenciar.
    //Long é o tipo do identificador único (ID) da entidade PessoaModelo.
    

}
