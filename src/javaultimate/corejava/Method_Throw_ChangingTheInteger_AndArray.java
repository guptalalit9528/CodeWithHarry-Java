package corejava;

public class Method_Throw_ChangingTheInteger_AndArray {

    //static method hai but no return type
    static void joke(){
        System.out.println("Jab static method ho but no return type ho tab call karne ka rule...");
    }

    //Integer
    static void change1(int a){
        a = 98;
    }

    //Array
    static void change2(int[] a){
        a[0] =98;
    }




    public static void main(String[] args) {

        //Call the static method but no return type
        joke();

        //Changing the Integer
        int x = 45;
        change1(x);
        System.out.println("\nInteger hai to koi change nahi hoga : "+x);

        //Changing the Array
        int[] arr = {34,65,76,87,32};
        change2(arr);
        System.out.println("\nArray ke case me change kr dega : "+arr[0]);
    }
}
