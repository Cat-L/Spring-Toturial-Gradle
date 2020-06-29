package edu.snnu.ccs.Springbootdemo;

        import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;
        import org.springframework.boot.web.reactive.context.ConfigurableReactiveWebApplicationContext;
        import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootdemoApplication {

    public static void main(String[] args) {
//        ConfigurableApplicationContext applicationContext =
                SpringApplication.run(SpringbootdemoApplication.class, args);
//        for(String name:applicationContext.getBeanDefinitionNames()){
//            System.out.println(name);
//        }
    }
}
