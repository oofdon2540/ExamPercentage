/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package examapp;

/**
 *
 * @author Yo
 */
public class Exam {
    private static float percentage;
    private static final float FULL_SCORE = 35;
    private String studentName;
    
    
    public Exam(String studentName){
        this.studentName = studentName;
        percentage = 0;
    }
   
    
    public static float calPercent(float points){
        return percentage = points*100/FULL_SCORE;
        
    }
    public static boolean checkPass(float percent){
        
        boolean passOrFail = false;
        if(percent >= 65){
            passOrFail = true;
            System.out.println("Congratulation !!! you got "+percent+" %");
        }else if(percent < 65){
            System.out.println("Sorry!!! you got "+ percent +" %");
        }
        else{
            System.out.println("Please try again");
        }
        return passOrFail;
    }
    
    public void displayName(){
        System.out.println("Hello "+studentName);
    }
    
    
    
    
    
  }
