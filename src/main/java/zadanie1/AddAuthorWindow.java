package zadanie1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class AddAuthorWindow extends JFrame {
    private JTextField firstNameField = new JTextField(10);
    private JTextField lastNameField = new JTextField(10);
    private JButton addAuthorButton = new JButton("Add Author");

    public AddAuthorWindow() throws HeadlessException {
        super("Author add");
        JLabel nameLabel = new JLabel("Name: ");
        JLabel lastNameLabel = new JLabel("Last name: ");
        setSize(500, 500);

        setLayout(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();
        gc.anchor = GridBagConstraints.LINE_END;
        gc.weightx = 0.5;
        gc.weighty = 0.5;
        gc.gridx = 0;
        gc.gridy = 0;
        add(nameLabel, gc);
        gc.gridx = 0;
        gc.gridy = 1;
        add(lastNameLabel, gc);

        gc.anchor = GridBagConstraints.LINE_START;
        gc.gridx = 1;
        gc.gridy = 0;
        add(firstNameField, gc);

        gc.gridx = 1;
        gc.gridy = 1;
        add(lastNameField, gc);

        gc.gridx = 1;
        gc.gridy = 3;
        add(addAuthorButton, gc);
        addAuthorButton.addActionListener(e -> setVisible(false));


    }

    public void addButtonActionListener(ActionListener actionListener) {
        addAuthorButton.addActionListener(actionListener);
    }

    public Author createAuthor() {
        Author newAuthor = Authors.createAuthor(firstNameField.getText(), lastNameField.getText());
        return newAuthor;
        }


}
