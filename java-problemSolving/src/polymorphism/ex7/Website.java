package polymorphism.ex7;

public class Website {
    public static void main(String[] args) {
        Plugin[] plugins = {new ThemePlugin(), new SEOPlugin(), new SocialMediaPlugin()};
        printStatus(plugins);
    }

    public static void printStatus(Plugin[] plugins) {
        for (Plugin plugin : plugins) {
            plugin.activate();
            plugin.deactivate();
        }
    }
}
