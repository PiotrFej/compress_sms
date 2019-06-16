import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        String text = "Program ma za zadanie przyjac ciag slow, czyli dowolny tekst i skompresowac go, aby mozna bylo wyslac w okreslonej liczbie wiadomosci SMS oraz ma obliczyc koszt wyslania takich wiadomosci.";

        NaivCompressor nc = new NaivCompressor();
        Paginator p = new Paginator();
        Calculator c = new Calculator();

        String compressedText = nc.compress(text);

        int smsAmount = p.paginate(compressedText).length;

        BigDecimal price = c.calculate(smsAmount);

        System.out.println(compressedText);
        System.out.println(smsAmount);
        System.out.println(price);






    }
}
