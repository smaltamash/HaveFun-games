package game.altamash.breakit.breakititems;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
public class Breakit_Game_Blocks extends Rectangle
{
    private int colorChange;
    public int blockWidth=55;
    public int blockHeight=15;
    public Breakit_Game_Blocks(int x, int y, int colorChange)
    {
        setBounds(x,y,blockWidth,blockHeight);
        this.colorChange=colorChange;
    }
    public void draw(Graphics g)
    {
        if(colorChange==1)
        {
            g.setColor(Color.CYAN);
        }
        if(colorChange==2)
        {
            g.setColor(Color.GRAY);
        }
        if(colorChange==3)
        {
            g.setColor(Color.ORANGE);
        }
        if(colorChange==4)
        {
            g.setColor(Color.MAGENTA);
        }
        if(colorChange==5)
        {
            g.setColor(Color.BLUE);
        }
        g.fillRect(x,y,blockWidth,blockHeight);
    }
    public int getHealth()
    {
        return colorChange;
    }
    public void setHealth(int colorChange)
    {
        this.colorChange=colorChange;
    }
}
