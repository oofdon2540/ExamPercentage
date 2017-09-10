/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package examapp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
/**
 *
 * @author Yo
 */
public class ExamApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name;
        
        Scanner scan = new Scanner(System.in);
        Calendar calenName = Calendar.getInstance();
        SimpleDateFormat sim = new SimpleDateFormat("d/MM/YYYY HH:mm:ss");
        System.out.println(sim.format(calenName.getTime()));
        
        
        System.out.print("Enter your name: ");
        name = scan.nextLine();
        
        Exam myExam = new Exam(name);
        myExam.displayName();
        
        System.out.print("Enter your points: ");
        float percent = Exam.calPercent(scan.nextFloat());
        System.out.println(percent);
        
        boolean result = Exam.checkPass(percent);
        
        
 }
}