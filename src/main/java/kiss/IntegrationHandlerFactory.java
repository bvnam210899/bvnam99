package kiss;

public abstract class IntegrationHandlerFactory implements IntegrationHandler {
    @Override
    public abstract String getHandlerFor(String integration);
}