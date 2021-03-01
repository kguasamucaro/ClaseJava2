import javax.print.Doc;

import java.util.Date;

import static ui.UIMenu.*;

//construir un sistema que nos permita listar y agendar nuestras citas médicas, por lo que debemos crear
// algunas clases para cada integrante del sistema: doctores, pacientes, entre otras.

public class Main {
    public static void main(String[] args) {

        //Declarando un Objeto: clase nombreObjeto y se instancia el objeto
        Doctor myDoctor = new Doctor("Ileana", "ileanaxxxxx");
       //Doctor myDoctor = new Doctor();
        myDoctor.addAvailableAppointment (new  Date(), "4pm");
        myDoctor.addAvailableAppointment (new  Date(), "10am");
        myDoctor.addAvailableAppointment (new  Date(), "1pm");

        System.out.println(myDoctor.getAvailableAppointment());
        
        //Aqui se llama a una clase estatica

        for (Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointment()
             ) {
            System.out.println(aA.getDate() + " " + aA.getTime());
        }

        /*myDoctor.name = "Alejandro Perez";
        myDoctor.showName();
        myDoctor.showId();
        System.out.println(Doctor.id);

        //Si se altera la variable mediante el identidicador de otra clase, aumenta un valor y el siguiente seria 3
        Doctor.id++;

        Doctor myDoctorIle  = new Doctor();
        myDoctorIle.showId();
        System.out.println(Doctor.id);*/

        //UIMenu.showMenu(); //1era manera: Se puede llamar a traves de la clase
        //ui.UIMenu.showPatienMenu();

        //showMenu(); //2da manera: Es otra forma de llamar de una manera resumida usando el package con variables staticas


        /*Ejemplo de VARIABLES vs OBJETOS

        int i = 0;
        int b = 2;
        b = i;
        //b = 0
        String name = "Ann";

        Doctor myDoctor = new Doctor("ilena");
        Doctor myDoctor2 = new Doctor("Luis");

        System.out.println(myDoctor.getPepe());
        System.out.println(myDoctor2.getName());

        myDoctor2 = myDoctor; //Le estoy asignando el valor de doctor2 a doctor
        System.out.println(myDoctor.getName());
        System.out.println(myDoctor2.getName());

        myDoctor2.setName("Juan"); //Altero el valor del Doctor2, significa que ambos se van a alterar
        System.out.println(myDoctor.getName());
        System.out.println(myDoctor2.getName());*/


        /*Patient patient = new Patient( "Ile", "ile@gmail.com");
        //System.out.println(patient.name);
        patient.setWeight(54.6);
        System.out.println(patient.getWeight());

        patient.setHeight(1.60);
        System.out.println(patient.getHeight());

        patient.setPhoneNumber("12345678");  //Imprime mensaje si se coloca > 8 caracteres
        System.out.println(patient.getPhoneNumber());*/




    }
}
