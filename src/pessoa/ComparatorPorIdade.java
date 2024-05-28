package pessoa;
import java.util.Comparator;

public class ComparatorPorIdade implements Comparator<Pessoa>{

    @Override
    public int compare(Pessoa arg0, Pessoa arg1) {
        // TODO Auto-generated method stub
        return  Integer.compare(arg0.getIdade(), arg1.getIdade());
        
    }

}
