import org.cliente.Application;
import org.factories.GUIFactory;
import org.macOS.MacOSFactory;
import org.windows.WindowsFactory;

import java.util.concurrent.ThreadLocalRandom;

public class Test {
    public static void main(String[] args) {
        GUIFactory factory;

        int random = ThreadLocalRandom.current().nextInt(0, 2);

        String[] oses = {"windows", "macos"};
        String os = oses[random];

        if (os.contains("win")) {
            factory = new WindowsFactory();
        } else {
            factory = new MacOSFactory();
        }

        Application app = new Application(factory);
        app.renderUI();
    }
}
