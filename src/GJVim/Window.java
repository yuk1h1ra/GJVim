package GJVim;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    private static final long serialVersionUID = 1L;
    private Container content;
    public Window() {
        // JFrameのコンストラクタ呼び出し
        super("title");
        // JFrameの設定もろもろ
        setBounds(100, 100, 800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // Paneの呼び出し
        content = getContentPane();
        Pane pane1 = new Pane();
        pane1.setBackground(Color.WHITE);
        content.add(pane1);
    }
}
