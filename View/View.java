package View;

import Controller.*;
import javax.swing.*;

import java.awt.event.*;

public class View {
    DataTemp temp = new DataTemp();

    public static void menuRegistrasi() {
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

        registrasi.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

            }
        });

    }

    public static void menuLogin() {
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

    }

    public static void menuUtama() {

        JFrame f = new JFrame("Menu Utama");
        JButton login = new JButton("Login");
        JButton registrasi = new JButton("Registrasi");
        JButton dataPengguna = new JButton("Data Pengguna");
        login.setBounds(50, 100, 95, 30);
        registrasi.setBounds(150, 100, 95, 30);
        dataPengguna.setBounds(250, 100, 150, 30);
        f.add(login);
        f.add(registrasi);
        f.add(dataPengguna);
        f.setSize(500, 300);
        f.setLayout(null);
        f.setVisible(true);

    }

}
