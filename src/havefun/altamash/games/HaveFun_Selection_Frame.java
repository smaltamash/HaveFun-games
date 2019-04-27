package havefun.altamash.games;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class HaveFun_Selection_Frame extends JFrame implements ActionListener
{
	private static final long serialVersionUID = 2L;
	private JLabel bgImage;
	JLabel top,game1,game2,game3,game4,bonus1;
	JButton snakeGamebyAltamash,tictactoeGamebyAltamash,minehuntGamebyAltamash,breakitGamebyAltamash,bonusStuff;
	public static boolean returnHaveFunSelectionFrameSnake,returnHaveFunSelectionFrameTTT,returnHaveFunSelectionFrameMineHunt,returnHaveFunSelectionFrameBreakit,returnHaveFunSelectionFrameBS;
	HaveFun_Selection_Frame()
	{
		setTitle(HaveFun_Intro_Frame.titleValue);
		setSize(500,670);
		returnHaveFunSelectionFrameSnake=false;
		returnHaveFunSelectionFrameTTT=false;
        returnHaveFunSelectionFrameMineHunt=false;
        returnHaveFunSelectionFrameBreakit=false;
        returnHaveFunSelectionFrameBS=false;
		bgImage=new JLabel(new ImageIcon("C:\\Users\\Auzad\\IdeaProjects\\HaveFun Games Altamash\\src\\havefun\\altamash\\games\\Background Images\\background_selection.jpg"));
		top=new JLabel("HaveFun GAMES SELECTION");
		game1=new JLabel("1.Press Button below to play Snake Game by Altamash");
		game2=new JLabel("2.Press Button Below to play Tic Tac Toe Game by Altamash");
        game3=new JLabel("3.Press Button below to play Mine Hunt Game by Altamash");
        game4=new JLabel("4.Press Button below to play Breakit Game by Altamash");
        bonus1=new JLabel("5.Press Button Below to control this System");
		snakeGamebyAltamash=new JButton("SNAKE GAME BY ALTAMASH");
		tictactoeGamebyAltamash=new JButton("TIC TAC TOE GAME BY ALTAMASH");
        minehuntGamebyAltamash=new JButton("MINE HUNT GAME BY ALTAMASH");
        breakitGamebyAltamash=new JButton("BREAKIT GAME BY ALTAMASH");
		bonusStuff=new JButton("CONTROL YOUR SYSTEM");
		top.setBounds(150,40,250,10);
		game1.setBounds(90,90,350,20);
		snakeGamebyAltamash.setBounds(90,130,300,40);
		game2.setBounds(90,190,350,20);
		tictactoeGamebyAltamash.setBounds(90,230,300,40);
        game3.setBounds(90,290,350,20);
        minehuntGamebyAltamash.setBounds(90,330,300,40);
        game4.setBounds(90,390,350,20);
        breakitGamebyAltamash.setBounds(90,430,300,40);
		bonus1.setBounds(90,490,350,20);
		bonusStuff.setBounds(90,530,300,40);
		bgImage.setBounds(0,0,500,670);
		add(top);
		add(game1);
		add(snakeGamebyAltamash);
		add(game2);
		add(tictactoeGamebyAltamash);
        add(game3);
        add(minehuntGamebyAltamash);
        add(game4);
        add(breakitGamebyAltamash);
		add(bonus1);
		add(bonusStuff);
		add(bgImage);
		snakeGamebyAltamash.addActionListener(this);
		tictactoeGamebyAltamash.addActionListener(this);
		minehuntGamebyAltamash.addActionListener(this);
		breakitGamebyAltamash.addActionListener(this);
		bonusStuff.addActionListener(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
		setResizable(false);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) 
	{
        if(e.getSource()==snakeGamebyAltamash)
		{
			returnHaveFunSelectionFrameSnake=true;
		}
		if(e.getSource()==tictactoeGamebyAltamash)
		{
			returnHaveFunSelectionFrameTTT=true;
		}
		if(e.getSource()==minehuntGamebyAltamash)
		{
			returnHaveFunSelectionFrameMineHunt=true;
		}
		if(e.getSource()==breakitGamebyAltamash)
		{
			returnHaveFunSelectionFrameBreakit=true;
		}
		if(e.getSource()==bonusStuff)
		{
			returnHaveFunSelectionFrameBS=true;
		}
	}
}