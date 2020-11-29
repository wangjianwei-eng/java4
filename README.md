# 实验五 模拟学生作业处理
# 一、实验目的
* 1.掌握字符串String及其方法的使用
* 2.掌握文件的读取/写入方法
* 3.掌握异常处理结构
# 二、实验要求
* 1.设计学生类（可利用之前的）；
* 2.采用交互式方式实例化某学生；
* 3，设计程序完成上述的业务逻辑处理，并且把“古诗处理后的输出”结果存储到学生基本信息所在的文本文件A中。
# 三、实验内容
* 在某课上,学生要提交实验结果，该结果存储在一个文本文件A中。
* 文件A包括两部分内容：
* 一是学生的基本信息；
* 二是学生处理后的作业信息，该作业的业务逻辑内容是：利用已学的字符串处理知识编程完成《长恨歌》古诗的整理对齐工作，写出功能方法，实现如下功能：
* 1.每7个汉字加入一个标点符号，奇数时加“，”，偶数时加“。”
* 2.允许提供输入参数，统计古诗中某个字或词出现的次数
* 3.输入的文本来源于文本文件B读取，把处理好的结果写入到文本文件A
* 4.考虑操作中可能出现的异常，在程序中设计异常处理程序
# 四、实验过程
# 五、核心代码
```java
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
```
# 六、运行结果

# 七、实验感想
