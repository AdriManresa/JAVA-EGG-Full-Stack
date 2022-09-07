package estancias.entidades;

;

import java.time.LocalDate;

public class casaFamilias {
    private int id;
    private String calle;
    private int numero;
    private int CP;
    private String ciudad;
    private String pais;
    private LocalDate fecha_desde;
    private LocalDate fecha_hasta;
    private int dias_minimo;
    private int dias_maximos;
    private double precio_habitacion_x_dia;
    private String tipo_vivivienda;

    public casaFamilias() {
    }

    public casaFamilias(int id, String calle, int numero, int CP, String ciudad, String pais, LocalDate fecha_desde, LocalDate fecha_hasta, int dias_minimo, int dias_maximos, double precio_habitacion_x_dia, String tipo_vivivienda) {
        this.id = id;
        this.calle = calle;
        this.numero = numero;
        this.CP = CP;
        this.ciudad = ciudad;
        this.pais = pais;
        this.fecha_desde = fecha_desde;
        this.fecha_hasta = fecha_hasta;
        this.dias_minimo = dias_minimo;
        this.dias_maximos = dias_maximos;
        this.precio_habitacion_x_dia = precio_habitacion_x_dia;
        this.tipo_vivivienda = tipo_vivivienda;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCP() {
        return CP;
    }

    public void setCP(int CP) {
        this.CP = CP;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public LocalDate getFecha_desde() {
        return fecha_desde;
    }

    public void setFecha_desde(LocalDate fecha_desde) {
        this.fecha_desde = fecha_desde;
    }

    public LocalDate getFecha_hasta() {
        return fecha_hasta;
    }

    public void setFecha_hasta(LocalDate fecha_hasta) {
        this.fecha_hasta = fecha_hasta;
    }

    public int getDias_minimo() {
        return dias_minimo;
    }

    public void setDias_minimo(int dias_minimo) {
        this.dias_minimo = dias_minimo;
    }

    public int getDias_maximos() {
        return dias_maximos;
    }

    public void setDias_maximos(int dias_maximos) {
        this.dias_maximos = dias_maximos;
    }

    public double getPrecio_habitacion_x_dia() {
        return precio_habitacion_x_dia;
    }

    public void setPrecio_habitacion_x_dia(double precio_habitacion_x_dia) {
        this.precio_habitacion_x_dia = precio_habitacion_x_dia;
    }

    public String getTipo_vivivienda() {
        return tipo_vivivienda;
    }

    public void setTipo_vivivienda(String tipo_vivivienda) {
        this.tipo_vivivienda = tipo_vivivienda;
    }

    @Override
    public String toString() {
        return "casaFamilias{" + "id=" + id + ", calle=" + calle + ", numero=" + numero + ", CP=" + CP + ", ciudad=" + ciudad + ", pais=" + pais + ", fecha_desde=" + fecha_desde + ", fecha_hasta=" + fecha_hasta + ", dias_minimo=" + dias_minimo + ", dias_maximos=" + dias_maximos + ", precio_habitacion_x_dia=" + precio_habitacion_x_dia + ", tipo_vivivienda=" + tipo_vivivienda + '}';
    }

    
}
