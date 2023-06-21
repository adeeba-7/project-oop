import javax.swing.*;

public class GameFrame extends JFrame {
    public GameFrame() {
        this.add(new Graphics());
        this.pack();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Snake Game");
        this.setAlwaysOnTop(true);
        this.setUndecorated(true);


    }
}
