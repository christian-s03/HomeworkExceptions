class InvalidNumberException extends RuntimeException {
    public InvalidNumberException(String msg, Throwable cause) {
        super(msg, cause);
    }
}

final class NumberParser {
    private NumberParser() {
    }

    static int parsePositiveInt(String s) {
        int value;
        try {
            value = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            throw new InvalidNumberException("Invalid number: '" + s + "'", e);
        }
        if (value <= 0) {
            throw new IllegalArgumentException("Not positive: " + value);
        }
        return value;
    }

    public static void main(String[] args) {
        test("1");
        test("0");
        test("-1");
        test("abc");
    }

        private static void test (String s){
            try {
                int val = parsePositiveInt(s);
                System.out.println(" " + s + " -> " + val);
            } catch (Exception e) {
                System.out.println("Fail (" + s + "): " + e);
                if (e.getCause() != null) {
                    System.out.println("Cause: " + e.getCause());
                }
            }
        }
    }

