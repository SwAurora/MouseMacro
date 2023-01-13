import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class Application extends JFrame
{
    public Application()
    {
        GUI();
    }

    public static void main(String[] args)
    {
        new Application();
        GlobalKeyListener keyListener = new GlobalKeyListener();
        keyListener.On();
    }

    private void GUI()
    {
        setTitle("MouseMacro");
        setSize(280, 90);
        setAlwaysOnTop(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Image image = new ImageIcon(Objects.requireNonNull(Application.class.getResource("icon.png"))).getImage();
        setIconImage(image);
        getContentPane().setLayout(null);
        Label label = new Label("Press '1' - START / END");
        label.setBounds(65,10,150,10);
        Label label2 = new Label("Press '2' - QUIT");
        label2.setBounds(65,30,150,10);
        add(label);
        add(label2);
        setVisible(true);
    }
}
