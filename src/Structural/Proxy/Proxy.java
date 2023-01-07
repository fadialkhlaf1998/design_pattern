package Structural.Proxy;

import java.util.Arrays;
import java.util.List;

public class Proxy implements InernetServiceProvider{
    List<String> blockedSites = Arrays.asList("youtube","facebook","twitter");
    @Override
    public String getSite(String url) {
        if(blockedSites.contains(url)){
            return "This Site Is Blocked";
        }
        return new MTN().getSite(url);
    }
}
