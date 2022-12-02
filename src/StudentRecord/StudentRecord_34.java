package StudentRecord;

public class StudentRecord_34 {
	private int id;
	private String name,branch;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public  StudentRecord_34(int id,String name,String branch)
	{
		setId(id);
		setName(name);
		setBranch(branch);
	}
	public  StudentRecord_34()
	{	
	}
	public StudentRecord_34[] sortId(StudentRecord_34[] details) {
		 {
			StudentRecord_34 temp;
			
			for (int j = 0; j < details.length - 1; j++) {
				for (int i = j + 1; i < details.length; i++) {
					if ((details[j].getId())>(details[i].getId())) {
						temp=details[j];
						details[j]=details[i];
						details[i]=temp;
						
					}
				}
			}
			return details;
		}
		
	}
	public StudentRecord_34[] sortAlpha(StudentRecord_34[] details) {
		StudentRecord_34 temp;
		for (int j = 0; j < details.length - 1; j++) {
			for (int i = j + 1; i < details.length; i++) {
				if (details[j].getBranch().compareTo(details[i].getBranch()) > 0) {
					temp=details[j];
					details[j]=details[i];
					details[i]=temp;
					
				}
			}
		}
		return details;
	}
}
