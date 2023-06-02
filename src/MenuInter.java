import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuInter extends LoginApp{
    public static JFrame menuFrame;
    public static void openMenu(){
        menuFrame = new JFrame("Menu ventana principal");
        menuFrame.setSize(300,300);
        menuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel =new JPanel();
        menuFrame.add(panel);
        panel.setLayout(null);

        JLabel welcomeLabel = new JLabel("bienvenido");
        welcomeLabel.setBounds(10,20,300,25);
        panel.add(welcomeLabel);

        JButton informeButton = new JButton("Informe");
        informeButton.setBounds(70, 60, 120, 25);
        panel.add(informeButton);

        JButton NewBibliotecario = new JButton("crear bibliotecario");
        NewBibliotecario.setBounds(70, 105, 120, 25);
        panel.add(NewBibliotecario);


        JButton categoriasButton = new JButton("Categorías");
        categoriasButton.setBounds(70, 150, 120, 25);
        panel.add(categoriasButton);


        JButton logoutButton = new JButton("Cerrar Sesión");
        logoutButton.setBounds(70, 190, 120, 25);
        logoutButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                menuFrame.dispose();
                LoginApp.loginFrame.setVisible(true);
            }
        });
        panel.add(logoutButton);
        menuFrame.setVisible(true);

        //Action Listener botones de seleccion

        categoriasButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Código a ejecutar cuando se produce el evento de acción
                if (clientUser.getNivel_acceso()==3){

                    categoriasUI interfaz = new categoriasUI();
                    interfaz.ventana();
                }

            }
        });

    }
    /*
    public static void createBibliotecario(){
        final JFrame createUserFrame = new JFrame("Crear Bibliotecario");
        createUserFrame.setSize(300, 200);
        createUserFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JPanel panel = new JPanel();
        createUserFrame.add(panel);
        panel.setLayout(null);
        ///////////datos del bibliotecario para registrarse correctamente/////////
        JLabel userLabel = new JLabel("Usuario:");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);
        final JTextField newUserField = new JTextField(20);
        newUserField.setBounds(100, 20, 165, 25);
        panel.add(newUserField);

        JLabel passwordLabel = new JLabel("Contraseña:");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);
        final JPasswordField newPasswordField = new JPasswordField(20);
        newPasswordField.setBounds(100, 50, 165, 25);
        panel.add(newPasswordField);

        JButton createUserButton = new JButton("Crear");
        createUserButton.setBounds(100, 120, 80, 25);
        createUserButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String NewUsername = newUserField.getText();
                String newPassword = new String((newPasswordField.getPassword()));
                if(NewUsername.isEmpty() || newPassword.isEmpty()){
                    JOptionPane.showMessageDialog(createUserFrame, "completa por favor todos los campos obligatorios ","completa los datos",JOptionPane.ERROR_MESSAGE);
                }else{

                }
            }
        });

    }*/
}
