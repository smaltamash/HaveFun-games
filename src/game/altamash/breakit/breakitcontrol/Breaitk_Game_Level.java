package game.altamash.breakit.breakitcontrol;
import game.altamash.breakit.breakitmain.Breakit_Game_Screen;
import game.altamash.breakit.breakititems.Breakit_Game_Ball;
import game.altamash.breakit.breakititems.Breakit_Game_Blocks;
import game.altamash.breakit.breakititems.Breakit_Game_Pad;
import game.altamash.breakit.breakittouching.Breakit_Game_Touch;
import java.awt.Graphics;
import java.util.ArrayList;
public class Breaitk_Game_Level extends Breakit_Game_State
{
    private Breakit_Game_Pad breakitPad;
    private Breakit_Game_Ball breakitBall;
    private ArrayList<Breakit_Game_Blocks> breakitBlocks;
    private Breakit_Game_Touch breakitGameTouch;
    private int[][] breakitBlock;
    public Breaitk_Game_Level(Breakit_Game_State_Control gsm)
    {
        super(gsm);
    }
    public void init()
    {
        breakitPad =new Breakit_Game_Pad();
        breakitBall =new Breakit_Game_Ball(Breakit_Game_Screen.WIDTH-520, Breakit_Game_Screen.HEIGHT-200,10);
        breakitBlocks =new ArrayList<Breakit_Game_Blocks>();
        breakitBlock=new int[10][13];
        for(int i=0;i<breakitBlock.length;i++)
        {
            for (int j = 0; j < breakitBlock[0].length; j++)
            {
                if (i <= 1) {
                    breakitBlock[i][j] = 5;
                }
                if (i <= 3 && i >= 2) {
                    breakitBlock[i][j] = 4;
                }
                if (i <= 5 && i >= 4) {
                    breakitBlock[i][j] = 3;
                }
                if (i <= 7 && i >= 6) {
                    breakitBlock[i][j] = 2;
                }
                if (i <=9  && i >= 8) {
                    breakitBlock[i][j] = 1;
                }
            }
        }
        for(int i=0;i<breakitBlock.length;i++)
        {
            for(int j=0;j<breakitBlock[0].length;j++)
            {
                breakitBlocks.add(new Breakit_Game_Blocks(j*60+13,i*30+13,breakitBlock[i][j]));
            }
        }
        breakitGameTouch =new Breakit_Game_Touch();
    }
    public void tick()
    {
        breakitPad.tick();
        breakitBall.tick();
        breakitGameTouch.paddleBall(breakitPad, breakitBall);
        for(int i = 0; i< breakitBlocks.size(); i++)
        {
            breakitGameTouch.ballBrick(breakitBall, breakitBlocks.get(i));
            if(breakitBlocks.get(i).getHealth()<=0)
            {
                breakitBlocks.remove(i);
                i--;
            }
        }
    }
    public void draw(Graphics g)
    {
        breakitPad.draw(g);
        breakitBall.draw(g);
        for(int i = 0; i< breakitBlocks.size(); i++)
        {
            breakitBlocks.get(i).draw(g);
        }
    }
    public void keyPressed(int k)
    {
        breakitPad.keyPressed(k);
    }
    public void keyReleased(int k)
    {
        breakitPad.keyReleased(k);
    }
}
