package Tema5.EjercicioEqualsCopia;

import java.util.Objects;

public class TelefonoMovil {

    String modelo;
    String numero;
    String codPais;
    Double peso;

    public TelefonoMovil(String modelo, Double peso, String numero, String codPais) {
        this.modelo = modelo;
        this.peso = peso;
        this.numero = numero;
        this.codPais = codPais;
    }

    public TelefonoMovil(TelefonoMovil otro){
        this.modelo = otro.modelo;
        this.peso = otro.peso;
        this.numero = otro.numero;
        this.codPais = otro.codPais;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("TelefonoMovil{");
        sb.append("modelo='").append(modelo).append('\'');
        sb.append(", numero='").append(numero).append('\'');
        sb.append(", codPais='").append(codPais).append('\'');
        sb.append(", peso=").append(peso);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TelefonoMovil that = (TelefonoMovil) o;
        return Objects.equals(modelo, that.modelo) && Objects.equals(numero, that.numero) && Objects.equals(codPais, that.codPais) && Objects.equals(peso, that.peso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelo, numero, codPais, peso);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCodPais() {
        return codPais;
    }

    public void setCodPais(String codPais) {
        this.codPais = codPais;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
}
