package md.tekwill.config;


import md.tekwill.beans.Canvas;
import md.tekwill.beans.Shape;
import md.tekwill.beans.Square;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// ca sa-i spunem lui Spring ca este classa pentru configurari, o anotam
@Configuration
@ComponentScan("md.tekwill.beans")
public class ProjectConfig {

    //creem o instanta si punem in context la Square
    @Bean
    public Shape shape(){ // trebuie sa ne returneze o instanta a unui obiect
        return new Square();
    }

    @Bean
    public Canvas canvas(){
        return new Canvas(shape());
    }
}
//avem doua Bean-uri in context