package pessoa;

public class Pessoa implements Comparable{
    private String nome;
    private int idade;
    private float altura;

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade() {
        return  this.idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public float getAltura() {
        return altura;
    }
    public Pessoa(String nome, int idade, float altura){
        setIdade(idade);
        setNome(nome);
        setAltura(idade);
    }

    @Override
    public String toString() {
        
            return "a pessoa "+getNome()+ " tem " +this.getIdade() + " anos de idade e " +this.getAltura() + "m de altura";
        }
    @Override
    public int compareTo(Object o) {
        
       
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }
    
}
