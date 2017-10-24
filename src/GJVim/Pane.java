package GJVim;

import javax.swing.*;
import java.awt.*;

public class Pane extends JPanel {
    private static final long serialVersionUID = 1L;
    private JTextArea textArea;
    private JToolBar toolBar;
    public Pane() {
        super();
        // textArea作成
        textArea = new JTextArea();
        add(textArea, BorderLayout.CENTER);
        // toolBar作成
        toolBar = new JToolBar();
        toolBar.setBackground(Color.BLUE);
        add(toolBar, BorderLayout.SOUTH);
    }
}