import java.util.Scanner;
public class AcceptMarksofStudents {
	public static void main(String [] args)
	{   int subjectA;
	    int subjectB;
	    int subjectC;
	    int total;
	    double average;
	    
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Marks of subjectA");
		subjectA=scanner.nextInt();
		
		System.out.println("Enter Marks of subjectB");
		subjectB=scanner.nextInt();
		
		System.out.println("Enter Marks of subjectC");
		subjectC=scanner.nextInt();
		
		total= subjectA+subjectB+subjectC;
		average=total/3.0;
		
		System.out.println("Total marks="+total);
		System.out.println("Average marks="+average);
		System.out.println();
		
		System.out.println("Enter Marks of subjectA");
		subjectA=scanner.nextInt();
		total= subjectA;
		average=total/1.0;
		System.out.println("Total marks in SubjectA="+total);
		System.out.println("Average marks of SubjectA="+average);
		System.out.println();
		
		System.out.println("Enter Marks of subjectB");
		subjectB=scanner.nextInt();
		total= subjectB;
		average=total/1.0;
		System.out.println("Total marks in SubjectB="+total);
		System.out.println("Average marks of SubjectB="+average);
		System.out.println();
		
		System.out.println("Enter Marks of subjectC");
		subjectA=scanner.nextInt();
		total= subjectC;
		average=total/1.0;
		System.out.println("Total marks in SubjectC="+total);
		System.out.println("Average marks of SubjectC="+average);
		
		scanner.close();
	}

}
