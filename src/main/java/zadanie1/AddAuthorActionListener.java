package zadanie1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddAuthorActionListener implements ActionListener {
   private AddAuthorWindow addAuthorWindow = new AddAuthorWindow();
   private DefaultListModel<Author> authorListModel = new DefaultListModel<>();




    @Override
    public void actionPerformed(ActionEvent e) {
    authorListModel.addElement(addAuthorWindow.createAuthor());
    addAuthorWindow.setVisible(true);
    }

    public AddAuthorActionListener(AddAuthorWindow addAuthorWindow, DefaultListModel<Author> authorListModel) {
        this.addAuthorWindow = addAuthorWindow;
        this.authorListModel = authorListModel;
    }
}
