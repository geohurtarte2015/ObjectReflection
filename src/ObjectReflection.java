
import java.awt.Rectangle;
import java.lang.reflect.Field;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ObjectReflection {

  public static void main(String[] args) {
    Estado estado = new Estado("Activo");
    estado.setIdEstado(1);
    printEstado(estado); 
  }
  public static void printEstado(Object r) {
    Field[] arrayFields = new Field[2];
    Object[] arrayObjects = new Object[2];
    
    Integer heightValue;
    Object descripcion;
    Object id;
    Class c = r.getClass();
    try {
      Field[] array = c.getFields();
      
      arrayFields[0] = c.getField(array[0].getName());      
      arrayFields[1] = c.getField(array[1].getName());
      
      arrayObjects[0] =  arrayFields[0].get(r); 
      arrayObjects[1] =  arrayFields[1].get(r); 
      
      System.out.println(array[0].getName()+ " "+ arrayObjects[0]);
      System.out.println(array[1].getName()+" "+ arrayObjects[1]);
      
      //heightValue = (Integer) heightField.get(r);
      //System.out.println("Height: " + heightValue.toString());
    
    } catch (SecurityException e) {
      System.out.println(e);
    }catch (NoSuchFieldException ex) {
          Logger.getLogger(ObjectReflection.class.getName()).log(Level.SEVERE, null, ex);
      } catch (IllegalArgumentException ex) {
          Logger.getLogger(ObjectReflection.class.getName()).log(Level.SEVERE, null, ex);
      } catch (IllegalAccessException ex) {
          Logger.getLogger(ObjectReflection.class.getName()).log(Level.SEVERE, null, ex);
      } 
  }
 } 
    
         
    