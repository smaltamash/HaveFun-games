package game.altamash.minehunt;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mine_Hunt_Game_Ask_Frame extends JFrame implements ActionListener
{
    private static final long serialVersionUID = 5L;
    private JLabel bgImage;
    JLabel question;
    public static JTextField answer;
    JButton next;
    Font f1;
    public boolean returnMineHuntGameAskFrame;
    public Mine_Hunt_Game_Ask_Frame()
    {
        setTitle(Mine_Hunt_Game_Intro_Frame.titleValue);
        setSize(530,350);
        returnMineHuntGameAskFrame=false;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bgImage=new JLabel(new ImageIcon("C:\\Users\\Auzad\\IdeaProjects\\HaveFun Games Altamash\\src\\game\\altamash\\minehunt\\Background Images\\background_ask.jpg"));
        question=new JLabel("How many correct boxes will you hit ?");
        answer=new JTextField();
        next=new JButton("NEXT >");
        f1=new Font("Arial",Font.PLAIN,25);
        question.setBounds(65,40,450,40);
        answer.setBounds(205,115,90,30);
        next.setBounds(185,185,130,40);
        bgImage.setBounds(0,0,530,350);
        question.setFont(f1);
        add(question);
        add(answer);
        add(next);
        add(bgImage);
        next.addActionListener(this);
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==next)
        {
            returnMineHuntGameAskFrame=true;
        }
    }
}
