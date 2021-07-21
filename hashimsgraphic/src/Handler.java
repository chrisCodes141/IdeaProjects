import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Handler implements KeyListener
{
    public boolean wPressed, aPressed, sPressed, dPressed;

    @Override
    public void keyTyped(KeyEvent e)
    {

    }

    @Override
    public void keyPressed(KeyEvent e)
    {
        enable(e.getKeyCode(), true);
    }

    @Override
    public void keyReleased(KeyEvent e)
    {
        enable(e.getKeyCode(), false);
    }

    private void enable(int keyCode, boolean b)
    {
        if(keyCode == KeyEvent.VK_W)
        {
            wPressed = b;
        }
        if(keyCode == KeyEvent.VK_A)
        {
            aPressed = b;
        }
        if(keyCode == KeyEvent.VK_S)
        {
            sPressed = b;
        }
        if(keyCode == KeyEvent.VK_D)
        {
            dPressed = b;
        }
    }
}
