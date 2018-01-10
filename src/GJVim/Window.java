package GJVim;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
class Window extends JFrame{
    JPanel contentPane;

    Window(String title) {
        super(title);

        contentPane = (JPanel)getContentPane();
        contentPane.add(new Pane());
    }
}
