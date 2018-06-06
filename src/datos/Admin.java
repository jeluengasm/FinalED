
package datos;

/**
 *
 * @author Jhon E. Luengas
 */
public class Admin extends Usuario{
    
    private String user;
    private String pass;
    
    public Admin(String nombres, String apellidos, String codigo, String correo, String user, String pass) {
        super(nombres, apellidos, codigo, correo);
        this.pass = pass;
        this.user = user;
    }

    public String getUser() {
        return user;
    }

    public String getPass() {
        return pass;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    
    
}
