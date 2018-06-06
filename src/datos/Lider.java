
package datos;

/**
 *
 * @author Jhon E. Luengas
 */
public class Lider extends Usuario{
    
    private Horario horario;
    
    public Lider(String nombres, String apellidos, String codigo, String correo, Horario horario) {
        super(nombres, apellidos, codigo, correo);
        this.horario = horario;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }
    
    
    
}
