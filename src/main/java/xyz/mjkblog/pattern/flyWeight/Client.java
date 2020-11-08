package xyz.mjkblog.pattern.flyWeight;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--15--2:32 PM
 */
public class Client {
    public static void main(String[] args) {
        WebSiteFactory webSiteFactory = new WebSiteFactory();

        WebSite news = webSiteFactory.getWebSite("news");
    }
}
