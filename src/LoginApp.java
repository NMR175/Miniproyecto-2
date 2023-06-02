//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class LoginApp{
    static JFrame loginFrame;
    static JFrame RegisterFrame;
    static Usuario clientUser;
    Usuario admin = new Usuario("admin", "padrenuestro123", 1);

    public LoginApp() {
    }

    public static void createLoginWindow() {

        loginFrame = new JFrame("Biblioteca aventurado");
        loginFrame.setSize(300, 300);
        loginFrame.setDefaultCloseOperation(3);
        JPanel panel = new JPanel();
        loginFrame.add(panel);
        panel.setLayout((LayoutManager)null);

        JLabel tittleLabel = new JLabel("iniciar sesion");
        tittleLabel.setBounds(75, 10, 150, 25);
        Font font = new Font("Arial", 1, 20);
        tittleLabel.setFont(font);
        panel.add(tittleLabel);

        JLabel userLabel = new JLabel("usuario: ");
        userLabel.setBounds(10, 70, 80, 25);
        panel.add(userLabel);
        JTextField usernameField = new JTextField(20);
        usernameField.setBounds(100, 70, 165, 25);
        panel.add(usernameField);

        JLabel passwordLabel = new JLabel("contraseña: ");
        passwordLabel.setBounds(10, 100, 80, 25);
        panel.add(passwordLabel);
        JPasswordField passwordField = new JPasswordField(20);
        passwordField.setBounds(100, 100, 165, 25);
        panel.add(passwordField);

        JLabel userTypeLabel = new JLabel("Tipo de usuario:");
        userTypeLabel.setBounds(10, 135, 100, 25);
        panel.add(userTypeLabel);

        String[] userTypes = new String[]{"Administrador", "Trabajador", "Cliente"};
        JComboBox<String> userTypeComboBox = new JComboBox(userTypes);
        userTypeComboBox.setBounds(110, 135, 145, 25);
        panel.add(userTypeComboBox);

        JButton loginButton = new JButton("ingresar");
        loginButton.setBounds(10, 200, 100, 25);
        panel.add(loginButton);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String passwords = new String(passwordField.getPassword());
                String userTypes = (String) userTypeComboBox.getSelectedItem();
                if(username.equals("admin") && passwords.equals("padrenuestro123") && userTypes.equals("Administrador") ){
                    MenuInter.openMenu();
                } else if (clientUser !=null  && username.equals(clientUser.nombre_usuario) && passwords.equals(clientUser.password) && userTypes.equals("Cliente")){
                    MenuInter.openMenu();
                }else{
                    JOptionPane.showMessageDialog(loginFrame, "Usuario/contraseña es incorrecta, intetalo denuevo","error usuario/contraseña",JOptionPane.ERROR_MESSAGE);
                }

            }
        });

        JButton registerButton = new JButton("registrarse");
        registerButton.setBounds(150, 200, 100, 25);
        panel.add(registerButton);
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RegisterUser();
            }
        });
        loginFrame.setVisible(true);

    }
        public static void RegisterUser(){

            RegisterFrame = new JFrame("Biblioteca aventurado");
            RegisterFrame.setSize(300, 300);
            RegisterFrame.setDefaultCloseOperation(3);
            JPanel panel = new JPanel();
            RegisterFrame.add(panel);
            panel.setLayout((LayoutManager)null);

            JLabel tittleLabel = new JLabel("Registrar");
            tittleLabel.setBounds(90, 10, 150, 25);
            Font font = new Font("Arial", 1, 20);
            tittleLabel.setFont(font);
            panel.add(tittleLabel);

            JLabel registeruserLabel = new JLabel("usuario: ");
            registeruserLabel.setBounds(10, 70, 80, 25);
            panel.add(registeruserLabel);
            JTextField registerusernameField = new JTextField(20);
            registerusernameField.setBounds(100, 70, 165, 25);
            panel.add(registerusernameField);

            JLabel registerpasswordLabel = new JLabel("contraseña: ");
            registerpasswordLabel.setBounds(10, 100, 80, 25);
            panel.add(registerpasswordLabel);
            JPasswordField registerpasswordField = new JPasswordField(20);
            registerpasswordField.setBounds(100, 100, 165, 25);
            panel.add(registerpasswordField);

            JButton crearButton = new JButton("Crear");
            crearButton.setBounds(90, 150, 100, 25);
            panel.add(crearButton);
            RegisterFrame.setVisible(true);
            crearButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String regisusername = registerusernameField.getText();
                    String regipassword = new String(registerpasswordField.getPassword());
                    if (regisusername.isEmpty() || regipassword.isEmpty()) {
                        JOptionPane.showMessageDialog(RegisterFrame, "Por favor completa todos los datos que faltan", "Error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        clientUser = new Usuario(regisusername, regipassword, 3);
                        JOptionPane.showMessageDialog(RegisterFrame, "Se ha registrado correctamente el usuario y contraseña", "Completado", JOptionPane.INFORMATION_MESSAGE);
                        RegisterFrame.dispose();
                    }
                }
            });
        }

    public static void main(String[] args) {

        createLoginWindow();
    }
}
