package game.altamash.minehunt;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class Mine_Hunt_Game_Frame extends JFrame
{
    Mine_Hunt_Game_Screen[][] boxes;
    GridLayout layout;
    JPanel panel;
    public Mine_Hunt_Game_Frame()
    {
        setSize(Mine_Hunt_Game_Items.I * 50, Mine_Hunt_Game_Items.J * 50);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle(Mine_Hunt_Game_Intro_Frame.titleValue);
        panel = new JPanel();
        layout = new GridLayout(Mine_Hunt_Game_Items.I, Mine_Hunt_Game_Items.J);
        boxes = new Mine_Hunt_Game_Screen[Mine_Hunt_Game_Items.I][Mine_Hunt_Game_Items.J];
        panel.setLayout(layout);
        panel.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
        for(int i = 0; i < Mine_Hunt_Game_Items.I; i++)
        {
            for(int j = 0; j < Mine_Hunt_Game_Items.J; j++)
            {
                boxes[i][j] = new Mine_Hunt_Game_Screen();
            }
        }
        for(int i = 0; i < Mine_Hunt_Game_Items.I; i++) {
            for(int j = 0; j < Mine_Hunt_Game_Items.J; j++) {
                if(i == 0) {
                    if(j == 0) { //top left
                        boxes[i][j].setNum(boxes[i+1][j]);
                        boxes[i][j].setNum(boxes[i][j+1]);
                        boxes[i][j].setNum(boxes[i+1][j+1]);
                    }else if(j == Mine_Hunt_Game_Items.J - 1) {
                        boxes[i][j].setNum(boxes[i+1][j]);
                        boxes[i][j].setNum(boxes[i][j-1]);
                        boxes[i][j].setNum(boxes[i+1][j-1]);
                    }else { //top row
                        boxes[i][j].setNum(boxes[i][j+1]);
                        boxes[i][j].setNum(boxes[i][j-1]);
                        boxes[i][j].setNum(boxes[i+1][j]);
                        boxes[i][j].setNum(boxes[i+1][j+1]);
                        boxes[i][j].setNum(boxes[i+1][j-1]);
                    }
                }else if(j == 0 && i < Mine_Hunt_Game_Items.I - 1 && i > 0) {
                    boxes[i][j].setNum(boxes[i-1][j]);
                    boxes[i][j].setNum(boxes[i+1][j]);
                    boxes[i][j].setNum(boxes[i][j+1]);
                    boxes[i][j].setNum(boxes[i-1][j+1]);
                    boxes[i][j].setNum(boxes[i+1][j+1]);
                }else if(i == Mine_Hunt_Game_Items.I-1) {
                    if(j == 0) { //bottom left
                        boxes[i][j].setNum(boxes[i-1][j]);
                        boxes[i][j].setNum(boxes[i][j+1]);
                        boxes[i][j].setNum(boxes[i-1][j+1]);
                    }else if(j == Mine_Hunt_Game_Items.J - 1) {
                        boxes[i][j].setNum(boxes[i-1][j]);
                        boxes[i][j].setNum(boxes[i][j-1]);
                        boxes[i][j].setNum(boxes[i-1][j-1]);
                    }else { //bottom row
                        boxes[i][j].setNum(boxes[i][j-1]);
                        boxes[i][j].setNum(boxes[i][j+1]);
                        boxes[i][j].setNum(boxes[i-1][j]);
                        boxes[i][j].setNum(boxes[i-1][j-1]);
                        boxes[i][j].setNum(boxes[i-1][j+1]);
                    }
                }else if(j == Mine_Hunt_Game_Items.J - 1 && i < Mine_Hunt_Game_Items.I - 1 && i > 0) {
                    boxes[i][j].setNum(boxes[i-1][j]);
                    boxes[i][j].setNum(boxes[i+1][j]);
                    boxes[i][j].setNum(boxes[i][j-1]);
                    boxes[i][j].setNum(boxes[i-1][j-1]);
                    boxes[i][j].setNum(boxes[i+1][j-1]);
                }else { //
                    boxes[i][j].setNum(boxes[i-1][j]);
                    boxes[i][j].setNum(boxes[i][j-1]);
                    boxes[i][j].setNum(boxes[i+1][j]);
                    boxes[i][j].setNum(boxes[i][j+1]);
                    boxes[i][j].setNum(boxes[i-1][j-1]);
                    boxes[i][j].setNum(boxes[i-1][j+1]);
                    boxes[i][j].setNum(boxes[i+1][j+1]);
                    boxes[i][j].setNum(boxes[i+1][j-1]);
                }
                panel.add(boxes[i][j]);
            }
        }
        add(panel);
        setVisible(true);
    }
}