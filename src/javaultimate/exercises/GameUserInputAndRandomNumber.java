package exercises;


import java.util.Random;
import java.util.Scanner;

class Game{
    public int number;
    public int inputNumber;
    public int noOfGuessess;

    public int getNoOfGuessess(){
        return noOfGuessess;
    }

    public void setNoOfGuessess(int noOfGuessess) {
        this.noOfGuessess = noOfGuessess;
    }

    Game(){
        Random random = new Random();
        this.number = random.nextInt(100);
    }
    void takeUserInput(){
        System.out.print("Guess the number : ");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }
    boolean isCorrectNumber(){
        noOfGuessess++;
        if(inputNumber == number){
            System.out.format("yes you guessed it right : it was %d\n , you gussed it in %d attempt" , number,noOfGuessess);
            return true;
        }
        else if(inputNumber < number){
            System.out.println("Too low...");
        }
        else if(inputNumber > number){
            System.out.println("Too high...");
        }
        return false;
    }
}

public class GameUserInputAndRandomNumber {
    public static void main(String[] args) {
        Game g = new Game();
        boolean b = false;
        while (!b){
            g.takeUserInput();
            b = g.isCorrectNumber();
        }
    }
}
