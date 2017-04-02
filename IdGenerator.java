import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Guillaume Gingembre on 02/04/2017.
 */
public final class IdGenerator {

        /* a util class:
    takes no variable;
    cannot be inherited from, so is final;
    we cannot create it, so it has a private constructor;
    contains only static methods;
     */

    private static long idCounter = 0;

    public static synchronized long createID()
    {
        return idCounter++;
    }

}
