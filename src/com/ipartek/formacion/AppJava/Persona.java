package com.ipartek.formacion.AppJava;
/**
 * <ol>
 * 	<li>Nombre (Obligatorio)</li>
 * 	<li>apellido1</li>
 * 	<li>apellido2</li>
 * 	<li>dni</li>
 * </ol>
 * @author Curso
 *
 */
public class Persona {
	
	
	// Constantes para el rango de las notas
	public static final int NOTA_MINIMA = 0;
	public static final int NOTA_ACEPTADO = 5;
	public static final int NOTA_MAXIMA = 10;
	

	//atributos
	private String nombre, apellido1, apellido2, dni, email;
	private int nota;
	
	//constructor
	/**
	 * 
	 * @param nombre
	 * @param apellido1
	 * @param dni
	 */
	public Persona(String nombre, String apellido1, String dni) {
		super();
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = "";
		this.dni = dni;
		this.email = "";
		this.nota = NOTA_MINIMA;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getNota() {
		return nota;
	}

	/** 
	 * La <code>nota</code> esta comprendida entre 0 y 10<br>
	 * Si <code>nota</code> es menor que cero se asigna 0<br>
	 * Si <code>nota</code> es mayor que 10 se asigna 10<br>
	 * @param nota <code>int</code> nota del alumno
	 */
	public void setNota(int nota) {
		if(nota<0){
			nota=0;
		}
		
		else if(nota>10){
			nota=10;
		}
		this.nota=nota;
	}
	
	/**
	 * Una {@code Persona} es aceptada con un 5 o mas
	 * @return
	 */

	public boolean isAceptado() {
		boolean resul=false;
		if (this.nota >=NOTA_ACEPTADO){
			resul=true;
		}
		return resul;
	}


	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", dni=" + dni
				+ ", email=" + email + ", nota=" + nota + ", aceptado=" + isAceptado() + "]";
	}
	
	
}
