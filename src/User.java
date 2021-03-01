public class User {
    private String name;  //Esta va hacer la SUPER CLAVE y la clase paciente y Doctor son las hijas
    private String email;
    private int id;
    private String address;
    private String phoneNumber;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
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
    }

    public String getPhoneNumber() {
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
}
