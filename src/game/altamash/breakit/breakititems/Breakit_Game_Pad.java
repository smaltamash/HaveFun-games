package game.altamash.breakit.breakititems;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Color;
import java.awt.event.KeyEvent;
import game.altamash.breakit.breakitmain.Breakit_Game_Screen;
import game.altamash.breakit.breakitmain.Breakit_Game_Selection_Frame;

import static game.altamash.breakit.breakitmain.Breakit_Game_Screen.WIDTH;
public class Breakit_Game_Pad extends Rectangle
{
    public static final long serialVersionUID=2L;
    public int padWidth=180;
    public int padHeight=20;
    private boolean left=false,right=false;
    private int moveSpeed=3;
    private Rectangle topL,topC,topR;
    private Rectangle sideL,sideR;
    public Breakit_Game_Pad()
    {
        setBounds(WIDTH/2-80, Breakit_Game_Screen.HEIGHT-30,padWidth,padHeight);
        topL=new Rectangle(x,y-1,padWidth/3,1);
        topC=new Rectangle(x+padWidth/3,y-1,padWidth/3,1);
        topR=new Rectangle(x+2*(padWidth/3),y-1,padWidth/3,1);
        sideL=new Rectangle(x-1,y,1,padHeight);
        sideR=new Rectangle(x+padWidth,y,1,padHeight);

    }
    public void tick()
    {
        if(x<=0)
        {
            left=false;
        }
        if(x+padWidth>WIDTH)
        {
            right=false;
        }
        if(left)
        {
            x-=moveSpeed;
        }
        if(right)
        {
            x+=moveSpeed;
        }
        calculateEdges();
    }
    private void calculateEdges()
    {
        topL.setBounds(x,y,padWidth/3,1);
        topC.setBounds(x+padWidth/3,y,padWidth/3,1);
        topR.setBounds(x+2*(padWidth/3),y,padWidth/3,1);
        sideL.setBounds(x-1,y,1,padHeight);
        sideR.setBounds(x+padWidth,y,1,padHeight);
    }
    public void draw(Graphics g)
    {
        if(Breakit_Game_Selection_Frame.flag==1)
        {
            g.setColor(Color.RED);
        }
        if(Breakit_Game_Selection_Frame.flag==2)
        {
            g.setColor(Color.GREEN);
        }
        if(Breakit_Game_Selection_Frame.flag==3)
        {
            g.setColor(Color.BLUE);
        }
        g.fillRect(x,y,padWidth,padHeight);
    }
    public void keyPressed(int k)
    {
        if(k==KeyEvent.VK_LEFT)
        {
            left=true;
        }
        if(k==KeyEvent.VK_RIGHT)
        {
            right=true;
        }
    }
    public void keyReleased(int k)
    {
        if(k==KeyEvent.VK_LEFT)
        {
            left=false;
        }
        if(k==KeyEvent.VK_RIGHT)
        {
            right=false;
        }
    }
    public Rectangle getTopL()
    {
        return topL;
    }
    public Rectangle getTopC()
    {
        return topC;
    }
    public Rectangle getTopR()
    {
        return topR;
    }
    public Rectangle getSideL()
    {
        return sideL;
    }
    public Rectangle getSideR()
    {
        return sideR;
    }
}
