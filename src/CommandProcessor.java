final class CommandProcessor {
    static void processCommand(String cmd) {
        if ("ARG".equals(cmd)) {
            throw new IllegalArgumentException("Bad arg");
        } else if ("STATE".equals(cmd)) {
            throw new IllegalStateException("Bad state");
        } else {
            System.out.println(cmd);
        }
    }

    static void demo(){
        String[] commands = { "ARG", "STATE", "OK" };

        for(String cmd : commands) {
            try {
                processCommand(cmd);
            } catch (IllegalArgumentException | IllegalStateException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        demo();
    }
}
