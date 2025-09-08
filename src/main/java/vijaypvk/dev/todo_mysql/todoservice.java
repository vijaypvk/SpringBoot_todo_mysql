package vijaypvk.dev.todo_mysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

// import jakarta.persistence.criteria.CriteriaBuilder.In;
import vijaypvk.dev.todo_mysql.models.todo;

@Service
public class todoservice {
    @Autowired
    private todorepo todorepo;
    
    public todo createTodo(todo todo){
        return todorepo.save(todo);

    }
    public todo gettodoid(Integer id){
        return todorepo.findById(id).orElseThrow(() -> new RuntimeException("todo not found"));
    }
    public List<todo> gettodo(){
        return todorepo.findAll();
    }
    
}