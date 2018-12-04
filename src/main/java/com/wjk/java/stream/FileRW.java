package com.wjk.java.stream;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

import org.junit.Test;

/**
 * 字符流
 * @author h
 *
 */
public class FileRW {

	@Test
	public void testFileRW() throws IOException {
		File srcFile = new File("E:"+File.separator+"download"+File.separator+"input.txt");
		File descFile = new File("E:"+File.separator+"download"+File.separator+"output.txt");
		//2、创建字符输入输出流对象
		Reader in = new FileReader(srcFile);
		Writer out = new FileWriter(descFile);
		//3、读取和写入操作
		char[] buffer = new char[10];//创建一个容量为 10 的字符数组，存储已经读取的数据
		int len = -1;//表示已经读取了多少个字节，如果是 -1，表示已经读取到文件的末尾
		while((len=in.read(buffer))!=-1){
			out.write(buffer, 0, len);
		}

		//4、关闭流资源
		out.close();
		in.close();
	}
}
