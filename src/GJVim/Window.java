package GJVim;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
class Window extends JFrame{
    JFrame window; // this instance
    JPanel contentPane;

    Window(String title) {
        super(title);
        window = this;

        contentPane = (JPanel)getContentPane();
        contentPane.add(new Pane());
    }
}
