package com.wjk.java.stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;

/**
 * 字符缓冲流
 * @author h
 *
 */
public class BufferedRW {

	@Test
	public void testBufferedStream() throws IOException {
		/**
		 * 将 a.txt 文件 复制到 b.txt 中
		 */
		//字节缓冲输入流
		BufferedReader br = new BufferedReader(
				new FileReader("E:"+File.separator+"download"+File.separator+"input.txt"));		
		//字节缓冲输出流
		BufferedWriter bw = new BufferedWriter(
				new FileWriter("E:"+File.separator+"download"+File.separator+"output.txt"));
		/*String line;
		while((line = br.readLine()) != null){
			System.out.println(line);
			bw.write(line, 0,line.length());
			bw.newLine(); // 添加换行
		}*/
		char buff[] = new char[1024];
        int len;
        while((len=br.read(buff))!=-1){
            bw.write(buff, 0, len);
        }
		//关闭流资源
		br.close();
		bw.close();
		
	}
	
	public static void main(String[] args) {
		char v = '饕';
		System.out.println(v);
	}

}
