package GJVim;

import javax.swing.JToolBar;

@SuppressWarnings("serial")
/*
 * 自作のPaneクラスから呼ばれる
 * TextAreaの現在の行列を取得して、表示する
 * 現在のファイル名も取得して表示する
 */
class ToolBar extends JToolBar{
    JToolBar toolBar; // this instance

    ToolBar() {
        super();
        toolBar = this;
        toolBar.setFloatable( true );
    }
}
