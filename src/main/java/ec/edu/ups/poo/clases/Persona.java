package ec.edu.ups.poo.clases;

public class Persona {
    private String cedula;
    private String nombre;
    private String apellido;
    private String direccion;
    private String numero;
    private boolean familiar;

    //Como crear un constructor: 3 caracteristicas principales:
    //PUBLICOS siempre, no devuelven NADA, TIENEN QUE TENER EL MISMO NOMBRE QUE LA CLASE
    public Persona(String cedula, String nombre, String apellido, String direccion, String numero, boolean familiar) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.numero = numero;
        this.familiar = familiar;

    }

    public Persona() {
        //Para que funcione si tenemos los objetos vacios
    }


    public void setNombre(String nombre) { //Establece el nombre

        this.nombre = nombre;
    }


    public String getNombre() { //Regresa el valor al principal
        return nombre;
    }

    public void setCedula(String cedula) {

        this.cedula = cedula;
    }

    public String getCedula() { //Regresa el valor al principal
        return cedula;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() { //Regresa el valor al principal
        return apellido;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion() { //Regresa el valor al principal
        return direccion;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNumero() { // Regresa el valor al principal
        return numero;
    }

    public boolean setFamiliar(boolean familiar){
        this.familiar = familiar;
        return familiar;
    }

    public boolean getFamiliar(){
        return familiar;
    }
//Opcional override
    @Override
    public String toString(){
        return "Cedula: "+ cedula +
                ", Nombre : " + nombre +
                ", Apellido: " + apellido +
                ", Direccion: " + direccion +
                ", Numero: " + numero + "";
    }




    }



