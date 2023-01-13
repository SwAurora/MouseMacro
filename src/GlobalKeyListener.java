import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;

import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class GlobalKeyListener
{
    public void On()
    {
        LogManager.getLogManager().reset();
        Logger logger = Logger.getLogger(GlobalKeyListener.class.getPackageName());
        logger.setLevel(Level.OFF);

        try
        {
            GlobalScreen.registerNativeHook();
        }
        catch(NativeHookException e)
        {
            System.err.println("ERROR");
            System.exit(1);
        }
        GlobalScreen.addNativeKeyListener(new KeyHooker());
    }
}
