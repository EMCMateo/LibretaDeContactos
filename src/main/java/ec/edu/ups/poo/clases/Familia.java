package ec.edu.ups.poo.clases;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Familia extends Persona{
    private String parentesco;
    private String tipoSangre;
    private GregorianCalendar fechaNac;
    private int edad;


    public Familia() {
    }
    public Familia(String cedula, String nombre, String apellido, String direccion, String numero,boolean familiar, String parentesco, String tipoSangre, GregorianCalendar fechaNac, int edad) {
        super(cedula, nombre, apellido, direccion, numero,familiar);
        this.fechaNac = fechaNac;
        this.parentesco = parentesco;
        this.tipoSangre = tipoSangre;
        this.edad = edad;

    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public GregorianCalendar getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(GregorianCalendar fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return edad;
    }


    public int calcularEdad(){

        if(fechaNac.get(Calendar.MONTH)>=3 && fechaNac.get(Calendar.DAY_OF_MONTH)>=27){
            edad = 2025 - fechaNac.get(Calendar.YEAR) - 1 ;
        }else{
            edad = 2025 - fechaNac.get(Calendar.YEAR);
        }
        return edad;
    }


    public String toString() {

        String datosPersona = super.toString();

        String datosFamilia =
                ", Parentesco: " + parentesco +
                ", Tipo de sangre: " + tipoSangre +
                ", Edad: " + calcularEdad();

        return datosPersona + datosFamilia;
    }

}
