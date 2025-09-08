package vijaypvk.dev.todo_mysql.models;

import jakarta.persistence.Entity;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data 

public class todo {
    @Id
    @GeneratedValue
    private Integer id;
    String title;
    String description;
    String status;    
}

