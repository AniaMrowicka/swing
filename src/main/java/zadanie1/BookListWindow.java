package zadanie1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class BookListWindow extends JFrame {
    private DefaultListModel<Book> bookListModel= new DefaultListModel<>();
    private JList <Book> bookList = new JList<>();
    private JButton addBookButton= new JButton("Add book");
    private AddBookWindow addBookWindow= new AddBookWindow();

    public BookListWindow() throws HeadlessException {
        JLabel nameLabel = new JLabel("List of books: ");
        nameLabel.setFont(new Font("Serif", Font.ITALIC, 22));
        bookList.setModel(bookListModel);
        setTitle("tytul");
        setLayout(new GridBagLayout());
        setSize(700,600);
        setLocation(150,170);
        add(bookList);
        add(addBookButton);
        setLayout(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();
        gc.weightx=0;
        gc.weighty=0;
        gc.anchor=GridBagConstraints.CENTER;
        gc.gridx=0;
        gc.gridy=0;
        add(nameLabel,gc);
        gc.anchor=GridBagConstraints.NORTH;
        gc.gridx=0;
        gc.gridy=1;
        add(bookList,gc);
        gc.anchor=GridBagConstraints.SOUTH;
        gc.gridx=0;
        gc.gridy=2;
        add(addBookButton,gc);

       addBookButton.addActionListener(e -> addBookWindow.setVisible(true));
       addBookWindow.addButtonActionListener(new AddBookActionListener(bookListModel,addBookWindow));
    }
}
