package game.altamash.minehunt;
import jdk.nashorn.api.tree.ReturnTree;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class Mine_Hunt_Game_Screen extends JPanel implements MouseListener {
    private JLabel text;
    private boolean isBomb;
    public int num;
    public static int score;
    public static boolean returnMineHuntGameFrame;
    public Mine_Hunt_Game_Screen() {
        score = 0;
        returnMineHuntGameFrame = false;
        setBorder(BorderFactory.createLineBorder(Color.BLACK));
        text = new JLabel("");
        num = 0;
        add(text);
        addMouseListener(this);
        randomize();
    }

    public void setText(String s) {
        text.setText(s);
    }

    private void randomize() {
        if (new Random().nextInt(10) == 0) {
            setBomb(true);
        }
    }

    public void setNum(Mine_Hunt_Game_Screen t) {
        if (t.isBomb())
            num++;
    }

    public boolean isBomb() {
        return isBomb;
    }

    public void setBomb(boolean isBomb) {
        this.isBomb = isBomb;
    }

    private boolean check() {
        if (isBomb) {
            setBackground(Color.RED);
            setText("blast");
        }
        else {
            setBackground(Color.CYAN);
            setText(num + "");
            score++;
        }
        show();
        return isBomb;
    }

    public void show() {
        text.setVisible(true);
    }

    public void hide() {
        text.setVisible(false);
    }

    public void mouseClicked(MouseEvent e) {

    }

    public void mouseEntered(MouseEvent e) {

    }

    public void mouseExited(MouseEvent e) {

    }

    public void mousePressed(MouseEvent e) {

    }

    public void mouseReleased(MouseEvent e) {
        if (check()) {
            returnMineHuntGameFrame = true;
        }
    }
}