package br.com.api.pessoa.controle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController // especifica que essa classe é um controlador REST
public class PessoaControle {

    @GetMapping("/mensagem") // mapeia requisições GET para o método mensagem() 
    public String mensagem(){
        return "spring boot API pessoa";
    }

    @GetMapping("/apresentacao/{nome}") //trabalhar com variáveis de caminho 
    public String apresentaacao(@PathVariable String nome){
        return "Olá, eu sou " + nome + "!";
    }
}   
