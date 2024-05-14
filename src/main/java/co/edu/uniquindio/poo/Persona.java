package co.edu.uniquindio.poo;

/*Creacion de la clase persona que se agrega en Vehiculo*/
public class Persona {
    private String nombre;
    private String cedula;
    private String telefono;
    private TipoPersona tipoPersona;

/*Constructor para la clase persona */
    public Persona(String nombre, String cedula, String telefono, TipoPersona tipoPersona) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.tipoPersona = tipoPersona;
    
    //aseerts
        assert nombre != null && !nombre.isBlank() : "La nombre no debe estar vacio y debe ser diferente de null";
        assert cedula != null && !cedula.isBlank() : "La cedula no debe estar vacio y debe ser diferente de null";
        assert telefono != null && !telefono.isEmpty() : "El modelo no debe estar vacio y debe ser diferente de null";
        assert tipoPersona != null : "El propietario debe existir";
    }

/*Getters y setters*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public TipoPersona getTipoPersona() {
        return tipoPersona;
    }

    public void setTipoPersona(TipoPersona tipoPersona) {
        this.tipoPersona = tipoPersona;
    }

//Método para obtener un empty en dado caso
    public boolean isEmpty(){
        return isEmpty();
    }

    
/*Método informacion*/
@Override
public String toString() {
    return "\n" + 
            "Nombre: " + nombre + "\n" + 
            "Cedula: " + cedula + "\n" +
            "Telefono:" + telefono + "\n" +
            "Tipo:" + tipoPersona + "\n";
}
}
