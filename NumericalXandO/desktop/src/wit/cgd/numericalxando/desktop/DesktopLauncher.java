package wit.cgd.numericalxando.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.badlogic.gdx.tools.texturepacker.TexturePacker;
import com.badlogic.gdx.tools.texturepacker.TexturePacker.Settings;

import wit.cgd.numericalxando.NumericalXandOMain;

public class DesktopLauncher {
    private static boolean  rebuildAtlas        = true;
    private static boolean  drawDebugOutline    = true;

    public static void main (String[] arg) {
        
        if (rebuildAtlas) {
            Settings settings = new Settings();
            settings.maxWidth = 1024;
            settings.maxHeight = 1024;
            settings.debug = drawDebugOutline;
            TexturePacker.process(settings, "assets-raw/images", "../android/assets/images",
                    "xando.atlas");
            TexturePacker.process(settings, "assets-raw/images-ui", "../android/assets/images",
                    "ui.atlas");
        }

        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.title = "XandO";
        config.width = 800;
        config.height = 480;
        new LwjglApplication(new NumericalXandOMain(), config);
    }
}
