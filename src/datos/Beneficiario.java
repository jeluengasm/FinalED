package datos;

/**
 *
 * @author Jhon E. Luengas
 */
public class Beneficiario extends Usuario{
    
    private Horario horario;
    
    public Beneficiario(String nombres, String apellidos, String codigo, String correo, Horario horario) {
        super(nombres, apellidos, codigo, correo);
        this.horario = horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    public Horario getHorario() {
        return horario;
    }
    
}
