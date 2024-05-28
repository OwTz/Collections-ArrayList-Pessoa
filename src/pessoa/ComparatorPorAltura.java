package pessoa;

import java.util.Comparator;

public class ComparatorPorAltura implements Comparator<Pessoa>{

    @Override
    public int compare(Pessoa arg0, Pessoa arg1) {
        /*  converter de Double para int */ 
        return Float.compare(arg0.getAltura(), arg1.getAltura());
    }


    

}
