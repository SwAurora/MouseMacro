import java.awt.*;
import java.awt.event.InputEvent;

public class Macro extends Thread
{
    boolean flag = true;

    @Override
    public void run()
    {
        try
        {
            Robot robot = new Robot();
            while(flag)
            {
                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                robot.delay(10);
            }
        }
        catch(AWTException e)
        {
            System.err.println("ERROR");
            System.exit(1);
        }
    }

    public void Stop()
    {
        this.flag = false;
    }
}
