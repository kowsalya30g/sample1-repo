package StudentRecord;

import java.util.Scanner;

public class StudentRecord_M_34 {
		static Scanner sc = new Scanner(System.in);
		int id;
		String branch, name;

		public static void main(String[] args) {
			boolean test = true;
			int id;
			String branch, name;
			StudentRecord_34 details[] = {};
			while (true) {
				System.out.println();
				System.out.println("Student Management system");
				System.out.println("1. Add Student");
				System.out.println("2. Show students by id");
				System.out.println("3. Show students by branch");
				System.out.println("4. Exit");
				System.out.println();
				System.out.print("Enter your choice: ");
				int ch;
				ch = intValidate();
				System.out.println();
				StudentRecord_34 obj = new StudentRecord_34();
				switch (ch) {
				case 1:
					System.out.println("enter id of student: ");
					id = intValidate();
					System.out.println("enter name of student: ");
					name = sc.nextLine();
					name = stringValidate(name);
					System.out.println("enter branch of student: ");
					branch = sc.next();
					branch = stringValidate(branch);
					details = addStudents(id, name, branch, details);
					break;
				case 2:
					if (details.length > 0)
					{
					obj.sortId(details);
					StudentRecord_34[] idSortDetails = obj.sortId(details);
					System.out.println("Student Names in sorted order based on Student id ");
					for (int i = 0; i < idSortDetails.length; i++) {
						System.out.println(idSortDetails[i].getId() + " " + idSortDetails[i].getName() + " "
								+ idSortDetails[i].getBranch());
					}
					}
					else
					{
						System.out.println("Record empty!! ");
					}
					break;
				case 3:
					if (details.length > 0)
					{
					StudentRecord_34[] branchSortDetails = obj.sortAlpha(details);
					System.out.println("Student Names in sorted order based on branch (alphabetical order) ");
					for (int i = 0; i < branchSortDetails.length; i++) {
						System.out.println(branchSortDetails[i].getId() + " " + branchSortDetails[i].getName() + " "
								+ branchSortDetails[i].getBranch());
					}
					}
					else
					{
						System.out.println("Record empty!! ");
					}
					break;
					
				
				case 4:
					System.out.println("Exit");
					break;
				default:
					System.out.println("Invalid choice");
				}
			}
		}

		private static StudentRecord_34[] addStudents(int id, String name, String branch, StudentRecord_34[] details) {

			StudentRecord_34[] res = new StudentRecord_34[details.length + 1];
			if (res.length > 0) {
				for (int i = 0; i < details.length; i++) {
					res[i] = details[i];
				}
				res[details.length] = new StudentRecord_34(id, name, branch);
			}
				return res;
		
		}

		private static String stringValidate(String data) {

			while (!data.matches("[a-zA-Z\\s]+")) {
				if (!data.isEmpty()) {
					System.out.println("Please give alphabetical input");
				}
				data = sc.nextLine();
			}
			return data;
		}

		private static int intValidate() {
			int data = 0;
			boolean validation = false;
			while (validation == false) {
				if (sc.hasNextInt()) {
					data = sc.nextInt();
					validation = true;
				} else if (!sc.hasNextInt()) {
					System.out.println("you didn't type an integer value ! please type an integer");
					sc.next();
				}
			}
			return data;
		}

}
