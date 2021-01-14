package kiss;

public class EmailIntegrationHandler extends IntegrationHandlerFactory {
    private static final String EMAIL = "abc";
    private final String emailHandler;

    public EmailIntegrationHandler(String emailHandler) {
        this.emailHandler = emailHandler;
    }

    @Override
    public String getHandlerFor(String integration) {
        if(EMAIL.equals(integration)){
            return emailHandler;
        }
        return "No handler found for integration: " + integration;
    }
}
