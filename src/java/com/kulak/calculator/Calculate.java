package com.kulak.calculator;

public class Calculate {
    static final String HELP = "Welcome to app Calculator\n" +
            "Here you can evaluate expressions using such operations as +*/-:\n" +
            "F.e. 1+1 and press \"Enter\"\n" +
            "Number format is like only digits but you can use point\n" +
            "F.e. 1.0, 32312, 1323123123.31221\n"+
            "If you want to exit app type \"exit\"\n" +
            "If you want help type \"help\"\n" +
            "If you have some recommendations about improving this app\n" +
            "please write message to this email \"Kanstantsin_Kulak@epam.com\"";

    public static void main(String[] args) {
        System.out.println(HELP);
        while (true) {
            String[] parameters = ConsoleReader.readExpression(System.in);
            if (parameters.length == 3) {
                try {
                    System.out.println(Operation.execute(parameters));
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
