package gb.lesson2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("gb.lesson2")
public class AppConfig {

    //4. При каждом запросе корзины из контекста, должна создаваться новая корзина.
    // Использовать scope prototype
    @Bean
    @Scope("prototype")
    public Cart cart() {
        return new Cart();
    }

    @Bean
    public ProductRepository productRepository() {
        return new ProductRepository();
    }
}