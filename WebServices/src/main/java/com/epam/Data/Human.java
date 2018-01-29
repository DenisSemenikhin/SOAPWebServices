package com.epam.Data;

import javax.xml.bind.annotation.*;
import java.util.Date;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Human")
public class Human {
    @XmlElement(name = "fName")
    private String fName;
    @XmlElement(name = "lName")
    private  String lName;
    @XmlElement(name = "patronomyc")
    private  String patronomyc;
    @XmlElement(name = "birthDate")
    private  Date birthDate;

    public String getfName() {
        return fName;
    }


    public void setfName(String fName) {
        this.fName = fName;
    }


    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }


    public String getPatronomyc() {
        return patronomyc;
    }


    public void setPatronomyc(String patronomyc) {
        this.patronomyc = patronomyc;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

}
