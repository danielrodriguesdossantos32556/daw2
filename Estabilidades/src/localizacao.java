import java.util.ArrayList;

public class localizacao extends Bairros {

	public localizacao(int id_bairro, String nome_bairro, ArrayList<Estabilidade> estavel, ArrayList<Ruas> ruas) {
		super(id_bairro, nome_bairro, estavel, ruas);
		this.getId_bairro(); 
	}

}
