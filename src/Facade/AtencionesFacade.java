package ec.edu.espol.mavenproject1;

/**
 *
 * @author ronal
 */
public class AtencionesFacade {
    private AtencionVirtual AtencionWeb;
    private AtencionVirtual AtencionMovil;
    private AtencionVirtual AtencionTelefono;
    
    public void atencionWeb() {
        AtencionVirtual web = new AtencionWeb();
        web.atencion();
    }
    
    public void atencionMovil() {
        AtencionVirtual movil = new AtencionMovil();
        movil.atencion();
    }
    
    public void atencionTelefono() {
        AtencionVirtual telefono = new AtencionTelefono();
        telefono.atencion();
    }
    
}
