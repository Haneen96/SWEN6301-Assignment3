package com.swen6301.builder;

import com.swen6301.builder.util.ValidationUtils;

public class Patient 
{
  
    private  String firstName; 
    private  String middleName; 
    private  String lastName; 
    private  int age; 
    private int weight;
    private String sex;
    private int height;
    private boolean organDonor;
    private String bloodType;
 
    private Patient(PatientBuilder builder) {
    	 this.firstName = builder.firstName;
    	 this.middleName = builder.middleName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.weight = builder.weight;
        this.sex = builder.sex;
        this.height = builder.height;
        this.organDonor = builder.organDonor;
        this.bloodType = builder.bloodType;
    }
    
    
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getMiddleName() {
        return middleName;
    }
    public int getAge() {
        return age;
    }
    public int getWeight() {
        return weight;
    }
    public String getSex() {
        return sex;
    }
    public int getHeight() {
        return height;
    }
    public boolean getOrganDonor() {
        return organDonor;
    }
    public String getBloodType() {
        return bloodType;
    }
  
    @Override
    public String toString() {
        return "Patient: "+this.firstName+", "+this.middleName+", "+this.lastName+", "+this.age+", "+this.weight
        		+", "+this.sex+", "+this.height+", "+this.organDonor+", "+this.bloodType+".";
    }
 
    public static class PatientBuilder 
    {
    	private  String firstName; 
        private  String middleName; 
        private  String lastName; 
        private  int age; 
        private int weight;
        private String sex;
        private int height;
        private boolean organDonor;
        private String bloodType;

        public PatientBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        
        public PatientBuilder setMiddleName(String middleName) {
            this.middleName = middleName;
            return this;
        }
        
        public PatientBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        
        public PatientBuilder setAge(int age) {
            this.age = age;
            return this;
        }
        
        public PatientBuilder setWeight(int weight) {
            this.weight = weight;
            return this;
        }
        
        public PatientBuilder setSex(String sex) {
            this.sex = sex;
            return this;
        }
        
        public PatientBuilder setHeight(int height) {
            this.height = height;
            return this;
        }
    
        public PatientBuilder setOrganDonor(boolean organDonor) {
            this.organDonor = organDonor;
            return this;
        }
        
        public PatientBuilder setBloodType(String bloodType) {
            this.bloodType = bloodType;
            return this;
        }
        
        //Return the finally constructed Patient object
        public Patient build() {
        	Patient patient =  new Patient(this);
            return patient;
        }
    }
}