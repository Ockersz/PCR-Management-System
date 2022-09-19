/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author lihin
 */
public class Login {

    private String Name;
    private String Nid;
    private int Age;
    private String Contact;
    private String Address;
    private String Workrole;

    private String userName;
    private String Password;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getNid() {
        return Nid;
    }

    public void setNid(String Nid) {
        this.Nid = Nid;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String Contact) {
        this.Contact = Contact;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getWorkrole() {
        return Workrole;
    }

    public void setWorkrole(String Workrole) {
        this.Workrole = Workrole;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public Login() {

    }

    public Login(String username) {
        this.userName = username;

    }

    public Login(String username, String password) {

        this.userName = username;
        this.Password = password;

    }

   /* public Login(String name, String nid, int age, String contact, String address, String workrole) {

        this.Name = name;
        this.Nid = nid;
        this.Age = age;
        this.Contact = contact;
        this.Address = address;
        this.Workrole = workrole;

    }*/

    public Login(String username, String password, String name, String nid, int age, String contact, String address, String workrole) {

        this.userName = username;
        this.Password = password;
        this.Name = name;
        this.Nid = nid;
        this.Age = age;
        this.Contact = contact;
        this.Address = address;
        this.Workrole = workrole;

    }

}
