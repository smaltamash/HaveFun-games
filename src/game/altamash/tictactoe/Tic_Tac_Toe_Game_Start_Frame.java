package game.altamash.tictactoe;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Tic_Tac_Toe_Game_Start_Frame extends JFrame implements ActionListener
{
	private static final long serialVersionUID = 3L;
	private JLabel bgImage;
	JLabel alert;
	JButton start;
	Font f1;
	public boolean returnTTTGameStartFrame;
	public Tic_Tac_Toe_Game_Start_Frame()
	{
		setTitle(Tic_Tac_Toe_Game_Intro_Frame.titleValue);
		setSize(400,250);
		returnTTTGameStartFrame=false;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bgImage=new JLabel(new ImageIcon("C:\\Users\\Auzad\\IdeaProjects\\HaveFun Games Altamash\\src\\game\\altamash\\tictactoe\\Background Images\\background_start.jpg"));
		alert=new JLabel("Get ready for the Game");
		start=new JButton("START");
		f1=new Font("Arial",Font.PLAIN,25);
		alert.setBounds(65,40,350,40);
		start.setBounds(145,120,100,40);
		bgImage.setBounds(0,0,400,250);
		alert.setFont(f1);
		add(alert);
		add(start);
		add(bgImage);
		start.addActionListener(this);
		setLayout(null);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==start)
		{
			returnTTTGameStartFrame=true;
		}
	}
}
