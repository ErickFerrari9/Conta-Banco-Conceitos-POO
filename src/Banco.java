import lombok.Data;

import java.util.List;

@Data
public class Banco {

    public String nome;
    private List<Conta> contas;


}
