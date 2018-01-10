package GJVim;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.text.JTextComponent;
import javax.swing.text.TextAction;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

@SuppressWarnings("serial")
class Pane extends JPanel{
    Pane pane;
    JTextComponent textArea = new JTextArea();
    Status status;

    private enum Status {
        Normal,
        Insert,
        Visual
    }

    Pane() {
        super();
        pane = this;
        this.setLayout(new BorderLayout());

        // Normal Mode setting
        JTextComponent.addKeymap("normal", null);
        JTextComponent.loadKeymap(JTextComponent.getKeymap("normal"), NormalMode.getBindings(), textArea.getActions());
        // Insert Mode setting
        JTextComponent.addKeymap("insert", JTextComponent.getKeymap("BasicTextAreaUI"));
        JTextComponent.loadKeymap(JTextComponent.getKeymap("insert"), InsertMode.getBindings(), textArea.getActions());
        // Visual Mode setting
        JTextComponent.addKeymap("visual", null);
        JTextComponent.loadKeymap(JTextComponent.getKeymap("visual"), VisualMode.getBindings(), textArea.getActions());

        if(status == null) {
            setNormal();
        }
        textArea.addKeyListener( new KeyCheck() );
        this.add(textArea);
    }

    public void setNormal() {
        this.status = Status.Normal;
        textArea.setKeymap(JTextComponent.getKeymap("normal"));
        System.out.println("Normal Mode");
    }

    public void setInsert() {
        this.status = Status.Insert;
        textArea.setKeymap(JTextComponent.getKeymap("insert"));
        System.out.println("Insert Mode");
    }

    public void setVisual() {
        this.status = Status.Visual;
        textArea.setKeymap(JTextComponent.getKeymap("visual"));
    }

    private class KeyCheck extends KeyAdapter {
        public void keyReleased( KeyEvent e ) {
            int keyCode = e.getKeyCode();
            if(keyCode == KeyEvent.VK_ESCAPE) {
                pane.setNormal();
            }
            else if(keyCode == 73 && status == Status.valueOf("Normal")) {
                pane.setInsert();
            }
        }
    }

}
