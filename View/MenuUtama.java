package View;

import javax.swing.*;

import java.awt.event.*;

public class MenuUtama {

    public MenuUtama() {

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

        login.addActionListener((ActionListener) new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                new MenuLogin();

            }
        });
        registrasi.addActionListener((ActionListener) new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                new MenuRegistrasi();
            }
        });

        dataPengguna.addActionListener((ActionListener) new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                new MenuLogin();

            }
        });

    }
}
