package game.altamash.breakit.breakititems;
import java.awt.Color;
import java.awt.Graphics;
import game.altamash.breakit.breakitmain.Breakit_Game_Final_Frame;
import game.altamash.breakit.breakitmain.Breakit_Game_Screen;
import game.altamash.breakit.breakitmain.Breakit_Game_Selection_Frame;

public class Breakit_Game_Ball
{
    private int x,y,r;
    private int x2,y2;
    public Breakit_Game_Ball(int x, int y, int r)
    {
        this.x=x;
        this.y=y;
        this.r=r;
        x2=2;
        y2=2;
    }
    public void tick()
    {
        if(x+r>= Breakit_Game_Screen.WIDTH||x-r<=0)
        {
            x2*=-1;
        }
        if(y-r<=0)
        {
            y2*=-1;
        }
        if(y-r>=Breakit_Game_Screen.HEIGHT)
        {
            Breakit_Game_Screen.playState=false;
            Breakit_Game_Screen.returnBreakitGameFrame=true;
        }
        x+=x2;
        y+=y2;
    }
    public void draw(Graphics g)
    {
        if(Breakit_Game_Selection_Frame.flag==1)
        {
            g.setColor(new Color(75,0,130));
        }
        if(Breakit_Game_Selection_Frame.flag==2)
        {
            g.setColor(Color.WHITE);
        }
        if(Breakit_Game_Selection_Frame.flag==3)
        {
            g.setColor(new Color(97,64,81));
        }
        g.fillOval(x-r,y-r,2*r,2*r);
    }
    public int getX()
    {
        return x;
    }
    public void setX(int x)
    {
        this.x = x;
    }
    public int getY()
    {
        return y;
    }
    public void setY(int y)
    {
        this.y = y;
    }
    public int getR()
    {
        return r;
    }
    public void setR(int r)
    {
        this.r = r;
    }
    public int getDx()
    {
        return x2;
    }
    public void setDx(int x2)
    {
        this.x2 = x2;
    }
    public int getDy()
    {
        return y2;
    }
    public void setDy(int y2)
    {
        this.y2 = y2;
    }
}
