package basic_reveison;
//Duplicate case labels are not allowed
public class SwitchCase {
    public static void main(String[] args) {
        int test_score=80;
        int terminal_score=40;
        int average_grade=(test_score+terminal_score)/2;
        switch (average_grade){
            case 100-90:
                System.out.println( " Your average test score is " + average_grade );
                System.out.println( "Your letter grade is an A." );
                break;
            /*case 89-80:
                System.out.println( " Your average test score is " + average_grade );
                System.out.println( "Your letter grade is a B." );
                break;
            case 79-70:
                System.out.println( " Your average test score is " + average_grade );
                System.out.println( "Your letter grade is a C." );
                break;*/
            case 69-65:
                System.out.println( " Your average test score is " + average_grade );
                System.out.println( "Your letter grade is a D." );
                break;
            case 64-0:
                System.out.println( " Your average test score is " + average_grade );
                System.out.println( "Your letter grade is a F." );
                break;
            default:
                System.out.println( " Invalid test score. ");
                break;
        }

        }
    }

