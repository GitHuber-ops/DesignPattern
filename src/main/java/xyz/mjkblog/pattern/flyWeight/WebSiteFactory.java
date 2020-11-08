package xyz.mjkblog.pattern.flyWeight;

import java.util.HashMap;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--15--2:22 PM
 */
public class WebSiteFactory {
    private HashMap<String, ConcreteWebSite> pool =new HashMap<String, ConcreteWebSite>();

    public WebSite getWebSite(String type) {
        if (!pool.containsKey(type)) {
            pool.put(type,new ConcreteWebSite(type));
        }
        return pool.get(type);
    }
}
