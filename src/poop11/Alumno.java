/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop11;

/**
 *
 * @author poo01alu03
 */
public class Alumno {
    private String nombre;
    private String apNombre;
    private String apMaterno;
    private int numcuenta;
    private int edad;
    private float prom;
    
    public Alumno() {
    }
    
    public Alumno(String nombre, String apNombre, String apMaterno, int numcuenta, int edad, float prom) {
        this.nombre = nombre;
        this.apNombre = apNombre;
        this.apMaterno = apMaterno;
        this.numcuenta = numcuenta;
        this.edad = edad;
        this.prom = prom;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApNombre() {
        return apNombre;
    }

    public void setApNombre(String apNombre) {
        this.apNombre = apNombre;
    }

    public String getApMaterno() {
        return apMaterno;
    }

    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }

    public int getNumcuenta() {
        return numcuenta;
    }

    public void setNumcuenta(int numcuenta) {
        this.numcuenta = numcuenta;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getProm() {
        return prom;
    }

    public void setProm(float prom) {
        this.prom = prom;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apNombre=" + apNombre + ", apMaterno=" + apMaterno + ", numcuenta=" + numcuenta + ", edad=" + edad + ", prom=" + prom + '}';
    }
}
