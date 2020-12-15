import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.Scanner;

public class qvis1 {
    public static void main(String[] args) {
        String[] questions = {"vad är 55*6", "vad är värdet för sins(30) \n(i desimal from)", };
        double[] correctAnswers = {330, 0.5, };
        int F;
        System.out.print(correctAnswers[1]);


        try {
             F = Integer.parseInt(JOptionPane.showInputDialog("vilken fråga vill du börja på ( - )"));
        } catch (NumberFormatException e) {
           F = 0;
            JOptionPane.showMessageDialog(null, "du skrev fel så du får börja på fråga 1");
        } catch (HeadlessException e) {
            e.printStackTrace();
        }


    }
}
