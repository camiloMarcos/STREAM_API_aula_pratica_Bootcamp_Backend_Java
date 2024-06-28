package Function;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
/*O exercício consiste em Criar uma List de números inteiros, em seguida iremos dobrar todos os elementos de dentro desta List */

public class ExemploFunction {

public static void main(String[] args) {

    //Criar uma List de números inteiros.
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

    //Usar o mét Function com expressão lambda para dobrar todos os numeros.
    Function<Integer, Integer> dobrar = numero -> numero*2;

    //Usar a função p dobrar tds os nº no Stream e armazená-los em outra List (List numerosDobrados). 
    List<Integer> numerosDobrados;
    numerosDobrados = numeros.stream()
            .map(dobrar)
            .collect(Collectors.toList()); // posso passar apenas o .toList.
            

    //O forEach recebe o consumer, q recebe um argumento de um T e não retorna nd.
    numerosDobrados.forEach(n->System.out.println(n));
    //ou replace lambda with method reference
    numerosDobrados.forEach(System.out::println);        
            
    
    
}

}

