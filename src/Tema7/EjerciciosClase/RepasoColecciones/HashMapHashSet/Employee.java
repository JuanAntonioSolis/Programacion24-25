package Tema7.EjerciciosClase.RepasoColecciones.HashMapHashSet;

import java.util.Objects;

public class Employee {
    enum Department {VENTAS, MARKETING, DESARROLLO, DIRECCION, RRHH}

    private Integer id;
    private String name;
    private String mail;
    private Department dpt;

    public Employee(Integer id, String name, String mail, Department dpt) {
        this.id = id;
        this.name = name;
        this.mail = mail;
        this.dpt = dpt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Department getDpt() {
        return dpt;
    }

    public void setDpt(Department dpt) {
        this.dpt = dpt;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Employee{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", mail='").append(mail).append('\'');
        sb.append(", dpt=").append(dpt);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

}
