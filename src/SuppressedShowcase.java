public class SuppressedShowcase {
    static void run() {
        try (DummyResource r = new DummyResource()) {
            r.work();
        } catch (RuntimeException e) {
            System.out.println("Caught: " + e.getMessage());
            Throwable[] suppressed = e.getSuppressed();
            System.out.println("Suppressed: ");
            for (Throwable t : suppressed) {
                System.out.println(" " + t);
            }
        }
    }

    public static void main(String[] args) {
        SuppressedShowcase.run();
    }
}
