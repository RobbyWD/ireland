package com.ireland.travel.service;

import java.io.IOException;

import org.springframework.stereotype.Service;

@Service
public class ImageDownloaderAndResizer {
	
	private ImageDownloadService downloadService;
	private BufferedImageThumbnailer thumbnailer;
	
	public String makeThumbnail(String URL){
		String path="";
		downloadService = new ImageDownloadService();
		try {
			 path = downloadService.download(URL, Paths.imagePath);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		thumbnailer = new BufferedImageThumbnailer(250);
		return thumbnailer.resize(path);
		
	}

}
