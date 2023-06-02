import java.util.ArrayList;
public class Usuario {

    //Atributos
    public String nombre_usuario;
    public String password;
    public int nivel_acceso;
    public  ArrayList<Integer> ID_libros_usuario;
    public Usuario(String NameUser, String contrasena, int levelacces){
        nombre_usuario = NameUser;
        password = contrasena;
        nivel_acceso = levelacces;
        ID_libros_usuario = new ArrayList<>();
       //Inicializo el arreglo con tamaño ocho el cual sera el limite de libros que podra llevar un cliente

    }
    //Metodo get
    public String getNombre_usuario(){
        return nombre_usuario;
    }
    public String getPassword(){
        return password;
    }
    public int getNivel_acceso(){
        return nivel_acceso;
    }


}