package game.altamash.breakit.breakitmain;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    public class Breakit_Game_Selection_Frame extends JFrame implements ActionListener
{
    private static final long serialVersionUID = 2L;
    private JLabel bgImage;
    JLabel selection1,selection2,selection3;
    JButton play,exit;
    JRadioButton redPad,greenPad,bluePad,easy,medium,hard,black,coral;
    ButtonGroup padColor,difficultyLevel,grids;
    public static int flag;
    public static boolean levelEasy,levelMedium,levelHard,bgColorCoral;
    public boolean returnBreakitGameSelectionFrame;
    public Breakit_Game_Selection_Frame()
    {
        returnBreakitGameSelectionFrame=false;
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle(Breakit_Game_Intro_Frame.titleValue);
        setResizable(false);
        flag=0;
        levelEasy=false;
        levelMedium=false;
        levelHard=false;
        bgColorCoral=false;
        bgImage=new JLabel(new ImageIcon("C:\\Users\\Auzad\\IdeaProjects\\HaveFun Games Altamash\\src\\game\\altamash\\snake\\Background  Images\\background_selection.jpg"));
        selection1=new JLabel("Select the Color of Pad and Ball :-");
        selection2=new JLabel("Select the Difficulty Level of the Game :-");
        selection3=new JLabel("Do you want the Black or Coral Background ?");
        play=new JButton("PLAY");
        exit=new JButton("EXIT");
        redPad=new JRadioButton("Pad Color = Red and Ball Color = Indigo");
        greenPad=new JRadioButton("Pad Color = Green and Ball Color = White",true);
        bluePad=new JRadioButton("Pad Color = Blue and Ball Color = Eggplant");
        padColor=new ButtonGroup();
        padColor.add(redPad);
        padColor.add(greenPad);
        padColor.add(bluePad);
        easy=new JRadioButton("EASY");
        medium=new JRadioButton("MEDIUM",true);
        hard=new JRadioButton("HARD");
        difficultyLevel=new ButtonGroup();
        difficultyLevel.add(easy);
        difficultyLevel.add(medium);
        difficultyLevel.add(hard);
        black=new JRadioButton("Black",true);
        coral=new JRadioButton("Coral");
        grids=new ButtonGroup();
        grids.add(black);
        grids.add(coral);
        redPad.setOpaque(false);
        greenPad.setOpaque(false);
        bluePad.setOpaque(false);
        easy.setOpaque(false);
        medium.setOpaque(false);
        hard.setOpaque(false);
        black.setOpaque(false);
        coral.setOpaque(false);
        selection1.setBounds(70,30,300,20);
        redPad.setBounds(70,50,300,20);
        greenPad.setBounds(70,70,300,20);
        bluePad.setBounds(70,90,300,20);
        selection2.setBounds(70,120,300,20);
        easy.setBounds(70,140,100,20);
        medium.setBounds(70,160,100,20);
        hard.setBounds(70,180,100,20);
        selection3.setBounds(70,210,300,20);
        black.setBounds(70,230,300,20);
        coral.setBounds(70,250,300,20);
        play.setBounds(90,300,100,30);
        exit.setBounds(200,300,100,30);
        bgImage.setBounds(0,0,400,400);
        add(selection1);
        add(redPad);
        add(greenPad);
        add(bluePad);
        add(selection2);
        add(easy);
        add(medium);
        add(hard);
        add(selection3);
        add(black);
        add(coral);
        add(play);
        add(exit);
        add(bgImage);
        play.addActionListener(this);
        exit.addActionListener(this);
        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==play)
        {
            if(redPad.isSelected())
                flag=1;
            if(greenPad.isSelected())
                flag=2;
            if(bluePad.isSelected())
                flag=3;
            if(easy.isSelected())
                levelEasy=true;
            if(medium.isSelected())
                levelMedium=true;
            if(hard.isSelected())
                levelHard=true;
            if(coral.isSelected())
                bgColorCoral=true;
            returnBreakitGameSelectionFrame=true;
        }
        if(e.getSource()==exit)
            System.exit(EXIT_ON_CLOSE);
    }
}
