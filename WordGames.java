package co.develhope.introduction._19;

/**
 * La classe WordGames ah 2 metodi
 * metodo addHelloWorld e il metodo getFullName
 *
 *
 * @author Nicolo' Ferri
 */
public class WordGames {
    /**
     * il metodo addHelloWord
     *prende in input un parametro chiamato word
     * e stampa il seguente messaggio : "Hello [word]"
     *
     * @param word
     * @return stampa il parametro word preceduto da Hello
     */
    public void addHelloWorld (String word){
        System.out.println("Hello [" +word +"]" );
    }

    /**
     * il metodo getFullName prende in input 2 parametri
     * e li concatena in successione
     *
     * @param name
     * @param surname
     * @return concatenazione dei parametri di input
     */
    public String getFullName (String name , String surname){
        return name+" "+surname;
    }

}
