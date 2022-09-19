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
public class Test {

    private String Name;
    private String Id;
    private String Gender;
    private int Age;
    private String Telephone;
    private String Address;
    private String SampleId;
    private String Status;
    private String Province;
    private String District;

    public Test() {
    }

    public Test(String sampleid, String name, String id, String gender, int age, String telephone, String address, String results,String province,String district) {

        this.Name = name;
        this.Id = id;
        this.Gender = gender;
        this.Age = age;
        this.Telephone = telephone;
        this.Address = address;
        this.SampleId = sampleid;
        this.Status = results;
        this.Province=province;
        this.District=district;
    }

    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return the Id
     */
    public String getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * @return the Gender
     */
    public String getGender() {
        return Gender;
    }

    /**
     * @param Gender the Gender to set
     */
    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    /**
     * @return the Age
     */
    public int getAge() {
        return Age;
    }

    /**
     * @param Age the Age to set
     */
    public void setAge(int Age) {
        this.Age = Age;
    }

    /**
     * @return the Telephone
     */
    public String getTelephone() {
        return Telephone;
    }

    /**
     * @param Telephone the Telephone to set
     */
    public void setTelephone(String Telephone) {
        this.Telephone = Telephone;
    }

    /**
     * @return the Address
     */
    public String getAddress() {
        return Address;
    }

    /**
     * @param Address the Address to set
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * @return the SampleId
     */
    public String getSampleId() {
        return SampleId;
    }

    /**
     * @param SampleId the SampleId to set
     */
    public void setSampleId(String SampleId) {
        this.SampleId = SampleId;
    }

    /**
     * @return the Status
     */
    public String getStatus() {
        return Status;
    }

    /**
     * @param Status the Status to set
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * @return the Province
     */
    public String getProvince() {
        return Province;
    }

    /**
     * @param Province the Province to set
     */
    public void setProvince(String Province) {
        this.Province = Province;
    }

    /**
     * @return the District
     */
    public String getDistrict() {
        return District;
    }

}
