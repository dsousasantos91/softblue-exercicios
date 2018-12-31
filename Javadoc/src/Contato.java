/**
 * Classe que representa um contato.
 * @author douglas-sousa
 * @version 1.0
 *
 */
public class Contato {
	
	
	/**
	 * Nome do contato.
	 */
	private String nome;
	
	/**
	 * E-mail do contato.
	 */
	private String email;
	
	/**
	 * Endereço do contato;
	 */
	private Endereco endereco = new Endereco();
	
	/**
	 * Construtor
	 * @param nome Nome do contato
	 * @param email E-mail do contato
	 */
	public Contato(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
	
	/**
	 * Defini o endereço do contato
	 * @param rua Rua do contato
	 * @param numero Numero do contato
	 */
	public void definirEndereco(String rua, int numero) {
		endereco.setRua(rua);
		endereco.setNumero(numero);
	}
	
	/**
	 * Retorna o nome.
	 * @return Nome do contato
	 */
	public String getNome() {
		return nome;
	}
	
	/**
	 * Retorna E-mail
	 * @return E-mail do contato.
	 */
	public String getEmail() {
		return email;
	}
}
