
package model;


public class Agenda {
    
    private int  id;
    
    private String Nombre;
    private String Apellido;
    private int fechaNacimiento;
 String Direccion;

    public Agenda() {
    }

    public Agenda(int id, String Nombre, String Apellido, int fechaNacimiento, String Direccion) {
        this.id = id;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.Direccion = Direccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(int fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return Direccion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Agenda{");
        sb.append("id=").append(id);
        sb.append(", Nombre=").append(Nombre);
        sb.append(", Apellido=").append(Apellido);
        sb.append(", fechaNacimiento=").append(fechaNacimiento);
        sb.append(", Direccion=").append(Direccion);
        sb.append('}');
        return sb.toString();
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
    
    
    
}
