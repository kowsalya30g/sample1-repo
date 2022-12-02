package HighestMarks;

import java.util.Scanner;

public class SHighScore_M_35 {

		static Scanner sc = new Scanner(System.in);
		private static int finfMaxIndex(float[] score, float max, SHighScore_35[] o) {
			int index = 0;
			for (int i = 0; i < score.length; i++) {
				if (max == score[i]) {
					index = i;

					System.out.println("Student " + (index + 1) + " Scored the highest marks");
					System.out.println("Student Id :" + o[index].getID());
					System.out.println("Student Name:" + o[index].getName());
					System.out.println("Student branch:" + o[index].getBranch());
					System.out.println("Student score :" + o[index].getScore());
				}
			}

			return index;
		}
		
   public static void main(String[] args) {

			System.out.println("Enter the number of student Score you want to compare");
			int n;
			n = intValidate();
			SHighScore_35[] o = new SHighScore_35[n];
			float Score[] = new float[n];
			for (int i = 0; i < n; i++) {
				o[i] = new SHighScore_35();
				System.out.println("Enter  student " + (i + 1) + " Id");
				int id;
				id = intValidate();
				o[i].setID(id);
				System.out.println("Enter  student " + (i + 1) + " Name");
				String name = sc.nextLine();
				name = stringValidate(name);
				o[i].setName(name);
				System.out.println("Enter   student " + (i + 1) + " branch");
				String branch = sc.nextLine();
				branch = stringValidate(branch);
				o[i].setBranch(branch);
				System.out.println("Enter   student " + (i + 1) + " Score");
				float score;
				score = Validate();
				o[i].setScore(score);
				Score[i] = score;
			}
			SHighScore_35 obj = new SHighScore_35();
			float max = obj.maxScore(Score);
			int index=finfMaxIndex(Score,max, o );
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

		private static float Validate() {
			float data = 0;
			boolean validation = false;
			while (validation == false) {
				if (sc.hasNextFloat()) {
					data = sc.nextFloat();
					validation = true;
				} else if (!sc.hasNextFloat()) {
					System.out.println("you didn't type an integer value ! please type an integer");
					sc.next();
				}
			}
			return data;
		}
}
