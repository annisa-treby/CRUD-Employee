package com.enigma.karyawan.entity;

import com.enigma.karyawan.enumeration.Gender;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Integer id;

    private String birthDate;
    private String name;

    @ManyToOne
    @JoinColumn(name = "position_id")
    private Position position;

    @Enumerated(EnumType.ORDINAL)
    private Gender gender;

    private Long idNumber;
    private Boolean isDelete;

    public Employee() {
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birth_date) {
        this.birthDate = birth_date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(Long idNumber) {
        this.idNumber = idNumber;
    }

    public Boolean getDelete() {
        return isDelete;
    }

    public void setDelete(Boolean delete) {
        isDelete = delete;
    }

    public Boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean is_delete) {
        this.isDelete = is_delete;
    }
}
