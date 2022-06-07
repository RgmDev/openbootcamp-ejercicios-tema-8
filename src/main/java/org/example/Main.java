package org.example;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setEdad(18);
        persona.setNombre("Ruben Glez");
        persona.setTelefono(666123123);
        System.out.println(persona.getEdad());
        System.out.println(persona.getNombre());
        System.out.println(persona.getTelefono());
    }
}

class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}