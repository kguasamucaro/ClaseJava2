import org.w3c.dom.html.HTMLImageElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.concurrent.CopyOnWriteArrayList;

public class Doctor extends User{
    //Atributos : Lista para la receta
    /*private static  int id = 0; //Autoincrementa --> Debe ser STATIC para que se incremente asi se llame en otra clase, sino no lo hace.
    private String name;
    private String email;   //datos que se pueden repetir
    private String address;
    private String phoneNumber;*/


    private String speciality;
    private String pepe;

    //Metodo Constructor
    /*Doctor(){
        System.out.println("Construyendo el objeto doctor");
        id++;
    }*/

    Doctor (String name, String email){
        super(name, email);
        System.out.println( "nombre: " + name + " Y su edad es: " + email);
        this.speciality = speciality;
        }

  /* Doctor (String name){
        System.out.println("Nombre del doctor asignado es: " + name);
        this.pepe = name;
        this.name = name;
    }*/


    /*//Comportamientos . Metodo: La receta como tal o pasos de la receta
    public void showName(){
        System.out.println(name);
    }

    //Metodo de Id
    public void showId (){
        System.out.println("ID del Doctor es: " + id);
    }*/

    //Una clase es diferente a un objeto.
    //La clase es el molde pero el objeto sera el resultado de los atributos que se le colocaran (lo que cobre vida)

/*
    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Doctor.id = id;
    }*/

  /*  public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }*/

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getPepe() {
        return pepe;
    }


    //EJEMPLO DE CLASES ANIDADAS
    //Crear metodoa que reciba los parametros de la clase AvailableAppointment y va a añadir nuevas citas
    //Aqui crea el array o colecciones
    ArrayList<AvailableAppointment> availableAppointment = new ArrayList<>();
    public void addAvailableAppointment(Date date, String time){
        availableAppointment.add(new AvailableAppointment(date,time));
    }
    //Para devolver el array que se acaba de hacer
    public ArrayList<AvailableAppointment> getAvailableAppointment(){
        return availableAppointment;
    }

    //Avaiable appointmente -- Se creara como una clase que solo el doctor pueda hacer
    public static class AvailableAppointment {
        private int id;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }

}
