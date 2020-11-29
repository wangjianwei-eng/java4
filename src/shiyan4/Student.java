package shiyan4;

public class Student {
	private String name; // 姓名
	private String gender; // 性别
	private int age; // 年龄
	private String major; // 专业
	private String banji; // 班级

	public Student(String name, String gender, int age, String major, String banji) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.major = major;
		this.banji = banji;
	}

	public static Student a() {
	        return new Student(	
	Utils.PutString("学生姓名:"),
	Utils.select("选择性别", new String[]{"男", "女"}),
	Utils.PutInt("学生年龄",0, -1),
	Utils.PutString("专业:"),
    Utils.PutString("班级:")
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
		return "\n学生信息{\n" + 
	            "姓名='" + name + '\'' + "\n" + 
				"性别=" + gender + "\n" + 
	            "年龄=" + age + "\n" + 
				"专业='" + major+ '\'' + "\n" + 
	            "班级='" + banji + '\'' + "\n" + 
				'}';
	}
}
