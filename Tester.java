package co.develhope.introduction._19;

/**
 * La classe Tester contiene il metodo main
 * che esegue i metodi della classe WordGamed
 *
 *
 * @author Nicolo' Ferri
 */
public class Tester {
    /**
     * il metodo main ha la funzione di stamapare i metodi
     * della classe WordGames
     *
     * @param args
     */
    public static void main(String[] args) {
        WordGames wordGames = new WordGames();

        wordGames.addHelloWorld("John");

        System.out.println(wordGames.getFullName("Antonio", "Esposito"));
    }
}
