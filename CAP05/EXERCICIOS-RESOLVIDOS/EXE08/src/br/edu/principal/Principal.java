package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        int contador, alunosReprovados, alunosExame, alunosAprovados;
        
        
        float nota1, nota2, mediaAluno, mediaTurma, somaNotasTurma;
        
        
        somaNotasTurma = 0;
        alunosReprovados = 0;
        alunosExame = 0;
        alunosAprovados = 0;
        
        
        for (contador = 1; contador <= 6; contador++) {
            System.out.println("Digite as duas notas do " + contador + "º aluno:");
            nota1 = scanner.nextFloat();
            nota2 = scanner.nextFloat();
            
            
            mediaAluno = (nota1 + nota2) / 2;
            System.out.println("Média do " + contador + "º aluno = " + mediaAluno);
            
            
            if (mediaAluno <= 3) {
                alunosReprovados++;
                System.out.println("Reprovado");
            } else if (mediaAluno > 3 && mediaAluno < 7) {
                alunosExame++;
                System.out.println("Exame");
            } else {
                alunosAprovados++;
                System.out.println("Aprovado");
            }
            
            
            somaNotasTurma += mediaAluno;
        }
        
        
        System.out.println("Total de reprovados = " + alunosReprovados);
        System.out.println("Total de alunos em exame = " + alunosExame);
        System.out.println("Total de aprovados = " + alunosAprovados);
        
        
        mediaTurma = somaNotasTurma / 6;
        System.out.println("Média da turma = " + mediaTurma);
    }
}