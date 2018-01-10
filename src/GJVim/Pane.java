package GJVim;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.BorderLayout;

@SuppressWarnings("serial")
class Pane extends JPanel{
    JPanel pane;  // this instance
    JTextArea textArea;
    Status status;

    private enum Status {
        Normal,
        Insert,
        Visual
    }

    Pane() {
        // this instance
        super();
        pane = this;
        status = Status.Normal;
        pane.setLayout(new BorderLayout());

        // textArea
        textArea = new JTextArea();
        pane.add(textArea);
    }

}
