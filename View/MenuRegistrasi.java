package View;

import java.awt.event.*;

import javax.swing.*;

public class MenuRegistrasi {
    public MenuRegistrasi() {
        JFrame f = new JFrame("Menu Registrasi");
        JLabel usernameLabel = new JLabel("Username : ");
        JLabel passwordJLabel = new JLabel("Password : ");
        JLabel emaiLabel = new JLabel("Email : ");
        JLabel jkJLabel = new JLabel("Jenis Kelamin : ");
        JTextField username = new JTextField();
        JPasswordField password = new JPasswordField();
        JTextField email = new JTextField();

        ButtonGroup jenisKelamin = new ButtonGroup();
        JRadioButton pria = new JRadioButton("Pria");
        JRadioButton wanita = new JRadioButton("Wanita");
        jenisKelamin.add(pria);
        jenisKelamin.add(wanita);

        JButton back = new JButton("Back");
        JButton registrasi = new JButton("Registrasi");

        usernameLabel.setBounds(20, 40, 100, 30);
        emaiLabel.setBounds(20, 70, 100, 30);
        passwordJLabel.setBounds(20, 100, 100, 30);
        jkJLabel.setBounds(20, 130, 100, 30);

        username.setBounds(130, 40, 150, 30);
        email.setBounds(130, 70, 150, 30);
        password.setBounds(130, 100, 150, 30);
        pria.setBounds(130, 130, 50, 30);
        wanita.setBounds(180, 130, 80, 30);

        back.setBounds(130, 170, 100, 20);
        registrasi.setBounds(240, 170, 100, 20);

        f.add(usernameLabel);
        f.add(passwordJLabel);
        f.add(emaiLabel);
        f.add(jkJLabel);

        f.add(pria);
        f.add(wanita);
        f.add(username);
        f.add(email);
        f.add(password);
        f.add(back);
        f.add(registrasi);
        f.setSize(500, 300);
        f.setLayout(null);
        f.setVisible(true);

        registrasi.addActionListener((ActionListener) new ActionListener() {

            public void actionPerformed(ActionEvent e) {

            }
        });

    }
}
