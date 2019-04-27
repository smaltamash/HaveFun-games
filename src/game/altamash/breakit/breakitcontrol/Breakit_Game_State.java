package game.altamash.breakit.breakitcontrol;
import java.awt.Graphics;
public abstract class Breakit_Game_State
{
    protected Breakit_Game_State_Control gsm;
    protected Breakit_Game_State(Breakit_Game_State_Control gsm)
    {
        this.gsm=gsm;
        init();
    }
    public abstract void init();
    public abstract void tick();
    public abstract void draw(Graphics g);
    public abstract void keyPressed(int k);
    public abstract void keyReleased(int k);
}
