package zadanie1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddBookActionListener implements ActionListener {
    private DefaultListModel<Book> listModel;
    private AddBookWindow addBookWindow;

    public AddBookActionListener(DefaultListModel<Book> listModel, AddBookWindow addBookWindow) {
        this.listModel = listModel;
        this.addBookWindow = addBookWindow;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Book book = addBookWindow.createBook();
       if (book.getAuthor()!=null){
           listModel.addElement(book);
           addBookWindow.setVisible(false);
       }else {
           addBookWindow.showAlert("brak autora");
       }

    }
}
