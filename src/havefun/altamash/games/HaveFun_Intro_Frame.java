package havefun.altamash.games;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class HaveFun_Intro_Frame extends JFrame implements ActionListener
{
	private static final long serialVersionUID = 1L;
	static String titleValue="HaveFun Games by Altamash";
	private JLabel bgImage;
	JLabel top,about,about1,about2,about3,about4,games,game1,game2,game3,game4,bonus,bonus1,bonus2,bonus3,bonus4,bonus5,bonus6,bonus7,bonus8,enjoy;
	JButton next,exit;
	public static boolean returnHaveFunIntroFrame;
	HaveFun_Intro_Frame()
	{
		setTitle(titleValue);
		setSize(500,660);
		returnHaveFunIntroFrame=false;
		bgImage=new JLabel(new ImageIcon("C:\\Users\\Auzad\\IdeaProjects\\HaveFun Games Altamash\\src\\havefun\\altamash\\games\\Background Images\\background_intro.jpg"));
		top=new JLabel("WELCOME TO HaveFun Games");
		about=new JLabel("ABOUT :-");
		about1=new JLabel("This Application is designed by Syed Mohd Altamash.");
		about2=new JLabel("It gives you options to play multiple Games.");
		about3=new JLabel("These Games may improves your Reflexes.");
		about4=new JLabel("These Games may Sharpens your Mind.");
		games=new JLabel("GAMES :-");
		game1=new JLabel("1.Snake Game by Altamash.");
		game2=new JLabel("2.Tic Tac Toe Game by Altamash.");
		game3=new JLabel("3.Mine Hunt Game by Altamash.");
		game4=new JLabel("4.Breakit Game by Altamash.");
		bonus=new JLabel("BONUS FEATURES :-");
		bonus1=new JLabel("These Games contains Bonus Features.");
		bonus2=new JLabel("This Application allows the");
		bonus3=new JLabel("user to do some other");
		bonus4=new JLabel("stuff such :");
		bonus5=new JLabel("1.Restart your System.");
		bonus6=new JLabel("2.Shutdown your System.");
		bonus7=new JLabel("This Application is Platform Independent, you can run");
		bonus8=new JLabel("the application in Windows,Linux,Macintosh,etc.");
		enjoy=new JLabel("ENJOY THE GAMES");
		next=new JButton("NEXT >");
		exit=new JButton("EXIT");
		top.setBounds(160,30,220,15);
		about.setBounds(100,70,100,15);
		about1.setBounds(100,90,330,15);
		about2.setBounds(100,105,300,15);
		about3.setBounds(100,120,300,15);
		about4.setBounds(100,135,300,15);
		games.setBounds(100,180,100,10);
		game1.setBounds(100,200,300,15);
		game2.setBounds(100,215,300,15);
        game3.setBounds(100,230,300,15);
        game4.setBounds(100,245,300,15);
		bonus.setBounds(100,290,150,15);
		bonus1.setBounds(100,315,300,15);
		bonus2.setBounds(100,330,300,15);
		bonus3.setBounds(100,345,350,15);
		bonus4.setBounds(100,360,300,15);
		bonus5.setBounds(100,375,300,15);
		bonus6.setBounds(100,390,300,15);
		bonus7.setBounds(100,405,330,15);
		bonus8.setBounds(100,420,350,15);
		enjoy.setBounds(100,480,300,15);
		next.setBounds(150,540,80,40);
		exit.setBounds(250,540,80,40);
        bgImage.setBounds(0,0,500,660);
        add(top);
		add(about);
		add(about1);
		add(about2);
		add(about3);
		add(about4);
		add(games);
		add(game1);
		add(game2);
		add(game3);
		add(game4);
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
			returnHaveFunIntroFrame=true;
		if(e.getSource()==exit)
			System.exit(EXIT_ON_CLOSE);
	}
}
