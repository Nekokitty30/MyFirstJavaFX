package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    public Button minus;
    public Button div;

    public Button mult;
    public Button plus;
    public Label label;
    public TextField field2;

    public TextField field1;
    public Button startSqrt;
    public Button fact;
    public Button pow;
    public Button funct;




    public void startPlus(ActionEvent actionEvent) {
        String str1 = field1.getText();
        String str2 = field2.getText();
        try {


            int first = Integer.parseInt(str1);
            int second = Integer.parseInt(str2);

            label.setText(String.valueOf(first + second));
        } catch (NumberFormatException e) {
            label.setText("Неверный ввод");
        }
    }


    public void startDiv(ActionEvent actionEvent) {
        String str1 = field1.getText();
        String str2 = field2.getText();
        try {


            int first = Integer.parseInt(str1);
            int second = Integer.parseInt(str2);

            label.setText(String.valueOf(first / second));
        } catch (NumberFormatException e) {
            label.setText("Неверный ввод");
        } catch (ArithmeticException e) {
            label.setText("Деление на ноль запрещено!");

        }
    }


        public void startMult(ActionEvent actionEvent){
            String str1 = field1.getText();
            String str2 = field2.getText();
            try {


                int first = Integer.parseInt(str1);
                int second = Integer.parseInt(str2);

                label.setText(String.valueOf(first * second));
            } catch (NumberFormatException e) {
                label.setText("Неверный ввод");
            }
        }


    public void startMinus(ActionEvent actionEvent) {
        String str1=field1.getText();
        String str2=field2.getText();
        try {


            int first=Integer.parseInt(str1);
            int second=Integer.parseInt(str2);

            label.setText(String.valueOf(first-second));
        } catch (NumberFormatException e) {label.setText("Неверный ввод");}
    }
    public void startSqrt(ActionEvent actionEvent) {
        /*String str1=field1.getText();*/
        String str2=field2.getText();
        try {


            /*double first=Double.parseDouble(str1);*/
            double second=Double.parseDouble(str2);


            /*label.setText(String.valueOf(Math.sqrt(first));*/
            label.setText(String.valueOf(Math.sqrt(second)));

        } catch (Exception e) {label.setText("Неверный ввод");}
    }





    public void startFact(ActionEvent actionEvent) {
        /*String str1=field1.getText();*/
        String str2=field2.getText();
        try {


           /* int first=Integer.parseInt(str1);*/
            double second=Double.parseDouble(str2);
            double res = 1;
            for( int i = 1; i <= second; i++ ){
                res=res*i;

            }

           /* label.setText(String.valueOf(fa(first));*/
            label.setText(String.valueOf((res)));

        } catch (Exception e) {label.setText("Неверный ввод");}
    }

    public void startPow(ActionEvent actionEvent) {
        /*String str1=field1.getText();*/
        String str2=field2.getText();
        try {


            /*double first=Double.parseDouble(str1);*/
            double second=Double.parseDouble(str2);


            /*label.setText(String.valueOf(Math.sqrt(first));*/
            label.setText(String.valueOf(Math.sqrt(second)));

        } catch (Exception e) {label.setText("Неверный ввод");}



    }

    public void startFunct(ActionEvent actionEvent) {
        String str2=field2.getText();
        try {
        double second=Double.parseDouble(str2);


        /*label.setText(String.valueOf(Math.sqrt(first));*/
        label.setText(String.valueOf(1/second));

    } catch (Exception e) {label.setText("Неверный ввод");}
    }
}

