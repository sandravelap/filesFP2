package classes;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement(name="usuario")
@XmlType(propOrder = {"rol","nombre","password"})
public class User {
    private String rol;
    private String name;
    private String passwd;

    public User(String rol, String name, String passwd) {
        this.rol = rol;
        this.name = name;
        this.passwd = passwd;
    }

    public User() {
    }

    @XmlElement(name="rol")
    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @XmlElement(name="nombre")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name="password")
    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
}
