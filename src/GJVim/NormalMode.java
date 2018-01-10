package GJVim;

import javax.swing.KeyStroke;
import javax.swing.text.JTextComponent;
import javax.swing.text.DefaultEditorKit;

@SuppressWarnings("serial")
class NormalMode {
    static JTextComponent.KeyBinding[] bindings = {
        new JTextComponent.KeyBinding( KeyStroke.getKeyStroke("typed j"), DefaultEditorKit.downAction ),
        new JTextComponent.KeyBinding( KeyStroke.getKeyStroke("typed k"), DefaultEditorKit.upAction ),
        new JTextComponent.KeyBinding( KeyStroke.getKeyStroke("typed h"), DefaultEditorKit.backwardAction ),
        new JTextComponent.KeyBinding( KeyStroke.getKeyStroke("typed l"), DefaultEditorKit.forwardAction ),

        new JTextComponent.KeyBinding( KeyStroke.getKeyStroke("typed x"), DefaultEditorKit.deleteNextCharAction )
    };

    public static JTextComponent.KeyBinding[] getBindings() {
        return bindings;
    }
}
