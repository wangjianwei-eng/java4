package shiyan4;

public class Student {
	private String name; // ����
	private String gender; // �Ա�
	private int age; // ����
	private String major; // רҵ
	private String banji; // �༶

	public Student(String name, String gender, int age, String major, String banji) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.major = major;
		this.banji = banji;
	}

	public static Student a() {
	        return new Student(	
	Utils.PutString("ѧ������:"),
	Utils.select("ѡ���Ա�", new String[]{"��", "Ů"}),
	Utils.PutInt("ѧ������",0, -1),
	Utils.PutString("רҵ:"),
    Utils.PutString("�༶:")
    );
	  }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getBanji() {
		return banji;
	}

	public void setBanji(String banji) {
		this.banji = banji;
	}

	public String toString() {
		return "\nѧ����Ϣ{\n" + 
	            "����='" + name + '\'' + "\n" + 
				"�Ա�=" + gender + "\n" + 
	            "����=" + age + "\n" + 
				"רҵ='" + major+ '\'' + "\n" + 
	            "�༶='" + banji + '\'' + "\n" + 
				'}';
	}
}
