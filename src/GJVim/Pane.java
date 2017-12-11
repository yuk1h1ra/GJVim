package GJVim;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.BorderLayout;

@SuppressWarnings("serial")
class Pane extends JPanel{
    JPanel pane;  // this instance
    JTextArea textArea;

    Pane() {
        super();
        pane = this;
        pane.setLayout(new BorderLayout());

        // textArea
        textArea = new JTextArea();
        pane.add(textArea);

        // toolbar
        toolBar = new ToolBar();
        pane.add(toolBar);
    }
}
