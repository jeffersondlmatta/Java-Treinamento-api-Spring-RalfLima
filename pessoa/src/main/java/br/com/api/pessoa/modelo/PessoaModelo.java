/*Classe Modelo (Model)
Representa os dados e a regra de negócio da aplicação.
Geralmente é uma classe que espelha uma tabela do banco de dados.
Só guarda informações e, às vezes, validações.
Em aplicações Spring, normalmente é uma classe anotada com @Entity.
 */

package br.com.api.pessoa.modelo;

public class PessoaModelo {
    private long codigo;
    private String nome;
    private int idade;
    private String cidade;



    public long getCodigo() {
        return codigo;
    }
    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
