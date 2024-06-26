package src.main.java.com.userdept.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GeneratedValue;
import javax.persistence.id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_department")
public class Department {

    @id
    @GeneratedValue(strategy = GenerationType.Identity)
    private Long id;
    private String name;

    public Department(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    

}
