package kiss;

public class PushIntegrationHandler extends IntegrationHandlerFactory {
    private static final String PUSH = "glk";
    private String pushHandler;

    @Override
    public String getHandlerFor(String integration) {
        if(PUSH.equals(integration)){
            return pushHandler;
        }
        return "No handler found for integration: " + integration;
    }
}
