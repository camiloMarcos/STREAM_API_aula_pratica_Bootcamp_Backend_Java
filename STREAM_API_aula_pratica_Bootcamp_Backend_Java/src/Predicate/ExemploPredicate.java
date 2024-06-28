package Predicate;
/*O desafio é filtrar e pegar, dentro da Lista de nomes, apenas as palavras que tem mais de cinco letras... UTILIZANDO O RECURSO STREAM */


import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ExemploPredicate {

    public static void main(String[] args) {
        
        //Criar Lista de palavras.
        List<String> palavras = Arrays.asList("Camilo", "Teresa", "Josyane", "rafa", "Juli", "Tito", "Emy", "Niço");

        //Criar Predicate que verifica se a palavra tem mais de 5 caracteres.
        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length()>5;

        //Usar Stream para filtrar as palavras com mais de 5 caracteres e, posteriormente, imprimir cada palavra que passou pelo filtro.

        palavras.stream()
        .filter(maisDeCincoCaracteres)
        .filter(P -> P.length()>5) // PODE SER USADO DESSA FORMA TB.
        .forEach(System.out::println);
            

    }

}
