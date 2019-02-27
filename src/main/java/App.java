public class App {
    private Client client;
    private ConsoleEventLogger eventLogger;

    public App(Client client, ConsoleEventLogger eventLogger) {
        this.client = client;
        this.eventLogger = eventLogger;
    }

    public static void main(String[] args) {


        // App app = new App();
        // app.client = new Client("1", "Oksana Abramova");
       // app.eventLogger = new ConsoleEventLogger();

       // app.logEvent("Some event for user 1");

    }

    public void logEvent(String msg) {
        String message = msg.replaceAll(client.getId(), client.getFullName());

        eventLogger.logEvent(message);
    }
}
