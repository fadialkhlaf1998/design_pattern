package Structural.Proxy;

public class MTN implements InernetServiceProvider{
    @Override
    public String getSite(String url) {
        return url;
    }
}
