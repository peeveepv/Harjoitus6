package fi.academy.harjoitukset.Viikko1.tiistai;

/**
 * Created by Administrator on 27.9.2017.
 */
public class LaitonIkaException extends RuntimeException { // RuntimeExceptionin avulla mainiin ei vaadittu throws exceptionia

    public LaitonIkaException(String message) {

    super(message);

    }
}