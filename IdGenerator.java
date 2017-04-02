import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Guillaume Gingembre on 02/04/2017.
 */
public class IdGenerator {

    private static long idCounter = 0;

    public static synchronized String createID()
    {
        return String.valueOf(idCounter++);
    }

}
