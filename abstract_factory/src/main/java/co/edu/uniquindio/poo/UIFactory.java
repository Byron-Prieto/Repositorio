package co.edu.uniquindio.poo;

    public class UIFactory{
        public static Object createButton(String OS){
            if(OS == "Windows"){
                return new WindowsButton();
            }
            else if(OS == "Mac"){
                return new MacButton();
            }
            else{
                throw new IllegalArgumentException("OS desconocido");
            }
        }
      
    

    public static Object createTextButton(String OS){

          if(OS.equals("Windoes")){
            return new WindowsButton();
          }
          else if(OS.equals("Mac")){
            return new MacButton();
          }
          else{
            throw new IllegalArgumentException("OS desconocido");
          }
    }
}
    

    

    

