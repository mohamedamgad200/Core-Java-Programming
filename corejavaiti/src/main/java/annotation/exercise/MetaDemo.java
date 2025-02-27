package annotation.exercise;

import annotation.example.Meta;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

@Author(authorName="Amgad")
public class MetaDemo {
    @Author(authorName = "Mohamed")
    public MetaDemo(){}
    @Author(authorName = "hema")
    public static void myMethod()
    {
        MetaDemo ob=new MetaDemo();
        try{
            Class<?>c=ob.getClass();
            Method m=c.getMethod("myMethod");
            Author a=m.getAnnotation(Author.class);
            System.out.println("Author name is "+a.authorName());
        }catch (NoSuchMethodException e)
        {
            System.out.println("Method not found");
        }
    }
    public static void myClass()
    {
        MetaDemo ob=new MetaDemo();
        try{
            Class<?>c=ob.getClass();
            Author a=c.getAnnotation(Author.class);
            System.out.println("Author name is "+a.authorName());
        }catch (Exception e)
        {
            System.out.println("Method not found");
        }
    }
    public static void myConstructor()
    {
        MetaDemo ob=new MetaDemo();
        try{
            Class<?>c=ob.getClass();
            Constructor co=c.getConstructor();
            Author a= (Author) co.getAnnotation(Author.class);
            System.out.println("Author name is "+a.authorName());
        }catch (Exception e)
        {
            System.out.println("Method not found");
        }
    }

    public static void main(String[] args) {
        myMethod();
        myClass();
        myConstructor();
    }

}
