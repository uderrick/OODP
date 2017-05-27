package handongplay3;




public abstract class Login extends MainProcess{


   abstract public void log(MainProcess main); 
   
   public Login(MainProcess main){
   
   this.main = main;
   
   }   
   
   
   private MainProcess main;
  
}
 