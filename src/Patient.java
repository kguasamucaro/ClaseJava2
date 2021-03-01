public class Patient extends User {
    //Atributos
    /*int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;*/

    private String birthday;
    private double weight;
    private double height;
    private  String blood;

     //Metodo constructor sobrecargado
    Patient (String name, String email){
        super(name, email);
        //System.out.println("Los datos son: " + name + " , " + email + " , " + address + " , " + weight);
        //this.name = name;
        //this.email = email;
    }
   //Aqui se establecen las reglas del negocio NOOOO en el Main
    //Estos metodos GET y SET se encargan de validar los parametos o todo dato que se quiera asignar
    //El constructor se encarga de definir los parametros obligatorios para que el metodso exista

    public void setWeight(double weight){
        this.weight = weight;
    }

    public String getWeight() {
        return weight + " Kg.";
    }

    public String getHeight() {
        return this.height + " Mts.";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    /*public String getPhoneNumber() {
        if(phoneNumber.length() > 8){
            System.out.println("El numero telefonico debe ser de 8 caracteres");
        }else if (phoneNumber.length() == 8){
            return phoneNumber;
        }
          return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }*/

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }
}
