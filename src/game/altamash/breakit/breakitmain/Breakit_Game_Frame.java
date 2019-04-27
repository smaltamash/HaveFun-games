package game.altamash.breakit.breakitmain;
import javax.swing.JFrame;
import java.awt.BorderLayout;
public class Breakit_Game_Frame extends JFrame
{
    public Breakit_Game_Frame()
    {
        setTitle(Breakit_Game_Intro_Frame.titleValue);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(new BorderLayout());
        add(new Breakit_Game_Screen(),BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
