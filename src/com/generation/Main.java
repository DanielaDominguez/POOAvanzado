package com.generation;

import com.generation.banco.CuentaBancaria;
import com.generation.paquete2.Animal;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Ejercicio encapsulamiento
        Person person = new Person();
        person.setName("Santiago");
        person.setAge(33);
        person.setId("102045455");
        person.mostrarPerson();


        //System.out.println( "Name: " + person.getName());
        //System.out.println( "Age: "+ person.age);
        //System.out.println( "Id: " +  person.id);

        /*
        //CuentaBancaria
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.setNombre("Daniela Dominguez Peña");
        cuenta.setClave("ABC-100291");
        cuenta.setSaldo(1000000000);

        System.out.println(cuenta.getNombre());
        cuenta.mostrarSaldo();
         */

        /*
        //Animal
        Animal animal = new Animal();
        animal.nombre = "Iguana"; // no puede acceder porque esta dentro de otro paquete
        */

        /*
        //Persona
        Persona persona = new Persona();
        persona.nombre = "Daniela";
        persona.edad = 31;
        persona.

         */
    }
}