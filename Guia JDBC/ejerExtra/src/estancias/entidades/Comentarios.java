package estancias.entidades;


public class Comentarios {
    private int id;
    private String mensaje;
    private casaFamilias casa;    

    public Comentarios() {
    }

    public Comentarios(int id, String mensaje, casaFamilias casa) {
        this.id = id;
        this.mensaje = mensaje;
        this.casa = casa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public casaFamilias getCasa() {
        return casa;
    }

    public void setCasa(casaFamilias casa) {
        this.casa = casa;
    }
    
    
}
