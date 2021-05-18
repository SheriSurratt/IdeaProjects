package com.company.companyAddress;

public class Programmer {
    String name;

//   giving access to all other class objects
    Address programmerAddr;

    public Address getProgrammerAddr() {
        return programmerAddr;
    }

    public Programmer(String name, Address programmerAddr) {
        this.name = name;
        this.programmerAddr = programmerAddr;
        
    }

    public boolean getName() {
    }
}
