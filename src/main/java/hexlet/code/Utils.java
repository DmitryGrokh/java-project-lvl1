package hexlet.code;

public class Utils {
    public static final int LOWER_RANGE_LIMIT = 0;
    public static final int UPPER_RANGE_LIMIT = 100;


    public static int generateRandom(int lowerRangeLimit, int upperRangeLimit) {
        return (int) ((Math.random() * upperRangeLimit) + lowerRangeLimit);
    }

}
