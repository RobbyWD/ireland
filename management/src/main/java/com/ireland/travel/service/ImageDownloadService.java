package com.ireland.travel.service;

import java.awt.Image;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import lombok.Data;

@Data
@Service
public class ImageDownloadService {
	private final Logger log = LoggerFactory.getLogger(getClass());
	
	public String download(String URL, String filePath) throws IOException{
		 
		 Image image = null;
		 URL url = new URL(URL);
		 image = ImageIO.read(url);
		
		
		 InputStream in = new BufferedInputStream(url.openStream());
		 ByteArrayOutputStream out = new ByteArrayOutputStream();
		 byte[] buf = new byte[1024];
		 int n = 0;
		 while (-1!=(n=in.read(buf)))
		 {
		    out.write(buf, 0, n);
		 }
		 out.close();
		 in.close();
		 byte[] response = out.toByteArray();
		 
		 
		 File download = File.createTempFile("download", ".jpg", new File(filePath));
		 FileOutputStream fos = new FileOutputStream(download);
		 fos.write(response);
		 fos.close();
		 log.info("Image was successfuly downloaded. Path: {}", download.getAbsolutePath());
		 return download.getAbsolutePath();		
		}
		 
	}
	
