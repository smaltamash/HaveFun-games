package game.altamash.minehunt;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Mine_Hunt_Game_Intro_Frame extends JFrame implements ActionListener
{
    private static final long serialVersionUID = 1L;
    static String titleValue="Mine Hunt Game by Altamash";
    private JLabel bgImage;
    JLabel top,about,about1,about2,about3,about4,rules,rule1,rule2,bonus,bonus1,bonus2,bonus3,bonus4,bonus5,bonus6,bonus7,bonus8,enjoy;
    JButton next,exit;
    public boolean returnMineHuntGameIntroFrame;
    public Mine_Hunt_Game_Intro_Frame()
    {
        setTitle(titleValue);
        setSize(500,600);
        returnMineHuntGameIntroFrame=false;
        bgImage=new JLabel(new ImageIcon("C:\\Users\\Auzad\\IdeaProjects\\HaveFun Games Altamash\\src\\game\\altamash\\minehunt\\Background Images\\background_intro.jpg"));
        top=new JLabel("WELCOME TO MINE HUNT GAME");
        about=new JLabel("ABOUT :-");
        about1=new JLabel("This Game is designed by Syed Mohd Altamash.");
        about2=new JLabel("The Game provides a beautiful Graphical Interface.");
        about3=new JLabel("The Game may improves your Reflexes.");
        about4=new JLabel("The Game may Sharpens your Mind.");
        rules=new JLabel("RULES :-");
        rule1=new JLabel("1.You should not click on the Bomb Box.");
        rule2=new JLabel("2.you should cleverly press Number Boxes.");
        bonus=new JLabel("BONUS FEATURE :-");
        bonus1=new JLabel("This Game contains a Bonus Feature.");
        bonus2=new JLabel("Whenever you will start the Game,");
        bonus3=new JLabel("there will be a question for you,");
        bonus4=new JLabel("You have to answer this question correctly.");
        bonus5=new JLabel("This questions will Triple your final score,");
        bonus6=new JLabel("This feature even lets you try your luck,");
        bonus7=new JLabel("It helps you get more concentrated.");
        bonus8=new JLabel("Bonus Feature helps you a lot in building your score.");
        enjoy=new JLabel("ENJOY THE GAME");
        next=new JButton("NEXT >");
        exit=new JButton("EXIT");
        top.setBounds(160,30,200,15);
        about.setBounds(100,70,100,15);
        about1.setBounds(100,90,300,15);
        about2.setBounds(100,105,300,15);
        about3.setBounds(100,120,300,15);
        about4.setBounds(100,135,300,15);
        rules.setBounds(100,180,100,10);
        rule1.setBounds(100,200,300,15);
        rule2.setBounds(100,215,300,15);
        bonus.setBounds(100,260,150,15);
        bonus1.setBounds(100,285,300,15);
        bonus2.setBounds(100,300,300,15);
        bonus3.setBounds(100,315,350,15);
        bonus4.setBounds(100,330,300,15);
        bonus5.setBounds(100,345,300,15);
        bonus6.setBounds(100,360,300,15);
        bonus7.setBounds(100,375,300,15);
        bonus8.setBounds(100,390,350,15);
        enjoy.setBounds(100,430,300,15);
        next.setBounds(150,480,80,40);
        exit.setBounds(250,480,80,40);
        bgImage.setBounds(0,0,500,600);
        add(top);
        add(about);
        add(about1);
        add(about2);
        add(about3);
        add(about4);
        add(rules);
        add(rule1);
        add(rule2);
        add(bonus);
        add(bonus1);
        add(bonus2);
        add(bonus3);
        add(bonus4);
        add(bonus5);
        add(bonus6);
        add(bonus7);
        add(bonus8);
        add(enjoy);
        add(next);
        add(exit);
        add(bgImage);
        next.addActionListener(this);
        exit.addActionListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==next)
        {
            returnMineHuntGameIntroFrame=true;
        }
        if(e.getSource()==exit) 
        {
            System.exit(EXIT_ON_CLOSE);
        }
    }
}
