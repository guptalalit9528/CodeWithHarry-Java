package challenge;

class Employee{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n){
        name = n;
    }
}


public class PracticeMethodOOps {
    public static void main(String[] args) {

        Employee lalit = new Employee();

        lalit.setName("Lalit");
        lalit.salary = 23;

        System.out.println(lalit.getName());
        System.out.println(lalit.getSalary());

    }
}
