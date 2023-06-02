
public class Lista_libros
{
    //Atributos
    public String[] nombresLibros;
    public boolean[] estadosLibros;
    public int[] ID_libros;


    //Metodos get
    public String getnombresLibros(int i){
        return nombresLibros[i];
    }

    public boolean getEstadosLibros(int i){
        return estadosLibros[i];
    }

    public int getIDlibros(int i){
        return ID_libros[i];
    }

}
