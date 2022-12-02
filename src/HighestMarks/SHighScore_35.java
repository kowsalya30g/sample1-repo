package HighestMarks;

public class SHighScore_35 {
		private int ID;
		private String Name;
		private String Branch;
		private float Score;
		public int getID() {
			return ID;
		}
		public void setID(int iD) {
			ID = iD;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public String getBranch() {
			return Branch;
		}
		public void setBranch(String branch) {
			Branch = branch;
		}
		public float getScore() {
			return Score;
		}
		public void setScore(float score) {
			Score = score;
		}
		public float maxScore(float[] score)
		{
			int i;
			float max=score[0];
			for(i=1;i<score.length;i++)
			{
				if(score[i]>max)
				{
					max=score[i];
				}
			}
			return max;
		}
		
}
