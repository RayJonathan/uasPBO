package View;

import java.awt.event.*;
import javax.swing.*;

public class MenuLogin {
    public MenuLogin() {
        JFrame f = new JFrame("Menu Login");
        JLabel logoLabel = new JLabel("PT MAKMUER");

        JLabel usernameLabel = new JLabel("Username : ");
        JLabel passwordJLabel = new JLabel("Password : ");

        JTextField username = new JTextField();
        JPasswordField password = new JPasswordField();

        JButton back = new JButton("Back");
        JButton login = new JButton("Login");

        logoLabel.setBounds(20, 20, 150, 20);

        usernameLabel.setBounds(20, 40, 100, 30);
        passwordJLabel.setBounds(20, 70, 100, 30);

        username.setBounds(130, 40, 150, 30);
        password.setBounds(130, 70, 150, 30);
        logoLabel.setBounds(130, 20, 150, 20);

        back.setBounds(130, 120, 100, 20);
        login.setBounds(240, 120, 100, 20);

        f.add(logoLabel);
        f.add(usernameLabel);
        f.add(passwordJLabel);
        f.add(username);
        f.add(password);
        f.add(back);
        f.add(login);
        f.setSize(500, 300);
        f.setLayout(null);
        f.setVisible(true);

        back.addActionListener((ActionListener) new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                new MenuUtama();
            }
        });

    }
}
