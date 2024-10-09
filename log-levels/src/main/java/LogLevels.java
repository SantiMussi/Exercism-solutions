public class LogLevels {
    
    public static String message(String logLine) {
        int start = logLine.indexOf(": ") + 2;
        return logLine.substring(start).trim();
    }

    public static String logLevel(String logLine) {
        int end = logLine.indexOf(": ");
        return logLine.substring(0, end).replaceAll("[\\[\\]]", "").toLowerCase();
    }

    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }
}
