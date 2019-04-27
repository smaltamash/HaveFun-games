package game.altamash.snake;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Snake_Game_Final_Frame extends JFrame implements ActionListener
{
	private static final long serialVersionUID = 6L;
	JButton restart,exit,returnToMainMenu;
	private JLabel bgImage;
	JLabel over,scoreFinal;
	Font f2;
	public boolean returnSnakeGameFinalFrameRestart,returnSnakeGameFinalFrameMainMenu;
	public Snake_Game_Final_Frame()
	{
		setTitle(Snake_Game_Intro_Frame.titleValue);
		setSize(420,350);
		returnSnakeGameFinalFrameRestart=false;
		returnSnakeGameFinalFrameMainMenu=false;
		bgImage=new JLabel(new ImageIcon("C:\\Users\\Auzad\\IdeaProjects\\HaveFun Games Altamash\\src\\game\\altamash\\snake\\Background  Images\\background_final.jpg"));
        bgImage.setBounds(0,0,420,350);
        f2=new Font("Arial",Font.PLAIN,30);
		over=new JLabel("GAME OVER");
		over.setFont(f2);
		over.setBounds(103,30,200,40);
		scoreFinal=new JLabel("Your Score = "+Snake_Game_Screen.score);
		scoreFinal.setFont(f2);
		scoreFinal.setBounds(95,90,300,30);
		restart=new JButton("RESTART");
		exit=new JButton("EXIT");
		returnToMainMenu=new JButton("RETURN TO MAIN MENU");
		restart.setBounds(90,150,100,40);
		restart.addActionListener(this);
		exit.setBounds(210,150,100,40);
		exit.addActionListener(this);
		returnToMainMenu.setBounds(90,210,220,40);
		returnToMainMenu.addActionListener(this);
		add(over);
		add(scoreFinal);
		add(restart);
		add(exit);
		add(returnToMainMenu);
        add(bgImage);
        setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==restart)
			returnSnakeGameFinalFrameRestart=true;
		if(e.getSource()==exit)
			System.exit(EXIT_ON_CLOSE);
		if(e.getSource()==returnToMainMenu)
			returnSnakeGameFinalFrameMainMenu=true;
	}
}
