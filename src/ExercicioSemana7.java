
import java.util.Scanner;
public class ExercicioSemana7 {
    public static void main(String[] args) {
       Empregado primeiroEmpregado = new Empregado();
       Empregado segundoEmpregado = new Empregado();
       Scanner leitor = new Scanner(System.in);
       
       
       System.out.println("Digite o nome do primeiro empregado");
       primeiroEmpregado.setNome(leitor.next());
       System.out.println("Digite o sobrenome do primeiro empregado");
       primeiroEmpregado.setSobrenome(leitor.next());
       System.out.println("Digite o salário mensal do primeiro empregado");
       primeiroEmpregado.setSalario(leitor.nextFloat());
       
       System.out.println("Digite o nome do segundo empregado");
       segundoEmpregado.setNome(leitor.next());
       System.out.println("Digite o sobrenome do segundo empregado");
       segundoEmpregado.setSobrenome(leitor.next());
       System.out.println("Digite o salário mensal do segundo empregado");
       segundoEmpregado.setSalario(leitor.nextFloat());
       
       System.out.println();
       System.out.print("Nome Empregado: ");
       System.out.print(primeiroEmpregado.getNome());
       System.out.print(" ");
       System.out.println(primeiroEmpregado.getSobrenome());
       System.out.print("Salario Empregado: ");
       System.out.println(primeiroEmpregado.getSalario());
       System.out.println("Salário anual do primeiro empregado");
       System.out.println(primeiroEmpregado.getSalarioAnual(primeiroEmpregado.getSalario()));
       System.out.println("Salário anual do primeiro empregado com aumento de 10%");
       System.out.println(primeiroEmpregado.getNovoSalarioAnual(primeiroEmpregado.getSalario()));
       
       System.out.println();
       
       System.out.print("Nome Empregado: ");
       System.out.print(segundoEmpregado.getNome());
       System.out.print(" ");
       System.out.println(segundoEmpregado.getSobrenome());
       System.out.print("Salario Empregado: ");
       System.out.println(segundoEmpregado.getSalario());
       System.out.println("Salário anual do segundo empregado");
       System.out.println(segundoEmpregado.getSalarioAnual(primeiroEmpregado.getSalario()));
       System.out.println("Salário anual do segundo empregado com aumento de 10%");
       System.out.println(segundoEmpregado.getNovoSalarioAnual(segundoEmpregado.getSalario()));
               
    }
    
}
