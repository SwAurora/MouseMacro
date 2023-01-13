import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;

public class KeyHooker implements NativeKeyListener
{
    Macro macro = new Macro();
    
    @Override
    public void nativeKeyTyped(NativeKeyEvent nativeKeyEvent)
    {

    }

    @Override
    public void nativeKeyPressed(NativeKeyEvent nativeKeyEvent)
    {
        if(nativeKeyEvent.getKeyCode() == 2)
        {
            if(macro.isAlive())
            {
                System.out.println("macro Off");
                macro.Stop();
                macro = new Macro();
            }
            else
            {
                System.out.println("macro On");
                macro.start();
            }

        }
        if(nativeKeyEvent.getKeyCode() == 3)
        {
            System.out.println("Program Off");
            System.exit(0);
        }
    }

    @Override
    public void nativeKeyReleased(NativeKeyEvent nativeKeyEvent)
    {

    }
}
