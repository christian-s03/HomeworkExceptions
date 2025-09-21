public class DummyResource implements AutoCloseable {
    void work() {
        throw new RuntimeException("Primary");
    }

    @Override
    public void close() {
        throw new RuntimeException("Close");
    }
}
