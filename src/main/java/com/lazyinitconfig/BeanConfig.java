package com.lazyinitconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

  
@Configuration
@ComponentScan("com.lazyinitconfig")
public class BeanConfig {
      
  @Bean(name="a")
  @Lazy(true)

    public A displayName(){
        A a=new A();
        a.setName("anu");
      
        return a;
    }
   @Bean
    public B displayAge(){
        B b=new B();
        b.setAge(10);
        b.getAge();
        return b;
    }
}
