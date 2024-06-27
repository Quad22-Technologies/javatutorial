package com.java.tutorial;

public class UserProfileRunner {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("What is the users first and last name? ");
        String name = input.nextLine();

        System.out.println("What is the users gmail? ");
        String gmail = input.nextLine();

        System.out.println("What is the users username? ");
        String username = input.nextLine();

        UserProfile one = new UserProfile();

        one.setFLname(name);
        one.setGmail(gmail);
        one.setUsername(username);
    }
}