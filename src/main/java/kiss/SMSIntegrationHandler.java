package kiss;

public class SMSIntegrationHandler extends IntegrationHandlerFactory {
    private static final String SMS = "dce";
    private String smsHandler;

    @Override
    public String getHandlerFor(String integration) {
        if(SMS.equals(integration)){
            return smsHandler;
        }
        return "No handler found for integration: " + integration;
    }
}
