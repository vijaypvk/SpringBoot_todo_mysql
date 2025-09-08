package vijaypvk.dev.todo_mysql;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vijaypvk.dev.todo_mysql.models.todo;
@RestController
@RequestMapping("/api")
public class todocontroller {
    @Autowired
    private todoservice todoservice;
    @PostMapping("/createtodo")
    ResponseEntity<todo> createTodo(@RequestBody todo todo){
        return new ResponseEntity<>(todoservice.createTodo(todo),HttpStatus.CREATED);
      }

    @GetMapping("/gettodo/{id}") 
    ResponseEntity<todo> gettodo(@PathVariable Integer id){
        return new ResponseEntity<todo>(todoservice.gettodoid(id),HttpStatus.OK);
    }
    @GetMapping("/gettodo")
    ResponseEntity<List<todo>>getalltodo(){
        return new ResponseEntity<List<todo>>(todoservice.gettodo(),HttpStatus.OK);
    }
}
 