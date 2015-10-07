package com.ireland.travel.service;

import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import javax.imageio.ImageIO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BufferedImageThumbnailer  {
	  private static final ImageObserver IMAGE_OBSERVER = (img, infoflags, x, y, width, height) -> true;
	  private final Logger log = LoggerFactory.getLogger(getClass());
	  private final int maxLongSide;
	  
	  public BufferedImageThumbnailer(int maxLongSide) {
	    this.maxLongSide = maxLongSide;
	  }
	  
	  public BufferedImageThumbnailer(){
		  this.maxLongSide = 250;
	  };

	  public String resize(String path) {
	    try {
	      File input = new File(path);
	      File thumbnail = File.createTempFile("thumbnail", ".jpg", new File(Paths.thumbnailPath));
	      BufferedImage imgIn = ImageIO.read(input);

	      double scale;
	      if (imgIn.getWidth() >= imgIn.getHeight()) {
	        // horizontal or square image
	        scale = Math.min(maxLongSide, imgIn.getWidth()) / (double) imgIn.getWidth();
	      } else {
	        // vertical image
	        scale = Math.min(maxLongSide, imgIn.getHeight()) / (double) imgIn.getHeight();
	      }

	      BufferedImage thumbnailOut = new BufferedImage((int) (scale * imgIn.getWidth()),
	                                                     (int) (scale * imgIn.getHeight()),
	                                                     imgIn.getType());
	      Graphics2D g = thumbnailOut.createGraphics();

	      AffineTransform transform = AffineTransform.getScaleInstance(scale, scale);
	      g.drawImage(imgIn, transform, IMAGE_OBSERVER );
	      ImageIO.write(thumbnailOut, "jpeg", thumbnail);

	      log.info("Image thumbnail now at: {}", thumbnail.getAbsolutePath());

	      return thumbnail.getAbsolutePath();
	    } catch (Exception e) {
	      throw new IllegalStateException(e.getMessage(), e);
	    }
	  }
	}