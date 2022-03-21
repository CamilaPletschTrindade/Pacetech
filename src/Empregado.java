
public class Empregado {
    private String nome, sobrenome;
    private float salario;
    private float novoSalario;
    
    public Empregado(String nome, String sobrenome, float salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
    }

    public Empregado() {
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public float getSalario() {
        if (salario < 0){
            salario = 0.0f;
        }
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
     public float getSalarioAnual(float salario){
        return novoSalario = salario * 12;
    }
    public float getNovoSalarioAnual(float salario){
        return novoSalario = salario * 1.1f * 12;
    }
}
