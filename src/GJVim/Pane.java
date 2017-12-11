package GJVim;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.BorderLayout;

@SuppressWarnings("serial")
class Pane extends JPanel{
    JPanel pane;  // this instance
    JTextArea textArea;

    Pane() {
        // this instance
        super();
        pane = this;
        pane.setLayout(new BorderLayout());

        // textArea
        textArea = new JTextArea("this is text area");
        pane.add(textArea);
    }
}
