public class CategoriasLibros{
    String nombreCategoria;
    public Lista_libros listaLibros;

    public CategoriasLibros(String nombre) {
        this.nombreCategoria = nombre;
        this.listaLibros = new Lista_libros();
    }

    //Metodos get
    public String getNombreCategoria(){
        return nombreCategoria;
    }

    public String getNombreLibro(int i) {
        return listaLibros.getnombresLibros(i);
    }

    public boolean getEstadoLibro(int i) {
        return listaLibros.getEstadosLibros(i);
    }

    public int getIDLibro(int i){
        return listaLibros.getIDlibros(i);
    }

    //Metodos set
    public void setEstadoLibro(int i,boolean estado){
        listaLibros.estadosLibros[i] = estado;
    }

    //Metodo para asignar los nombres,estados,IDs de la categoria terror
    public void inicializarCategoriaTerror(){
        listaLibros.nombresLibros = new String[]{"It","El resplandor","Dracula"
                ,"El exorcista","Misery"};
        listaLibros.estadosLibros = new boolean[]{false,false,false,false,false};
        listaLibros.ID_libros = new int []{111,222,333,444,555};
    }

    //Metodo para asignar los nombres,estados,IDs de la categoria novelas clasicas
    public void inicializarCategoriaNovelasClasicas(){
        listaLibros.nombresLibros = new String[]{"Moby-Dick","Crimen y castigo"
                ,"Hamlet","1984","Ulises"};
        listaLibros.estadosLibros = new boolean[]{false,false,false,false,false};
        listaLibros.ID_libros = new int []{123,456,789,890,988};
    }

    //Metodo para asignar los nombres,estados,IDs de la categoria ingenieria
    public void inicializarCategoriaIngenieria(){
        listaLibros.nombresLibros = new String[]{"Calculo","Estatica",
                "Termodinamica","Electronica","Dinamica"};
        listaLibros.estadosLibros = new boolean[]{false,false,false,false,false};
        listaLibros.ID_libros = new int []{111,222,333,444,555};
    }
}


