package oops;

public class ThisKeywordUse {
    public static void main(String[] args) {

        ThisKeywordUse2 tk1 = new ThisKeywordUse2();
        //1 constractor chaining
        tk1.display();

        //3 this keyword return karne wale method ko call krna
        tk1.display();

        //2 this keyword parameterized constractor
        ThisKeywordUse2 tk2 = new ThisKeywordUse2(5, "Lalit");
        //System.out.println(tk2.getA()); //jab agar getter hai to tab use karenge ese
        tk2.display();
        // returnone method
        System.out.println(tk2.returnone());


        //use super keyword
        Student s = new Student();
        s.showNames();
        s.display();
    }

}
