import org.cliente.Application;
import org.factories.GUIFactory;
import org.linux.LinuxFactory;
import org.macOS.MacOSFactory;
import org.windows.WindowsFactory;

import java.util.concurrent.ThreadLocalRandom;

public class Test {
    public static void main(String[] args) {
        GUIFactory factory;

        int random = ThreadLocalRandom.current().nextInt(0, 3);

        String[] oses = {"windows", "macos", "linux"};
        String os = oses[random];

        if (os.contains("win")) {
            factory = new WindowsFactory();
        } else if (os.contains("mac")){
            factory = new MacOSFactory();
        } else {
            factory = new LinuxFactory();
        }

        Application app = new Application(factory);
        app.renderUI();
    }
}
