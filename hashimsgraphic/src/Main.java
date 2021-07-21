import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Point2D;

public class Main extends JPanel implements ActionListener
{
    private final Handler handler;
    private final Timer timer;
    private long last;
    private Point2D.Double p;

    private Main()
    {
        super(false);
        setBackground(Color.BLACK);

        timer = new Timer(-1, this);
        last = System.nanoTime();

        handler = new Handler();
        p = new Point2D.Double(400, 300);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        long time = System.nanoTime();
        double delta = (time - last) / 1E9D;
        last = time;
        update(delta);
        System.out.println(delta + ", " + (1 / delta));
        repaint();
    }

    private void update(double delta)
    {
        double mx = 0, my = 0;

        if(handler.wPressed)
        {
            my--;
        }
        if(handler.aPressed)
        {
            mx--;
        }
        if(handler.sPressed)
        {
            my++;
        }
        if(handler.dPressed)
        {
            mx++;
        }

        p.x += mx * 1;
        p.y += my * 1;
    }

    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(Color.WHITE);
        g2d.drawOval((int) (p.x - 5), (int) (p.y - 5), 10, 10);
    }

    @Override
    public Dimension getPreferredSize()
    {
        return new Dimension(800, 600);
    }

    @Override
    public Dimension getMinimumSize()
    {
        return getPreferredSize();
    }

    @Override
    public Dimension getMaximumSize()
    {
        return getPreferredSize();
    }

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Asteroids");

        Main main = new Main();
        frame.add(main);

        frame.setResizable(false);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.addKeyListener(main.handler);

        main.timer.start();
    }
}
