import java.util.Scanner;
public class marks {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter number of students:");
        int n = input.nextInt();
        int[][] marks = new int[n][3];

        while (true) {
            System.out.println("1.Add students marks.");
            System.out.println("2.Update student marks.");
            System.out.println("3.The average for a Subject.");
            System.out.println("4.The average for a Student.");
            System.out.println("5.The Total marks.");
            System.out.println("6.Exit.");

            System.out.print("Enter your choice: ");
            int choice = input.nextInt();

            switch (choice) {
                 case 1: 
                 System.out.print("Enter Student ID: ");
                 int StudentID = input.nextInt();

                 if (StudentID >= 1 && StudentID <= n){
                    System.out.print("Enter Mathematics mark: ");
                    marks[StudentID - 1][0] = input.nextInt();
                   System.out.print("Enter Physics marks: ");
                    marks[StudentID - 1][1] = input.nextInt();

                    System.out.print("Enter Chemistry mark: ");
                    marks[StudentID - 1][2] = input.nextInt();

                    System.out.println("Marks added Successfully!");
                 } else {
                    System.out.println("Invalid Student ID!");
                 }
                 break;

                 case 2:
                    System.out.print("Enter Student ID: ");
                    StudentID = input.nextInt();
                    System.out.print("Enter the subject ID: ");
                    int SubjectID = input.nextInt();

                    if (StudentID >= 1 && StudentID <= n && SubjectID >=  1 && SubjectID <=3){
                        System.out.print("Enter the new marks: ");
                         marks[StudentID - 1][SubjectID - 1] = input.nextInt();
                    } else {
                        System.out.print("Invalid ID!");
                      }
                        break;

                        case 3:
                         System.out.print("Enter the subject ID: ");
                         SubjectID = input.nextInt();

                         if(SubjectID >= 1 && SubjectID <= 3 ){
                          int SUM = 0;
                          for (int i = 0; i<n; i++) {
                           SUM += marks[i][SubjectID - 1];
                          }
                         double average = (double) SUM/n;
                         System.out.println("Average for a Subject: " + average);
                         } else {
                            System.out.println("Invalid ID!");
                         }
                         break;

                         case 4:
                            System.out.print("Enter Student ID: ");
                            StudentID = input.nextInt();

                            if (StudentID >= 1 && StudentID <= n){
                             int total = marks[StudentID - 1] [0] + marks[StudentID - 1] [1] + marks[StudentID - 1] [2] ;
                            double average = total / 3;

                            System.out.println("Average for a Student: " + average);
                            }else {
                            System.out.println("Invalid Student ID!");
                            }
                            break;



                            case 5:
                            System.out.print("Enter Student ID: ");
                            StudentID = input.nextInt();

                            if (StudentID >= 1 && StudentID <= n){
                            int total = marks[StudentID - 1] [0] + marks[StudentID - 1] [1] + marks[StudentID - 1] [2] ;

                                System.out.println("Total marks: " + total);
                            } else {
                                System.out.println ("Invalid ID!");
                            } 
                            break;

                            case 6:
                                System.out.println("Exit!");
                                break;
                                
                            default:
                                System.out.println("Invalid ID!");
                   
                }
           }
       }
    }

    
