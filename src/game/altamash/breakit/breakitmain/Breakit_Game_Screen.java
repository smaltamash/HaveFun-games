package game.altamash.breakit.breakitmain;
import game.altamash.breakit.breakitcontrol.Breakit_Game_State_Control;
import java.awt.*;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import game.altamash.breakit.breakitmain.Breakit_Game_Selection_Frame;

public class Breakit_Game_Screen extends JPanel implements Runnable,KeyListener
{
    public static final long serialVersionUID=1L;
    public static final int WIDTH=800;
    public static final int HEIGHT=600;
    private Thread thread;
    public static boolean playState=false;
    private Breakit_Game_State_Control bgsc;
    public static boolean returnBreakitGameFrame;
    public static int score;
    public static int ballSpeed;
    public Breakit_Game_Screen()
    {
        returnBreakitGameFrame=false;
        score=0;
        ballSpeed=0;
        setPreferredSize(new Dimension(WIDTH,HEIGHT));
        addKeyListener(this);
        setFocusable(true);
        start();
    }
    private void start()
    {
        playState=true;
        thread=new Thread(this);
        thread.start();
    }
    public void init()
    {
        bgsc=new Breakit_Game_State_Control();
    }
    public void run()
    {
        init();
        if(Breakit_Game_Selection_Frame.levelEasy)
        {
            ballSpeed=8;
        }
        if(Breakit_Game_Selection_Frame.levelMedium)
        {
            ballSpeed=6;
        }
        if(Breakit_Game_Selection_Frame.levelHard)
        {
            ballSpeed=4;
        }
        while(playState)
        {
            tick();
            repaint();
            try
            {
                Thread.sleep(ballSpeed);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
    public void tick()
    {
        bgsc.tick();
    }
    public void paint(Graphics g)
    {
        if(Breakit_Game_Selection_Frame.bgColorCoral)
        {
            g.setColor(new Color(255,127,80));
        }
        g.clearRect(0,0,WIDTH,HEIGHT);
        g.fillRect(0,0,WIDTH,HEIGHT);
        bgsc.draw(g);
    }
    public void keyPressed(KeyEvent e)
    {
        int k=e.getKeyCode();
        bgsc.keyPressed(k);
    }
    public void keyReleased(KeyEvent e)
    {
        int k=e.getKeyCode();
        bgsc.keyReleased(k);
    }
    public void keyTyped(KeyEvent e)
    {

    }
}
