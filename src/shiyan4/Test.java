package shiyan4;

public class Test {
	public static void main(String[] args) {
		try {// �쳣����
			Student stu = Student.a();
			String poem = FileUtil.readFile("E:\\eclipse-workspace\\shiyan4\\src\\shiyan4\\B.txt");
			char[] poems = poem.toCharArray();
			/*
			 * ���ַ��������е��ַ�ת��Ϊһ���ַ�����,ÿ���ַ���ASC�����ַ�T��ASC����ж�����������㡣 ���ѽ��ת�����ַ���
			 */
			StringBuffer s = new StringBuffer();
			// ׷�����ݵ���ǰStringBuffer�����ĩβ
			// �����ַ����й�1���ֳ��ֵĴ���
			s.append("�����޸衷\n\n");	
			for (int i = 0; i < poems.length ; i++) { // �ڱ�ѡԪ�صĽ�β�������
				s.append(poems[i]);
				if ((i + 1) % 7 == 0 && (i + 1) % 2 == 1 || (i + 1) % 14 == 0 && (i + 1) % 2 == 0) {
					// i+1%7����0����iΪ����ʱ���ڽ�β�ӣ�
					if ((i + 1) % 7 == 0 && (i + 1) % 2 == 1)
						s.append(",");
					// i+1%14����0����iΪż��ʱ���ڽ�β�ӡ�
					else
						s.append("��\n");
				}
			}
			System.out.println(stu);
			s.append(stu);
			System.out.println(s.toString()); // ���������ݰ�Ҫ����ʾ����
			int a = countString(poem, "��"); // ��ʾ�������ֳ��ֵĴ���
			System.out.println("");
			System.out.println("'��'��һ������:" + a + "��");
			s.append("\n\n'��'��һ������:"+a+"��");
			FileUtil.writeFile("E:\\eclipse-workspace\\shiyan4\\src\\shiyan4\\A.txt", s.toString().split("\n"));
		}

		catch (Exception e) { // �쳣����
			System.out.print("�����쳣" + e.toString());
			e.printStackTrace();
		}

	} // countString ��ʾ�����ķ���

	private static int countString(String poem, String index) {
		// TODO Auto-generated method stub
		int count = 0; // ��ʼֵΪ0
		while (poem.indexOf(index) != -1) {
			// �����ִ���ָ���ַ��״γ��ֵ�λ��
			// ����һ�����ַ��������Ǵ��ַ�����һ�����ַ�����
			poem = poem.substring(poem.indexOf(index) + 1, poem.length());
			count++;
		}
		return count;
	}
}