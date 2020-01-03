package task5.task51.model.entity;

import java.util.Date;

public class Student {
    private static int index = 0;
    private int id;
    private String name;
    private String surname;
    private Date birth;
    private long phone;
    private String address;

    {
        id=++index;
    }

    public Student() {
    }

    public Student(String name, String surname, Date birth, long phone, String address) {
        this.name = name;
        this.surname = surname;
        this.birth = birth;
        this.phone = phone;
        this.address = address;
    }

    public int getId() {
        return id;
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

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (id != student.id) return false;
        if (phone != student.phone) return false;
        if (!name.equals(student.name)) return false;
        if (!surname.equals(student.surname)) return false;
        if (!birth.equals(student.birth)) return false;
        return address.equals(student.address);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + name.hashCode();
        result = 31 * result + surname.hashCode();
        result = 31 * result + birth.hashCode();
        result = 31 * result + (int) (phone ^ (phone >>> 32));
        result = 31 * result + address.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birth=" + birth +
                ", phone=" + phone +
                ", address='" + address + '\'' +
                '}';
    }
}
