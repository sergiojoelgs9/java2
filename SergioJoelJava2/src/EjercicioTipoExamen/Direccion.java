
package EjercicioTipoExamen;

class Direccion {
    
    private String calle;
    private String colonia;
    private String municipio;
    private int cp;
    private int numero;

    public Direccion() {
    }
  
    public Direccion(int cp) {
        this.cp = cp;
    }

    public Direccion(String municipio, int cp) {
        this.municipio = municipio;
        this.cp = cp;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
}
