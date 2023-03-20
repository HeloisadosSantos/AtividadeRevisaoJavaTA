package AtividadeRevisao1;

import java.util.Scanner;

import javax.print.attribute.standard.Media;

public class ExemplosRevisao {
    Scanner sc = new Scanner(System.in);

    public void name() {
        System.out.println("Informe a primeira nota do Aluno");
        int nota1 = sc.nextInt();

        // Ler a segunda nota
        System.out.println("Informe a segunda nota do Aluno");
        int nota2 = sc.nextInt();

        // Calcular a média das notas
        double media = (nota1+nota2)/2 ;

        // mostrar media calculada
        System.out.println(" A media do Aluno é " +media );

        // informar o total de aulas
        System.out.println("Professor,informe o total de aulas dadas");
        int aulasDadas = sc.nextInt();

        // informe a quantidade de faltas do aluno
        System.out.println("Professor,informe n° de faltas do aluno");
        int nfaltas = sc.nextInt();

        // calcular a % de frequência
        double frequência = ((aulasDadas-nfaltas/aulasDadas)*100);

        // mostrar a % de frequência do aluno
        System.out.println("O aluno teve " +frequência+"%");

        // se a (media>=50 e frequência>=75)
        if (media>=50 && frequência>=75) {
            System.out.println("Aprovado");
        } else if(media<50 && frequência>=75){
            System.out.println("Recuperação");
        }else{
            System.out.println("Reprovado");
        }
    }
}
