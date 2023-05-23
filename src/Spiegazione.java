import java.nio.file.*;
import java.util.*;

public class Spiegazione {

    public static void main(String[] args) throws Exception{
        // gli stream possono essere utilizzati su varie sorgenti di dati comme array, insiemi e file
        List<Integer> numeri = Arrays.asList(10, -8, 14, 21, 17, -3, 4, 12);

        // il for each permette di definire una funzione da applicare ad ogni elemento dello stream
        //n è la chiave, dopo -> c'è quello che deve eseguire
        numeri.stream().forEach(n -> System.out.println(n));

        System.out.println("-----------------------");
        //il filter, filtra una lista
        numeri.stream().filter(n -> n > 0).forEach(n -> System.out.println(n));

        System.out.println("-----------------------");
        List<String> parole = Arrays.asList("ciao", "java developer", "develhope", "coding", "hardware", "programming");
        //il map permette di "mappare" ogni elemento dello stream con qualcosa
        List<Integer> lunghezza_parole = parole.stream().map(s-> s.length()).toList();
        System.out.println("Le lunghezze delle parole sono " + lunghezza_parole);

        System.out.println("-----------------------");
        //stampare la lunghezza delle parole che almeno 10 caratteri
        //System.out::println -> significa che gli sto passando direttamente il metodo prinln della classe System.out
        parole.stream().filter(s-> s.length() >= 10).map(s-> s.length()).forEach(System.out::println);

        System.out.println("-----------------------");
        //l'operazione terminale max() permette di ritornare il massimo valore in uno stream
        // con gli stream posso anche facilmente leggere dei file
        List<String> righe_file = Files.lines(Path.of("order.txt")).map(s-> s.toUpperCase()).toList();
        List<String> righe_file2 = Files.lines(Path.of("order.txt")).map(s-> s.replaceAll("[^A-z0-9\\s]", "").toUpperCase()).toList();
        System.out.println(righe_file);

        System.out.println("-----------------------");
        //ordinare una lista in ordine alfabetico
        List<String> parole_ordinate = parole.stream().sorted().toList();
        System.out.println(parole_ordinate);

        System.out.println("-----------------------");
        List<Integer> numeri_ordinati = numeri.stream().sorted().toList();
        System.out.println(numeri_ordinati);

    }
}