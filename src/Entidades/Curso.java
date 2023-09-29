/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import javax.swing.JOptionPane;

public class Curso {
    private String codigo;
    private String nombre;
    private Integer credito;
    private Profesor[] profesores;
    private Estudiante[] estudiantes;

    public Curso(String codigo, String nombre, Integer credito) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.credito = credito;
    }

    public Curso(Profesor[] profesores, Estudiante[] estudiantes) {
        this.profesores = new Profesor[2];
        this.estudiantes = new Estudiante[20];
    }
    public void agregarEstudiante(Estudiante estudiante){
        
        for (int i = 0; i < 30; i++) {
            if(estudiantes[i]==null){
                estudiantes[i]=estudiante;       
                return;
            }
        }
    }
    public void agregarProfesor(Profesor profesor){
        
        if(profesores[0]==null){
            profesores[0]=profesor;
        }else if(profesores[1]==null){
            profesores[1]=profesor;
        }else{
            JOptionPane.showMessageDialog(null, "Este curso ya ha llegado al "
                    + "limite de profesores",
                    "Agregar Profesor", JOptionPane.INFORMATION_MESSAGE); 
        }
        
    }  

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCredito() {
        return credito;
    }

    public void setCredito(Integer credito) {
        this.credito = credito;
    }

    public Profesor[] getProfesores() {
        return profesores;
    }

    public void setProfesores(Profesor[] profesores) {
        this.profesores = profesores;
    }

    public Estudiante[] getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(Estudiante[] estudiantes) {
        this.estudiantes = estudiantes;
    }
    
}
