package game.altamash.breakit.breakitcontrol;
import java.awt.Graphics;
import java.util.Stack;
public class Breakit_Game_State_Control
{
    public static Stack<Breakit_Game_State> states;
    public Breakit_Game_State_Control()
    {
        states=new Stack<Breakit_Game_State>();
        states.push(new Breaitk_Game_Level(this));
    }
    public void tick()
    {
        if(states.size()>0)
        {
            states.peek().tick();
        }
    }
    public void draw(Graphics g)
    {
        if(states.size()>0)
        {
            states.peek().draw(g);
        }
    }
    public void keyPressed(int k)
    {
        if(states.size()>0)
        {
            states.peek().keyPressed(k);
        }
    }
    public void keyReleased(int k)
    {
        if(states.size()>0)
        {
            states.peek().keyReleased(k);
        }
    }
}
