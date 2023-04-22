package co.istad.demothymeleaf.repository;

import co.istad.demothymeleaf.model.User;
import com.github.javafaker.Faker;
import jakarta.annotation.PostConstruct;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
@Getter
@Setter
public class StaticRepository {
    private Faker faker;

    @Autowired
    public void setFaker(Faker faker) {
        this.faker = faker;
    }
    private List<User> users;

    @PostConstruct
    void init() {
        users = new ArrayList<>(){{
           for(int i = 0; i<20; i++) {
                add(new User(UUID.randomUUID(), faker.book().author(), faker.name().username(), faker.name().title(), "AngkorWat.jpg","logo_md.png"));
            }
        }};
    }
}
