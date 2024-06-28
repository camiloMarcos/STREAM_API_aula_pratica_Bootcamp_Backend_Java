package Binary;

/*O desafio consiste em: Criar uma lista com números inteiros, em seguida, mostrar o resultado da soma DE TODOS OS ELEMENTOS dessa Lista  */

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class ExemploBinary {

    public static void main(String[] args) {
        
        //Criar Lista de nº inteiros.
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        //Usar o BinaryOperator c expressão lambda para somar os nº inteiros.
        BinaryOperator<Integer> soma = (num1, num2) -> num1 + num2;

        //Usar o BinaryOperator p somar TODOS os nº inteiros.
        int resultado = numeros.stream()
        .reduce(0, soma);
        
        
        System.out.println("A soma dos números é: " + resultado);
        
    }

}
