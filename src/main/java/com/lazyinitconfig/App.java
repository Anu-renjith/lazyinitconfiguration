package com.lazyinitconfig;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
      AnnotationConfigApplicationContext ctx
      = new AnnotationConfigApplicationContext();
     ctx.register(BeanConfig.class);
     ctx.refresh();
  
         
     ctx.getBean(A.class);
  
     
    }
}
