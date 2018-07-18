package zadanie1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShowAddBookListener implements ActionListener {
    private  AddBookWindow addBookWindow;
    public ShowAddBookListener(AddBookWindow addBookWindow) {
        this.addBookWindow = addBookWindow;
    }
    @Override
    public void actionPerformed (ActionEvent e){
        addBookWindow.setVisible(true);
    }

}
