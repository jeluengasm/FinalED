package datos;

/**
 *
 * @author Jhon E. Luengas
 */
public class Usuario {
    
    private String nombres;
    private String apellidos;
    private String codigo;
    private String correo;

    public Usuario(String nombres, String apellidos, String codigo, String correo) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.codigo = codigo;
        this.correo = correo;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }


}
