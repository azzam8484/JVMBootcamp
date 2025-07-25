package com.example.assignmentRest.Restful;
import org.springframework.stereotype.Component;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class UsersDao {
    private static List<Users> users=new ArrayList<>();

    private static int USERSCOUNT=1;
    static
    {
        users.add(new Users(++USERSCOUNT,"azzam", LocalDate.now().minusYears(30)));
        users.add(new Users(++USERSCOUNT,"prince", LocalDate.now().minusYears(20)));
        users.add(new Users(++USERSCOUNT,"shivam", LocalDate.now().minusYears(37)));
        users.add(new Users(++USERSCOUNT,"satwik", LocalDate.now().minusYears(31)));
    }

    public List<Users> findAll()
    {
        return users;
    }

    public void addUser(Users newUser)
    {
        users.add(newUser);
    }

    public void deleteById(int id) {
        Predicate<? super Users> predicate = user -> user.getId().equals(id);
        users.removeIf(predicate);
    }

    public Users findOne(int id) {
        Predicate<? super Users> predicate = user -> user.getId().equals(id);
        return users.stream().filter(predicate).findFirst().orElse(null);
    }
}
