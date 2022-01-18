package com.example.guilesson;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.ArrayList;

public class HelloController {

    public Button one;
    public Button two;
    public Button three;
    public Button four;
    public Button five;
    public Button six;
    public Button seven;
    public Button eight;
    public Button nine;
    public Button zero;
    public Button ac;
    public Button plus;
    public Button minus;
    public Button times;
    public Button divide;
    public Button decimal;
    public Button equal;
    public Label txt;
    public String numberBuilder = "";
    public ArrayList<Double> numbers = new ArrayList<>();
    public ArrayList<String> operators = new ArrayList<String>();

    private void removeZero(){
        if(numberBuilder.charAt(0) == '0'){
            numberBuilder = numberBuilder.substring(1);
        }
    }

    public void one() {
        numberBuilder += "1";
        removeZero();
        txt.setText(numberBuilder);
    }

    public void two() {
        numberBuilder += "2";
        removeZero();
        txt.setText(numberBuilder);
    }
    public void three() {
        numberBuilder += "3";
        removeZero();
        txt.setText(numberBuilder);
    }
    public void four() {
        numberBuilder += "4";
        removeZero();
        txt.setText(numberBuilder);
    }
    public void five() {
        numberBuilder += "5";
        removeZero();
        txt.setText(numberBuilder);
    }
    public void six() {
        numberBuilder += "6";
        removeZero();
        txt.setText(numberBuilder);
    }
    public void seven() {
        numberBuilder += "7";
        removeZero();
        txt.setText(numberBuilder);
    }
    public void eight() {
        numberBuilder += "8";
        removeZero();
        txt.setText(numberBuilder);
    }
    public void nine() {
        numberBuilder += "9";
        removeZero();
        txt.setText(numberBuilder);
    }
    public void zero() {
        numberBuilder += "0";
        removeZero();
        txt.setText(numberBuilder);
    }
    public void plus() {
        System.out.println(numberBuilder);
        double number = Double.parseDouble(numberBuilder);
        numberBuilder = "";
        numbers.add(number);
        operators.add("+");

    }
    public void minus() {
        System.out.println(numberBuilder);
        double number = Double.parseDouble(numberBuilder);
        numberBuilder = "";
        numbers.add(number);
        operators.add("-");

    }
    public void times() {
        System.out.println(numberBuilder);
        double number = Double.parseDouble(numberBuilder);
        numberBuilder = "";
        numbers.add(number);
        operators.add("*");
    }
    public void divide() {
        System.out.println(numberBuilder);
        double number = Double.parseDouble(numberBuilder);
        numberBuilder = "";
        numbers.add(number);
        operators.add("/");
    }
    public void equals() {
        System.out.println(numberBuilder);
        numbers.add(Double.parseDouble(txt.getText()));
        if(numbers.size()<2){
            return;
        }
        Double total = numbers.get(0);
        for(int i = 1; i < numbers.size(); i++){
            Double num = numbers.get(i);
            if (operators.get(i - 1).equals("+")){
                total += num;
            }
            else if(operators.get(i - 1).equals("-")){
                total -= num;
            }
            else if(operators.get(i - 1).equals("*")){
                total *= num;
            }
            else if(operators.get(i - 1).equals("/")){
                total /= num;
            }
        }
        String answer = Double.toString(total);
        txt.setText(answer);
        numberBuilder = answer;
        numbers.clear();
        operators.clear();
        
    }
    

    public void clear() {
        txt.setText("");
        numbers.clear();
        operators.clear();
    }

    public void decimal() {
        numberBuilder += ".";
        removeZero();
        txt.setText(numberBuilder);
    }


//        String current = txt.getText();
//        txt.setText(Double.toString(eval(current)));


//    public static double eval(final String str) {
//        return new Object() {
//            int pos = -1, ch;
//
//            void nextChar() {
//                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
//            }
//
//            boolean eat(int charToEat) {
//                while (ch == ' ') nextChar();
//                if (ch == charToEat) {
//                    nextChar();
//                    return true;
//                }
//                return false;
//            }
//
//            double parse() {
//                nextChar();
//                double x = parseExpression();
//                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
//                return x;
//            }
//
//            // Grammar:
//            // expression = term | expression `+` term | expression `-` term
//            // term = factor | term `*` factor | term `/` factor
//            // factor = `+` factor | `-` factor | `(` expression `)`
//            //        | number | functionName factor | factor `^` factor
//
//            double parseExpression() {
//                double x = parseTerm();
//                for (;;) {
//                    if      (eat('+')) x += parseTerm(); // addition
//                    else if (eat('-')) x -= parseTerm(); // subtraction
//                    else return x;
//                }
//            }
//
//            double parseTerm() {
//                double x = parseFactor();
//                for (;;) {
//                    if      (eat('*')) x *= parseFactor(); // multiplication
//                    else if (eat('/')) x /= parseFactor(); // division
//                    else return x;
//                }
//            }
//
//            double parseFactor() {
//                if (eat('+')) return parseFactor(); // unary plus
//                if (eat('-')) return -parseFactor(); // unary minus
//
//                double x;
//                int startPos = this.pos;
//                if (eat('(')) { // parentheses
//                    x = parseExpression();
//                    eat(')');
//                } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
//                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
//                    x = Double.parseDouble(str.substring(startPos, this.pos));
//                } else if (ch >= 'a' && ch <= 'z') { // functions
//                    while (ch >= 'a' && ch <= 'z') nextChar();
//                    String func = str.substring(startPos, this.pos);
//                    x = parseFactor();
//                    if (func.equals("sqrt")) x = Math.sqrt(x);
//                    else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
//                    else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
//                    else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
//                    else throw new RuntimeException("Unknown function: " + func);
//                } else {
//                    throw new RuntimeException("Unexpected: " + (char)ch);
//                }
//
//                if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation
//
//                return x;
//            }
//        }.parse();
//    }

}