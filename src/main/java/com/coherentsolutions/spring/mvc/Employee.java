package com.coherentsolutions.spring.mvc;

import com.coherentsolutions.spring.mvc.validation.CheckEmail;
import jakarta.validation.constraints.*;

import java.util.HashMap;
import java.util.Map;

public class Employee {
    @Size(min = 2, max = 50, message = "name must be minimum 2 symbols")
    private String name;
    //@NotNull(message = "surname is required field")
    //@NotEmpty(message = "surname is required field")
    @NotBlank(message = "surname is required field")
    private String surname;
    @Min(value = 500, message = "must be greater than 499")
    @Max(value = 1000, message = "must be less than 1001")
    private int salary;
    private String department;
    private Map<String,String> departments;
    private String carBrand;
    private Map<String,String> carBrands;
    private String[] languages;
    private Map<String,String> languageList;
    @CheckEmail(value = "abc.com", message = "email must end with abc.com")
    private String email;
    @Pattern(regexp = "\\d{3}-\\d{3}-\\d{3}", message = "please use pattern XXX-XXX-XXX")
    private String phoneNumber;

    public Employee() {
        departments = new HashMap<String,String>();
        departments.put("IT-map", "Information Technology-map");
        departments.put("HR-map", "Human Resources-map");
        departments.put("Sales-map","Sales-map");

        carBrands = new HashMap<String,String>();
        carBrands.put("BMW", "BMW");
        carBrands.put("Audi", "Audi");
        carBrands.put("Mercedes Benz","MB");

        languageList = new HashMap<>();
        languageList.put("English", "EN");
        languageList.put("German", "DE");
        languageList.put("French", "FR");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public Map<String, String> getCarBrands() {
        return carBrands;
    }

    public void setCarBrands(Map<String, String> carBrands) {
        this.carBrands = carBrands;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public Map<String, String> getLanguageList() {
        return languageList;
    }

    public void setLanguageList(Map<String, String> languageList) {
        this.languageList = languageList;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
