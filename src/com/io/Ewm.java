package com.io;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.ietf.jgss.GSSContext;

import com.swetake.util.Qrcode;

public class Ewm {

	public static void main(String[] args) throws Exception {
		Qrcode ewm=new Qrcode();
	
		int width=300;
		int height=300;
		BufferedImage hctx=new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		Graphics2D ewhb=hctx.createGraphics();
		//设置画笔的背景是白色
		ewhb.setBackground(Color.WHITE);
		ewhb.setColor(Color.BLACK);
		ewhb.clearRect(0, 0, width, height);
		String zf="张三";
		byte[] zjsz=zf.getBytes();
		int pianyi=2;
		if (zjsz.length>0&&zjsz.length<100) {
			boolean[][] ewsz=ewm.calQrcode(zjsz);
			for (int i = 0; i < ewsz.length; i++) {
				for (int j = 0; j < ewsz.length; j++) {
					if (ewsz[j][i]) {
						ewhb.fillRect(j*3+pianyi, i*3+pianyi, 3, 3);
					}
				}
			}
		}
		ewhb.dispose();
		hctx.flush();
		//生成图像
		ImageIO.write(hctx, "jpg", new File("ewm.jpg"));
	}

}
