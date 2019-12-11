package entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;


@Entity
public class Comentarios implements Identificavel {
	@Id
	@GeneratedValue
	private Long id;

	@Column(name = "nome_nome")
	private String nome;
	
	@OneToMany
	@JoinTable(name = "comentarios_denuncia", joinColumns = @JoinColumn(name = "id_comentarios"), inverseJoinColumns = @JoinColumn(name = "id_comentarios"))
	private Set<Comentarios> denuncias;

	public Long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Comentarios other = (Comentarios) obj;
		if (id != other.id)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Comentarios [id=" + id + ", string=" + nome + "]";
	}

	@Override
	public void setId(Long id) {
		// TODO Auto-generated method stub

	}

}
