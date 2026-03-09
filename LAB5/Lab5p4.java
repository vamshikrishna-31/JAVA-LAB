import java.lang.reflect.Method;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)

@interface Bullet{
 String str();
 double dbl();
}
class Lab5p4 {
	@Bullet(str="Manideep",dbl=18.10)
 public static void anyMethod(){
	try{
	Method mtd=Lab5p4.class.getMethod("anyMethod");

	Bullet b=mtd.getAnnotation(Bullet.class);
	
	System.out.println("string:"+b.str());
	System.out.println("double:"+b.dbl());
	}
	catch(NoSuchMethodException e){
	System.err.println("Method not found: " + e.getMessage());
	}

}
public static void main(String[] args){
anyMethod();
}
}


