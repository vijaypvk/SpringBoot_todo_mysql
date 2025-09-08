package vijaypvk.dev.todo_mysql;

import vijaypvk.dev.todo_mysql.models.todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface todorepo extends JpaRepository<todo, Integer> {
}
