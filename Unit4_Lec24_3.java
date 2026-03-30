class TestRunnable {
    public static void main(String[] args) {

        // Lambda expression for Runnable
        Runnable r = () -> System.out.println("Hello Lambda!");

        // Run thread
        Thread t = new Thread(r);
        t.start();
    }
}
