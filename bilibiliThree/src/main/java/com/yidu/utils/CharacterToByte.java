package com.yidu.utils;

import java.io.FileOutputStream;
import java.io.IOException;

import net.sf.json.JSONObject;
import sun.misc.BASE64Decoder;

/**
 * 将字符流转换为字节流
 * @author Administrator
 *
 */
public class CharacterToByte {
	private CharacterToByte(){};
	public static void byteImg(String imgName,String imgCharacter,String imgAddress) throws IOException{
		BASE64Decoder decoder  = new BASE64Decoder();
		//将头部截取出来
		int number=0;
		if(imgName.substring(imgName.lastIndexOf(".")+1).equalsIgnoreCase("png")||
				imgName.substring(imgName.lastIndexOf(".")+1).equalsIgnoreCase(".gif")){
			number=22;
		}else if(imgName.substring(imgName.lastIndexOf(".")+1).equalsIgnoreCase("jpg")){
			number=23;
		}
		//得到图片的字节码
		String imagebasefile = imgCharacter.substring(number);
			// Base64解码
			byte[] bytes;
				bytes = decoder.decodeBuffer(imagebasefile);
				for (int i = 0; i < bytes.length; ++i) {
					if (bytes[i] < 0) {// 调整异常数据
						bytes[i] += 256;
					}
				}
				//生成JPEG图片输出流，名字，保存路径            
				FileOutputStream out = new FileOutputStream(imgAddress);
				out.write(bytes);
				out.flush();
				out.close();
	}
}
