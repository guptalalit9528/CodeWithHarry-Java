package oops;
 class MyEmployee{
     private int id;
     String name;

     public int getId(){
         return id;
     }
     public void setId(int n){
         id = n;
     }

     public String getname(){
         return name;
     }
     public void setname(String n){
         name = n;
     }
 }


public class GetterAndSetter {
    public static void main(String[] args) {
        MyEmployee me = new MyEmployee();

        me.setId(23);
        me.setname("Lalit Gupta Ji");

        System.out.println(me.getId());
        System.out.println(me.getname());
    }

}
