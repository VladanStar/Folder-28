
package singlton;


public class Singlton {

    public static void main(String[] args) {
        
        m1();
        m2();
        m3();
    }
    public static void m1(){
    Database db =  Database.getInstance();
    db.query("SELECT * FROM user");
    }
      
      public static void m3(){
    Database db = Database.getInstance();
    db.query("SELECT * FROM post");
    }
      
      public static void m2(){
    Database db = Database.getInstance();
    db.query("SELECT * FROM page");
    }
      
      
      
     
    
}
