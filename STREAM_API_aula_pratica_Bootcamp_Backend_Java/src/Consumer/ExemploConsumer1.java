package Consumer;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


/*Representa uma operação que aceita um argumento do tipo T e não retorna nenhum resultado. É utilizada principalmente para REALIZAR AÇÕES, EFEITOS COLATERAIS nos elementos do Stream sem modificar, ou retornar um valor.
*/



public class ExemploConsumer1 {

//  Criamos o Método main
        public static void main(String[] args) {

//  Dentro no método main Criamos um List, através do Arrays (já passando uma lista com cinco números)
//  trabalhamos com a lista de números pois fica facil de visualizar e entender, mas poderia ser      qualquer tipo, List de qualquer tipo.

        List<Integer> numeros = Arrays.asList(1,2,3,4,5);            

//  Atravéz da List de números inteiros que criamos, queremos agora imprimir em tela apenas os números pares.

//  Usar o Consumer com expressão lambda para imprimir nº pares
        Consumer<Integer> imprimirNumerosPar = numero ->{
            if (numero % 2 == 0){
                System.out.println(numero);
            }
        };
        numeros.stream().forEach(imprimirNumerosPar);

        }




}
