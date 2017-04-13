package aitc.Anatoli;

public class Main {

    public static void main(String[] args) {
        // write your code here

        System.out.println("Welcome to the Armenian - Indian training center");



        String[] name = {"Hovhannes", "Monika", "Anatoly", "Vache", "Sirun", "Araks", "Ashot"};
        String[] surnames = {"Gasparyan", "Margaryan", "Mayilyan", "Tserunyan", "Grigoryan", "Mirzoyan", "Vardnanyan"};

        String[] names = {};
        int length = name.length;

     for (int i = 0; i <= 7; i++){

        System.out.println("name;  " + names[i]);


    }

    int j = 0;
    while (j<length) {
        System.out.println("my surname:  " + surnames[j]);
        j++;

        if (5 == j)
            break;

    }
    String surname = surnames
   switch (surnames[i].charAt(0)){



        case "M":
            System.out.println(surnames[i] + "surname starts from the M letter");
                break;
        
        default:
            System.out.println("we love all our participant");
                break;


    }