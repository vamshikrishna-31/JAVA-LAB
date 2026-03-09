import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)

@interface Bullet{
    String str();
    double dbl();
}

class Lab5p3 {

    @Bullet(str="Manideep", dbl=18.10)
    public static void anyMethod() throws NoSuchMethodException {

        Method mtd = Lab5p3.class.getMethod("anyMethod");

        Bullet b = mtd.getAnnotation(Bullet.class);

        System.out.println("string: " + b.str());
        System.out.println("double: " + b.dbl());
    }

    public static void main(String[] args) throws NoSuchMethodException {
        anyMethod();
    }
}
