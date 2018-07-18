package zadanie1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class AddBookWindow extends JFrame {
    private Author selectedAuthor = new Author();
    private JTextField bookTitleField = new JTextField(10);
    private JButton selectAuthorButton = new JButton("select author");
    private JButton addBookButton = new JButton("Add Book");
    private AuthorListWindow authorListWindow = new AuthorListWindow();

    public AddBookWindow() throws HeadlessException {
        super("Book ADD");
        JLabel titleLabel = new JLabel("Title: ");
        setSize(500, 500);
        add(bookTitleField);
        add(addBookButton);
        add(selectAuthorButton);
        selectAuthorButton.addActionListener(e -> authorListWindow.setVisible(true));
        setLayout(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();
        gc.anchor = GridBagConstraints.LINE_END;
        gc.weightx=0.5;
        gc.weighty=0.5;
        gc.gridx=0;
        gc.gridy=0;
        add(titleLabel,gc);

        gc.anchor=GridBagConstraints.LINE_START;
        gc.gridx = 1;
        gc.gridy = 0;
        add(bookTitleField, gc);

        gc.gridx=1;
        gc.gridy=2;
        add(selectAuthorButton, gc);

        gc.gridx=1;
        gc.gridy=3;
        add(addBookButton, gc);


       addButtonActionListener(e -> setVisible(false));
    }

    public void addButtonActionListener(ActionListener actionListener) {
        addBookButton.addActionListener(actionListener);
    }

    public Book createBook() {
        Author newAuthor = authorListWindow.getSelectedAuthor();
        Book newBook = Books.createBook(newAuthor, bookTitleField.getText());

        return newBook;
    }
    public void showAlert (String message){
        JOptionPane.showMessageDialog(this, message);
    }

}
