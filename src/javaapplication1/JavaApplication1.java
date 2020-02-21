
package javaapplication1;


public class JavaApplication1 {

  int add(int x,int y){
      return x+y;
  
    }
   float devide(int x,int y) 
           throws RuntimeException {
       if (y==0){
           throw new RuntimeException("ArithmeticException");
       }
       else  {
       return (float) x/y;
   }
}
}
