package test;

import org.example.Main;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
@ContextConfiguration(classes = Main.class)
class MainTest {
    @Test
    void contextLoads() {

    }
}