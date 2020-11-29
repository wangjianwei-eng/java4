package shiyan4;

public class Test {
	public static void main(String[] args) {
		try {// 异常处理
			Student stu = Student.a();
			String poem = FileUtil.readFile("E:\\eclipse-workspace\\shiyan4\\src\\shiyan4\\B.txt");
			char[] poems = poem.toCharArray();
			/*
			 * 将字符串对象中的字符转换为一个字符数组,每个字符的ASC码与字符T的ASC码进行二进制异或运算。 最后把结果转换回字符。
			 */
			StringBuffer s = new StringBuffer();
			// 追加内容到当前StringBuffer对象的末尾
			// 计算字符串中关1键字出现的次数
			s.append("《长恨歌》\n\n");	
			for (int i = 0; i < poems.length ; i++) { // 在被选元素的结尾插入符号
				s.append(poems[i]);
				if ((i + 1) % 7 == 0 && (i + 1) % 2 == 1 || (i + 1) % 14 == 0 && (i + 1) % 2 == 0) {
					// i+1%7等于0并且i为奇数时，在结尾加，
					if ((i + 1) % 7 == 0 && (i + 1) % 2 == 1)
						s.append(",");
					// i+1%14等于0并且i为偶数时，在结尾加。
					else
						s.append("。\n");
				}
			}
			System.out.println(stu);
			s.append(stu);
			System.out.println(s.toString()); // 将数组内容按要求显示出来
			int a = countString(poem, "王"); // 显示“王”字出现的次数
			System.out.println("");
			System.out.println("'王'字一共出现:" + a + "次");
			s.append("\n\n'王'字一共出现:"+a+"次");
			FileUtil.writeFile("E:\\eclipse-workspace\\shiyan4\\src\\shiyan4\\A.txt", s.toString().split("\n"));
		}

		catch (Exception e) { // 异常处理
			System.out.print("发生异常" + e.toString());
			e.printStackTrace();
		}

	} // countString 显示次数的方法

	private static int countString(String poem, String index) {
		// TODO Auto-generated method stub
		int count = 0; // 初始值为0
		while (poem.indexOf(index) != -1) {
			// 查找字串中指定字符首次出现的位置
			// 返回一个新字符串，它是此字符串的一个子字符串。
			poem = poem.substring(poem.indexOf(index) + 1, poem.length());
			count++;
		}
		return count;
	}
}