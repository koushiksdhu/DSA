/*  Converting Lower Case Character to Upper Case Character using bitwise operator:
    * LowerCase to UpperCase: [CHAR & '_'] anding the character to underscore.
    * UpperCase to LowerCase: [CHAR | ' '] oring the charcter with blankspace.
*/


public class lowerCaseUpperCase {
    public static void main(String args[]){
        char lowerC = 'd';
        System.out.println("UpperCase of "+lowerC+" is: "+(char)(lowerC & '_'));
        char upperC = 'G';
        System.out.println("LowerCase of "+upperC+" is: "+(char)(upperC | ' '));
    }
}
