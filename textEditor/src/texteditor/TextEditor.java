
package texteditor;

import javax.swing.JFrame;

/**
 *
 * @author Bolaji Ayeni
 */
public class TextEditor {

    public static void main(String[] args) {
        textEditorGui obj = new textEditorGui();
        obj.setBounds(0, 0, 700, 700);
        obj.setTitle("Bolaji Ayeni's IDE");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
    }
    
}
