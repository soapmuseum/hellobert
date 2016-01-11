public class IfElse {
   public static void main(String[] args) {
      String strOrig = "Hello world ,Hello Asshole";
      int lastIndex = strOrig.lastIndexOf("Asshole");
      if(lastIndex == - 1){
         System.out.println("Hello not found");
      }else{
         System.out.println("Last occurrence of Asshole is at index "+ lastIndex);
      }
   }
}
