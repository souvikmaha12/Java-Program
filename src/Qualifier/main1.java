package Qualifier;
import java.util.*;
public class main1 {

	 static boolean isPalindrome(String name) {
	        String reverse = "";
	        for (int i = name.length() - 1; i >= 0; i--) {
	            reverse = reverse + name.charAt(i);
	        }
	        return name.equalsIgnoreCase(reverse);
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        ArrayList<Student1> students = new ArrayList<>();
	       // HashMap<Integer, Student1> map = new HashMap<>();

	        System.out.println("Enter student details (id,name,age,marks) or exit:");

	        while (true) {
	            String input = sc.nextLine();

	            if (input.equalsIgnoreCase("exit")) {
	                break;
	            }

	            String[] arr = input.split(",");

	            int id = Integer.parseInt(arr[0]);
	            String name = arr[1];
	            int age = Integer.parseInt(arr[2]);
	            int marks = Integer.parseInt(arr[3]);

	            // Validation
	            if (name.isEmpty() || age < 18 || marks < 0 || marks > 100) {
	                System.out.println("Invalid Input. Skipped.");
	                continue;
	            }

	            Student1 s = new Student1(id, name, age, marks);
	            students.add(s);
	            //map.put(id, s);
	        }

	        // Display all students
	        System.out.println("\nStudent Details:");
	        for (Student1 s : students) {
	            s.displayDetails();
	        }

	        // ---------- SIMPLE SORT (NO COMPARATOR) ----------
	        for (int i = 0; i < students.size(); i++) {
	            for (int j = i + 1; j < students.size(); j++) {
	                if (students.get(i).getMarks() > students.get(j).getMarks()) {
	                    Student1 temp = students.get(i);
	                    students.set(i, students.get(j));
	                    students.set(j, temp);
	                }
	            }
	        }

	        System.out.println("\nSorted by Marks:");
	        for (Student1 s : students) {
	            System.out.println(s.getName() + " - " + s.getMarks());
	        }

	        // Palindrome names
	        System.out.println("\nPalindrome Names:");
	        for (Student1 s : students) {
	            if (isPalindrome(s.getName())) {
	                System.out.println(s.getName());
	            }
	        }

	        // Average marks
	        int sum = 0;
	        for (Student1 s : students) {
	            sum = sum + s.getMarks();
	        }

	        double avg = (double) sum / students.size();
	        System.out.printf("\nAverage Marks = %.2f", avg);

	        sc.close();
	    }
	}

