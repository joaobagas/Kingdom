package Log;

public class Log {
    private static Log log;

    private Log() {}

    public static Log get() {
        if (log == null) { log = new Log(); }
        return log;
    }

    public void print(String s) { System.out.println(s); }
}
