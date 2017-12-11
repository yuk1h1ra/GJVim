package GJVim;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class GJVim{
    JFrame window;
    public static void main(String[] args) {
        JFrame window = new Window("GJVim");
        window.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        window.setSize( 800, 600 );
        window.setVisible( true );
    }
}
