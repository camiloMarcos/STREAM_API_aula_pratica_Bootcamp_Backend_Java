package Consumer;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ExemploConsumer2 {

    public static void main(String[] args) {

//Criar uma List de numeros inteiros.
    List<Integer> numeros = Arrays.asList(1,2,3,4,5);

// Usar Consumer com expressão lambda para imprimir números pares.
    Consumer<Integer> imprimirNumeroPar = numero ->{
        if(numero % 2 == 0){
            System.out.println(numero);
        }
    };

// Usar Consumer p imprimir numeros pares no Stream.
    numeros.forEach( n-> {
        if(n % 2 == 0){
            System.out.println(n);
        }
    }
    );
}

}
