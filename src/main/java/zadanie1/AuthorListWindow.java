package zadanie1;

import javax.swing.*;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionListener;

public class AuthorListWindow extends JFrame {
    private JList<Author> authorJList = new JList<>();
    private DefaultListModel<Author> authorListModel = new DefaultListModel<>();
    private JButton addAuthorButton = new JButton("Add Author");
    private AddAuthorWindow addAuthorWindow = new AddAuthorWindow();

    public AuthorListWindow() throws HeadlessException {
        authorJList.setModel(authorListModel);
        setLayout(new GridBagLayout());
        setSize(700,500);
        setLocation(150,170);
        add(authorJList);
        add(addAuthorButton);
        addAuthorButton.addActionListener(e -> addAuthorWindow.setVisible(true));
      addAuthorWindow.addButtonActionListener(new AddAuthorActionListener(addAuthorWindow, authorListModel));

    }
    public Author getSelectedAuthor (){
        return authorJList.getSelectedValue();
    }
    public void addButtonActionListener (ActionListener actionListener){

    }
    public void addSelectionActionListener (ListSelectionListener listSelectionListener){

    }
}
