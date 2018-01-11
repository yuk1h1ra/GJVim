package GJVim;

import javax.swing.KeyStroke;
import javax.swing.text.JTextComponent;
import javax.swing.text.DefaultEditorKit;

@SuppressWarnings("serial")
class VisualMode {
    static JTextComponent.KeyBinding[] bindings = {
        new JTextComponent.KeyBinding( KeyStroke.getKeyStroke("typed j"), DefaultEditorKit.selectionDownAction ),
        new JTextComponent.KeyBinding( KeyStroke.getKeyStroke("typed k"), DefaultEditorKit.selectionUpAction ),
        new JTextComponent.KeyBinding( KeyStroke.getKeyStroke("typed h"), DefaultEditorKit.selectionBackwardAction ),
        new JTextComponent.KeyBinding( KeyStroke.getKeyStroke("typed l"), DefaultEditorKit.selectionForwardAction ),

        new JTextComponent.KeyBinding( KeyStroke.getKeyStroke("typed y"), DefaultEditorKit.copyAction ),
        new JTextComponent.KeyBinding( KeyStroke.getKeyStroke("typed x"), DefaultEditorKit.cutAction ),
    };

    public static JTextComponent.KeyBinding[] getBindings() {
        return bindings;
    }
}
