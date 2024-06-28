package Supllier;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*  O objetivo do exercício abaixo é criar uma lista com cinco saudações e em seguida imprimie essas saudações geradas */

public class ExemploSupllier {
    
    public static void main(String[] args) {

        //  Usar supllier com expressão lambda p fornecer uma saudação personalizada.
        Supplier<String> saudacao = () -> "Olá, parabéns por passar mais uma madrugada ESTUDANDO JAVA!";

        //  Usar Supllier para Criar uma lista com 5 saudações
        // obs. o mét. generete recebe o mét. Supllier, (saudacao), que é o Supllier criado acima.
        //obs. o mét. limit, passamos um long p indicar a qtde de vezes que queremos imprimir.
        // obs. agora vamos listar cada uma dessas saudações criadas com o collector, ajuda transf num list.
        List<String> listaSaudacao = Stream.generate(saudacao)
            .limit(5)
            .collect(Collectors.toList());

        //  Imprimir as saudações geradas.
        listaSaudacao.forEach(System.out::println);

    }

}
