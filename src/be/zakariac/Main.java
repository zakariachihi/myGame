package be.zakariac;
import java.awt.*;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
    System.out.print("Choose a character name : ");

    Character character = new Character();
    character.setName(sc.nextLine());

    while (BlackListName.contains(character.name)){
        System.out.print("Choose another name pls: ");
        character.setName(sc.nextLine());
    }

    System.out.print("Choose your class : " );
    System.out.println("");
    ClassType.returnType();
    character.setType(sc.nextLine());

    while (!(ClassType.contains(character.Type))){
        System.out.print("Choose another Type of class: ");
        character.setType(sc.nextLine());
    }




    }

}


