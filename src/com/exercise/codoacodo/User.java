package com.exercise.codoacodo;

/*
*   Crear un programa en java en el cual se pida al usuario ingresar:
*       * nombre
*       * apellido
*       * edad
*       * hobbie
*       * editor de código preferido
*       * sistema operativo que utiliza
*   Luego deberá mostrarse por consola los datos ingresados.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class User {
    String nombre;
    String apellido;
    int edad;
    String hobbie;
    String editor;
    String distro;


    public User() {
    }

    public User(String nombre, String apellido, String hobbie, String editor, String distro, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.hobbie = hobbie;
        this.editor = editor;
        this.distro = distro;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getHobbie() {
        return hobbie;
    }

    public void setHobbie(String hobbie) {
        this.hobbie = hobbie;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public String getDistro() {
        return distro;
    }

    public void setDistro(String distro) {
        this.distro = distro;
    }

    @Override
    public String toString() {
        return "\nUser{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", hobbie='" + hobbie + '\'' +
                ", editor='" + editor + '\'' +
                ", distro='" + distro + '\'' +
                '}';
    }

    public static User userFromInput() {
        try  (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Ingrese nombre: ");
            String nombre = br.readLine();
            System.out.println("Ingrese apellido: ");
            String apellido = br.readLine();
            System.out.println("Ingrese edad: ");
            String edad = br.readLine();
            System.out.println("Ingrese hobbie: ");
            String hobbie = br.readLine();
            System.out.println("Ingrese editor de código preferido: ");
            String editor = br.readLine();
            System.out.println("Ingrese sistema operativo que utiliza: ");
            String distro = br.readLine();

            return new User(nombre, apellido, hobbie, editor, distro, Integer.parseInt(edad));

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}

