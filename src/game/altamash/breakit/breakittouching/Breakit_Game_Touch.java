package game.altamash.breakit.breakittouching;
import game.altamash.breakit.breakititems.Breakit_Game_Ball;
import game.altamash.breakit.breakititems.Breakit_Game_Blocks;
import game.altamash.breakit.breakititems.Breakit_Game_Pad;
import game.altamash.breakit.breakitmain.Breakit_Game_Screen;

import java.awt.Point;
import java.awt.Rectangle;
public class Breakit_Game_Touch
{
    private int bX,bY,bR;
    private boolean ballPaddle(Rectangle r,Point p)
    {
        return r.contains(p);
    }
    private boolean brickBall(Breakit_Game_Blocks b, Point p)
    {
        return b.contains(p);
    }
    public void paddleBall(Breakit_Game_Pad breakitPad, Breakit_Game_Ball breakitBall)
    {
        bX= breakitBall.getX();
        bY= breakitBall.getY();
        bR= breakitBall.getR();
        if(ballPaddle(breakitPad.getTopL(),new Point(bX,bY+bR)))
        {
            breakitBall.setDy(breakitBall.getDy()*-1);
            breakitBall.setDx(-2);
        }
        if(ballPaddle(breakitPad.getTopC(),new Point(bX,bY+bR)))
        {
            breakitBall.setDy(breakitBall.getDy()*-1);
            breakitBall.setDx(-2);
        }
        if(ballPaddle(breakitPad.getTopR(),new Point(bX,bY+bR)))
        {
            breakitBall.setDy(breakitBall.getDy()*-1);
            breakitBall.setDx(2);
        }
        if(ballPaddle(breakitPad.getSideL(),new Point(bX+bR,bY)))
        {
            breakitBall.setDx(breakitBall.getDx()*-1);
        }
        if(ballPaddle(breakitPad.getSideR(),new Point(bX-bR,bY)))
        {
            breakitBall.setDx(breakitBall.getDx()*-1);
        }
    }
    public void ballBrick(Breakit_Game_Ball breakitBall, Breakit_Game_Blocks breakitBlocks)
    {
        bX= breakitBall.getX();
        bY= breakitBall.getY();
        bR= breakitBall.getR();
        if(brickBall(breakitBlocks,new Point(bX+bR,bY))||brickBall(breakitBlocks,new Point(bX-bR,bY)))
        {
            breakitBlocks.setHealth(breakitBlocks.getHealth()-1);
            breakitBall.setDx(breakitBall.getDx()*-1);
            Breakit_Game_Screen.score++;
        }
        if(brickBall(breakitBlocks,new Point(bX,bY-bR))||brickBall(breakitBlocks,new Point(bX,bY+bR)))
        {
            breakitBlocks.setHealth(breakitBlocks.getHealth()-1);
            breakitBall.setDy(breakitBall.getDy()*-1);
            Breakit_Game_Screen.score++;
        }
    }
}
