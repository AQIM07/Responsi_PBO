/**
 * Person
 */
public class Person {

    protected String name;
    protected String address;
    protected String hobi;


    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setHobi(String hobi) {
        this.hobi = hobi;
    }

    public void hobi() {
        System.out.println("Hobi saya: " + hobi);
    }

    public String getAddress() {
        return address;
    }

    public void identity(){
        System.out.println("Nama: " + name);
        System.out.println("Alamat: " + address);
    }

}


