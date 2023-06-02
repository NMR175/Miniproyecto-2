import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.EmptyBorder;


public class categoriasUI  extends LoginApp{


    //Creo un objeto e inicializo los atributos para ese objeto basandome en la categoria
    static CategoriasLibros categoriaTerror = new CategoriasLibros("Terror");
    static CategoriasLibros categoriaNovelasClasicas = new CategoriasLibros("Novelas Clasicas");

    static CategoriasLibros categoriaIngenieria = new CategoriasLibros("Ingenieria");


    public categoriasUI(){
        //Inicializo los atributos de cada una de las categorias
        categoriaTerror.inicializarCategoriaTerror();
        categoriaNovelasClasicas.inicializarCategoriaNovelasClasicas();
        categoriaIngenieria.inicializarCategoriaIngenieria();
    }

    public static void ventana(){


        //Crear el marco de la ventana
        JFrame Ventana = new JFrame("Categorias");
        Ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Ventana.setSize(400,300);

        //Crear un panel
        JPanel panel = new JPanel();

        //Asignacion del layaout que permite administrar el espacio
        //En donde se estaran colocando cada uno de los botones
        panel.setLayout(new BorderLayout());

        // Espacio alrededor del panel
        panel.setBorder(new EmptyBorder(15, 15, 15, 15));

        //Botones
        JButton boton1 = new JButton("Terror");
        JButton boton2 = new JButton("Novelas clasicas");
        JButton boton3 = new JButton("Ingenieria");

        // Establecer el tamaño máximo para los botones
        Dimension buttonSize = new Dimension(100, 80);
        boton1.setPreferredSize(buttonSize);
        boton2.setPreferredSize(buttonSize);
        boton3.setPreferredSize(buttonSize);

        //Ubicacion de los botones en el panel
        panel.add(boton1, BorderLayout.PAGE_START);
        panel.add(boton2, BorderLayout.CENTER);
        panel.add(boton3, BorderLayout.PAGE_END);

        //Acciones de los botones
        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int categoriaIniciada = 1;
                ventanaLibrosCategoria(categoriaIniciada);
            }
        });

        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int categoriaIniciada = 2;
                ventanaLibrosCategoria(categoriaIniciada);
            }
        });

        boton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int categoriaIniciada = 3;
                ventanaLibrosCategoria(categoriaIniciada);

            }
        });



        //Se añade el panel a la ventana y se centra cuando se ejecute
        Ventana.getContentPane().add(panel);
        Ventana.setLocationRelativeTo(null);

        //Hacer visible la Ventana o el frame
        Ventana.setVisible(true);


    }


    private static void ventanaLibrosCategoria(int categoria){

        JFrame VentanaLibros = new JFrame("Libros");

        //Tamaño de la ventana y que no se cierre el programa cuando se cierre una ventana
        VentanaLibros.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        VentanaLibros.setSize(400,300);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBorder(new EmptyBorder(10, 10, 10, 10));


        //Boton para el estado de los libros
        JButton botonEstadosLibros = new JButton("Estado de los libros");
        botonEstadosLibros.setSize(100, 50);
        panel.add(botonEstadosLibros,BorderLayout.SOUTH);




        //Botones para la seleccion de un libro
        JButton boton1 = new JButton("Seleccionar");
        boton1.setSize(50, 50);

        JButton boton2 = new JButton("Seleccionar");
        boton1.setSize(50, 50);

        JButton boton3 = new JButton("Seleccionar");
        boton1.setSize(50, 50);

        JButton boton4 = new JButton("Seleccionar");
        boton1.setSize(50, 50);

        JButton boton5 = new JButton("Seleccionar");
        boton1.setSize(50, 50);





        //Etiquetas
        JLabel etiqueta1 = new JLabel("Lista de libros");
        etiqueta1.setHorizontalAlignment(JLabel.CENTER);
        etiqueta1.setVerticalAlignment(JLabel.TOP);
        etiqueta1.setFont(new Font("Arial", Font.BOLD, 20));

        JLabel etiqueta2 = new JLabel("1");
        etiqueta2.setFont(new Font("Arial", Font.BOLD, 15));

        JLabel etiqueta3 = new JLabel("2");
        etiqueta3.setFont(new Font("Arial", Font.BOLD, 15));

        JLabel etiqueta4 = new JLabel("3");
        etiqueta4.setFont(new Font("Arial", Font.BOLD, 15));

        JLabel etiqueta5 = new JLabel("4");
        etiqueta5.setFont(new Font("Arial", Font.BOLD, 15));

        JLabel etiqueta6 = new JLabel("5");
        etiqueta6.setFont(new Font("Arial", Font.BOLD, 15));



        //Tipo de letra para las cajas de texto
        Font tipoLetra = new Font("Arial", Font.BOLD, 13);

        //Cajas de texto
        int posicion1=0;
        JTextField libro1 = new JTextField();
        libro1.setEditable(false);

        int posicion2=1;
        JTextField libro2 = new JTextField();
        libro2.setEditable(false);

        int posicion3=2;
        JTextField libro3 = new JTextField();
        libro3.setEditable(false);

        int posicion4=3;
        JTextField libro4 = new JTextField();
        libro4.setEditable(false);

        int posicion5=4;
        JTextField libro5 = new JTextField();
        libro5.setEditable(false);

        //Condicionales para asignar los libros a cada una de las etiquetas
        if (categoria == 1){







            //Accion para los botones de seleccionar
            ActionListener actionListener = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    boolean estado = true;

                    //Las acciones de los botones estaran separadas por categorias

                    JButton botonPresionado = (JButton) e.getSource();



                    //Asignacion de la accion que ejecutara un boton presionado en especifico
                    //En este caso cuando un boton es presionado y el estado de libro es falso se mostrara un mensaje
                    //en el que se muestre que el libro ha sido seleccionado, en caso de que el estado sea true
                    //se mostrara un mensaje en pantalla diciendo que el libro no esta disponible
                    if (botonPresionado == boton1 && categoriaTerror.getEstadoLibro(posicion1) == !estado){
                        categoriaTerror.setEstadoLibro(posicion1,estado);
                        JOptionPane.showMessageDialog(null, "Has seleccionado el libro");
                        //Adiciono el ID del libro al usuario
                        clientUser.ID_libros_usuario.add(categoriaTerror.getIDLibro(posicion1));

                    }
                    else if (botonPresionado == boton1 && categoriaTerror.getEstadoLibro(posicion1) == estado){
                        JOptionPane.showMessageDialog(null, "El libro no esta disponible");
                    }

                    //Accion para el boton de la caja 2
                    else if(botonPresionado == boton2 && categoriaTerror.getEstadoLibro(posicion2) == !estado){
                        categoriaTerror.setEstadoLibro(posicion2,estado);
                        JOptionPane.showMessageDialog(null, "Has seleccionado el libro");
                        //Adiciono el ID del libro al usuario
                        clientUser.ID_libros_usuario.add(categoriaTerror.getIDLibro(posicion2));
                    }
                    else if (botonPresionado == boton2 && categoriaTerror.getEstadoLibro(posicion2) == estado){
                        JOptionPane.showMessageDialog(null, "El libro no esta disponible");
                    }

                    //Accion para el boton de la caja 3
                    else if(botonPresionado == boton3 && categoriaTerror.getEstadoLibro(posicion3) == !estado){
                        categoriaTerror.setEstadoLibro(posicion3,estado);
                        JOptionPane.showMessageDialog(null, "Has seleccionado el libro");
                        //Adiciono el ID del libro al usuario
                        clientUser.ID_libros_usuario.add(categoriaTerror.getIDLibro(posicion3));
                    }
                    else if (botonPresionado == boton3 && categoriaTerror.getEstadoLibro(posicion3) == estado){
                        JOptionPane.showMessageDialog(null, "El libro no esta disponible");
                    }

                    //Accion para el boton de la caja 4
                    else if(botonPresionado == boton4 && categoriaTerror.getEstadoLibro(posicion4) == !estado){
                        categoriaTerror.setEstadoLibro(posicion4,estado);
                        JOptionPane.showMessageDialog(null, "Has seleccionado el libro");
                        //Adiciono el ID del libro al usuario
                        clientUser.ID_libros_usuario.add(categoriaTerror.getIDLibro(posicion4));
                    }
                    else if (botonPresionado == boton4 && categoriaTerror.getEstadoLibro(posicion4) == estado){
                        JOptionPane.showMessageDialog(null, "El libro no esta disponible");
                    }

                    //Accion para el boton de la caja 5
                    else if(botonPresionado == boton5 && categoriaTerror.getEstadoLibro(posicion5) == !estado){
                        categoriaTerror.setEstadoLibro(posicion5,estado);
                        JOptionPane.showMessageDialog(null, "Has seleccionado el libro");
                        //Adiciono el ID del libro al usuario
                        clientUser.ID_libros_usuario.add(categoriaTerror.getIDLibro(posicion5));
                    }
                    else if (botonPresionado == boton5 && categoriaTerror.getEstadoLibro(posicion5) == estado){
                        JOptionPane.showMessageDialog(null, "El libro no esta disponible");
                    }

                    else if(botonPresionado == botonEstadosLibros){
                        ventanaEstadosLibros(categoria,categoriaTerror);

                    }
                }
            };

            //Asignacion de los nombres de los libros a cada una de las etiquetas
            libro1.setText(categoriaTerror.getNombreLibro(posicion1));
            libro1.setFont(tipoLetra);
            boton1.addActionListener(actionListener);


            libro2.setText(categoriaTerror.getNombreLibro(posicion2));
            libro2.setFont(tipoLetra);
            boton2.addActionListener(actionListener);

            libro3.setText(categoriaTerror.getNombreLibro(posicion3));
            libro3.setFont(tipoLetra);
            boton3.addActionListener(actionListener);

            libro4.setText(categoriaTerror.getNombreLibro(posicion4));
            libro4.setFont(tipoLetra);
            boton4.addActionListener(actionListener);

            libro5.setText(categoriaTerror.getNombreLibro(posicion5));
            libro5.setFont(tipoLetra);
            boton5.addActionListener(actionListener);

            botonEstadosLibros.addActionListener(actionListener);







        }
        else if (categoria == 2){


            //Accion para los botones de seleccionar
            ActionListener actionListener = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    boolean estado = true;



                    JButton botonPresionado = (JButton) e.getSource();

                    //Las acciones de los botones estaran separadas por categorias

                    //Asignacion de la accion que ejecutara un boton presionado en especifico
                    //En este caso cuando un boton es presionado y el estado de libro es falso se mostrara un mensaje
                    //en el que se muestre que el libro ha sido seleccionado, en caso de que el estado sea true
                    //se mostrara un mensaje en pantalla diciendo que el libro no esta disponible
                    if (botonPresionado == boton1 && categoriaNovelasClasicas.getEstadoLibro(posicion1) == !estado){
                        categoriaNovelasClasicas.setEstadoLibro(posicion1,estado);
                        JOptionPane.showMessageDialog(null, "Has seleccionado el libro");
                        //Adiciono el ID del libro al usuario
                        clientUser.ID_libros_usuario.add(categoriaNovelasClasicas.getIDLibro(posicion1));

                    }
                    else if (botonPresionado == boton1 && categoriaNovelasClasicas.getEstadoLibro(posicion1) == estado){
                        JOptionPane.showMessageDialog(null, "El libro no esta disponible");
                    }

                    //Accion para el boton de la caja 2
                    else if(botonPresionado == boton2 && categoriaNovelasClasicas.getEstadoLibro(posicion2) == !estado){
                        categoriaNovelasClasicas.setEstadoLibro(posicion2,estado);
                        JOptionPane.showMessageDialog(null, "Has seleccionado el libro");
                        //Adiciono el ID del libro al usuario
                        clientUser.ID_libros_usuario.add(categoriaNovelasClasicas.getIDLibro(posicion2));
                    }
                    else if (botonPresionado == boton2 && categoriaNovelasClasicas.getEstadoLibro(posicion2) == estado){
                        JOptionPane.showMessageDialog(null, "El libro no esta disponible");
                    }

                    //Accion para el boton de la caja 3
                    else if(botonPresionado == boton3 && categoriaNovelasClasicas.getEstadoLibro(posicion3) == !estado){
                        categoriaNovelasClasicas.setEstadoLibro(posicion3,estado);
                        JOptionPane.showMessageDialog(null, "Has seleccionado el libro");
                        //Adiciono el ID del libro al usuario
                        clientUser.ID_libros_usuario.add(categoriaNovelasClasicas.getIDLibro(posicion3));
                    }
                    else if (botonPresionado == boton3 && categoriaNovelasClasicas.getEstadoLibro(posicion3) == estado){
                        JOptionPane.showMessageDialog(null, "El libro no esta disponible");
                    }

                    //Accion para el boton de la caja 4
                    else if(botonPresionado == boton4 && categoriaNovelasClasicas.getEstadoLibro(posicion4) == !estado){
                        categoriaNovelasClasicas.setEstadoLibro(posicion4,estado);
                        JOptionPane.showMessageDialog(null, "Has seleccionado el libro");
                        //Adiciono el ID del libro al usuario
                        clientUser.ID_libros_usuario.add(categoriaNovelasClasicas.getIDLibro(posicion4));
                    }
                    else if (botonPresionado == boton4 && categoriaNovelasClasicas.getEstadoLibro(posicion4) == estado){
                        JOptionPane.showMessageDialog(null, "El libro no esta disponible");
                    }

                    //Accion para el boton de la caja 5
                    else if(botonPresionado == boton5 && categoriaNovelasClasicas.getEstadoLibro(posicion5) == !estado){
                        categoriaNovelasClasicas.setEstadoLibro(posicion5,estado);
                        JOptionPane.showMessageDialog(null, "Has seleccionado el libro");
                        //Adiciono el ID del libro al usuario
                        clientUser.ID_libros_usuario.add(categoriaNovelasClasicas.getIDLibro(posicion5));
                    }
                    else if (botonPresionado == boton5 && categoriaNovelasClasicas.getEstadoLibro(posicion5) == estado){
                        JOptionPane.showMessageDialog(null, "El libro no esta disponible");
                    }

                    else if(botonPresionado == botonEstadosLibros){
                        ventanaEstadosLibros(categoria,categoriaNovelasClasicas);

                    }
                }
            };

            //Asigno los nombres de los libros a cada una de las etiquetas
            libro1.setText(categoriaNovelasClasicas.getNombreLibro(posicion1));
            libro1.setFont(tipoLetra);
            libro2.setText(categoriaNovelasClasicas.getNombreLibro(posicion2));
            libro2.setFont(tipoLetra);
            libro3.setText(categoriaNovelasClasicas.getNombreLibro(posicion3));
            libro3.setFont(tipoLetra);
            libro4.setText(categoriaNovelasClasicas.getNombreLibro(posicion4));
            libro4.setFont(tipoLetra);
            libro5.setText(categoriaNovelasClasicas.getNombreLibro(posicion5));
            libro5.setFont(tipoLetra);

            //Asignacion de la accion a los botones
            boton1.addActionListener(actionListener);
            boton2.addActionListener(actionListener);
            boton3.addActionListener(actionListener);
            boton4.addActionListener(actionListener);
            boton5.addActionListener(actionListener);
            botonEstadosLibros.addActionListener(actionListener);
        }
        else if (categoria == 3){

            ActionListener actionListener = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    boolean estado = true;



                    JButton botonPresionado = (JButton) e.getSource();

                    //Las acciones de los botones estaran separadas por categorias

                    //Asignacion de la accion que ejecutara un boton presionado en especifico
                    //En este caso cuando un boton es presionado y el estado de libro es falso se mostrara un mensaje
                    //en el que se muestre que el libro ha sido seleccionado, en caso de que el estado sea true
                    //se mostrara un mensaje en pantalla diciendo que el libro no esta disponible
                    if (botonPresionado == boton1 && categoriaIngenieria.getEstadoLibro(posicion1) == !estado){
                        categoriaIngenieria.setEstadoLibro(posicion1,estado);
                        JOptionPane.showMessageDialog(null, "Has seleccionado el libro");
                        //Adiciono el ID del libro al usuario
                        clientUser.ID_libros_usuario.add(categoriaIngenieria.getIDLibro(posicion1));
                    }
                    else if (botonPresionado == boton1 && categoriaIngenieria.getEstadoLibro(posicion1) == estado){
                        JOptionPane.showMessageDialog(null, "El libro no esta disponible");
                    }

                    //Accion para el boton de la caja 2
                    else if(botonPresionado == boton2 && categoriaIngenieria.getEstadoLibro(posicion2) == !estado){
                        categoriaIngenieria.setEstadoLibro(posicion2,estado);
                        JOptionPane.showMessageDialog(null, "Has seleccionado el libro");
                        //Adiciono el ID del libro al usuario
                        clientUser.ID_libros_usuario.add(categoriaIngenieria.getIDLibro(posicion2));
                    }
                    else if (botonPresionado == boton2 && categoriaIngenieria.getEstadoLibro(posicion2) == estado){
                        JOptionPane.showMessageDialog(null, "El libro no esta disponible");
                    }

                    //Accion para el boton de la caja 3
                    else if(botonPresionado == boton3 && categoriaIngenieria.getEstadoLibro(posicion3) == !estado){
                        categoriaIngenieria.setEstadoLibro(posicion3,estado);
                        JOptionPane.showMessageDialog(null, "Has seleccionado el libro");
                        //Adiciono el ID del libro al usuario
                        clientUser.ID_libros_usuario.add(categoriaIngenieria.getIDLibro(posicion3));
                    }
                    else if (botonPresionado == boton3 && categoriaIngenieria.getEstadoLibro(posicion3) == estado){
                        JOptionPane.showMessageDialog(null, "El libro no esta disponible");
                    }

                    //Accion para el boton de la caja 4
                    else if(botonPresionado == boton4 && categoriaIngenieria.getEstadoLibro(posicion4) == !estado){
                        categoriaIngenieria.setEstadoLibro(posicion4,estado);
                        JOptionPane.showMessageDialog(null, "Has seleccionado el libro");
                        //Adiciono el ID del libro al usuario
                        clientUser.ID_libros_usuario.add(categoriaIngenieria.getIDLibro(posicion4));
                    }
                    else if (botonPresionado == boton4 && categoriaIngenieria.getEstadoLibro(posicion4) == estado){
                        JOptionPane.showMessageDialog(null, "El libro no esta disponible");
                    }

                    //Accion para el boton de la caja 5
                    else if(botonPresionado == boton5 && categoriaIngenieria.getEstadoLibro(posicion5) == !estado){
                        categoriaIngenieria.setEstadoLibro(posicion5,estado);
                        JOptionPane.showMessageDialog(null, "Has seleccionado el libro");
                        //Adiciono el ID del libro al usuario
                        clientUser.ID_libros_usuario.add(categoriaIngenieria.getIDLibro(posicion5));
                    }
                    else if (botonPresionado == boton5 && categoriaIngenieria.getEstadoLibro(posicion5) == estado){
                        JOptionPane.showMessageDialog(null, "El libro no esta disponible");
                    }

                    else if(botonPresionado == botonEstadosLibros){
                        ventanaEstadosLibros(categoria,categoriaIngenieria);

                    }
                }
            };

            //Asigno los nombres de los libros a cada una de las etiquetas
            libro1.setText(categoriaIngenieria.getNombreLibro(posicion1));
            libro1.setFont(tipoLetra);
            libro2.setText(categoriaIngenieria.getNombreLibro(posicion2));
            libro2.setFont(tipoLetra);
            libro3.setText(categoriaIngenieria.getNombreLibro(posicion3));
            libro3.setFont(tipoLetra);
            libro4.setText(categoriaIngenieria.getNombreLibro(posicion4));
            libro4.setFont(tipoLetra);
            libro5.setText(categoriaIngenieria.getNombreLibro(posicion5));
            libro5.setFont(tipoLetra);

            //Asignacion de la accion a los botones
            boton1.addActionListener(actionListener);
            boton2.addActionListener(actionListener);
            boton3.addActionListener(actionListener);
            boton4.addActionListener(actionListener);
            boton5.addActionListener(actionListener);
            botonEstadosLibros.addActionListener(actionListener);




        }



        JPanel etiquetasPanel = new JPanel();

        // 3 columnas, espacios horizontales y verticales de 15 píxeles
        etiquetasPanel.setLayout(new GridLayout(0, 3, 15, 15));

        etiquetasPanel.add(etiqueta2);
        etiquetasPanel.add(libro1);
        etiquetasPanel.add(boton1);

        etiquetasPanel.add(etiqueta3);
        etiquetasPanel.add(libro2);
        etiquetasPanel.add(boton2);


        etiquetasPanel.add(etiqueta4);
        etiquetasPanel.add(libro3);
        etiquetasPanel.add(boton3);


        etiquetasPanel.add(etiqueta5);
        etiquetasPanel.add(libro4);
        etiquetasPanel.add(boton4);


        etiquetasPanel.add(etiqueta6);
        etiquetasPanel.add(libro5);
        etiquetasPanel.add(boton5);




        //Añado las etiquetas al panel
        panel.add(etiqueta1, BorderLayout.NORTH);
        panel.add(etiquetasPanel, BorderLayout.CENTER);


        //Se añade el panel a la ventana y se centra cuando se ejecute
        VentanaLibros.getContentPane().add(panel);
        VentanaLibros.setLocationRelativeTo(null);



        //Hacer visible la Ventana o el frame
        VentanaLibros.setVisible(true);

    }

    public static void ventanaEstadosLibros(int categoria, CategoriasLibros objeto ){

        JFrame EstadosLibros = new JFrame("Estados libros");
        EstadosLibros.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        EstadosLibros.setSize(400,300);

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        //panel.setBorder(new EmptyBorder(15, 15, 15, 15));

        Font tipoLetra = new Font("Arial", Font.BOLD, 13);



            GridBagConstraints constraints = new GridBagConstraints();
            constraints.fill = GridBagConstraints.HORIZONTAL;
            constraints.insets = new Insets(16, 16, 16, 16);

            for (int i = 0; i < 5; i++) {

                JTextField cajaTexto = new JTextField(objeto.getNombreLibro(i));
                cajaTexto.setEditable(false);
                constraints.gridx = 0; // Columna izquierda
                constraints.gridy = i; // Fila

                cajaTexto.setFont(tipoLetra);
                panel.add(cajaTexto,constraints);
            }



            for (int i = 0; i < 5; i++) {

                String disponibilidad;

                if(objeto.getEstadoLibro(i) == false){

                    disponibilidad = "Disponible";
                }else{
                    disponibilidad = "No esta disponible";
                }

                JTextField cajaTexto2 = new JTextField(disponibilidad);
                cajaTexto2.setEditable(false);

                constraints.gridx = 1; // Columna derecha
                constraints.gridy = i; // Fila

                cajaTexto2.setFont(tipoLetra);
                panel.add(cajaTexto2,constraints);

            }



        EstadosLibros.getContentPane().add(panel);
        EstadosLibros.setLocationRelativeTo(null);
        EstadosLibros.setVisible(true);


    }

}
