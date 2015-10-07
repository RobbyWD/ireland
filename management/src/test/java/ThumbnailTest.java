import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ireland.travel.service.BufferedImageThumbnailer;
import com.ireland.travel.service.ImageDownloadService;
import com.ireland.travel.service.ImageDownloaderAndResizer;

import reactor.event.Event;

public class ThumbnailTest {
	
    BufferedImageThumbnailer nailer;
    
	public static final String URL = "http://i.imgur.com/3yGsl.jpg";
	public static final String URL2 = "https://thehostages.files.wordpress.com/2011/04/strutt-bikini.jpg";
	public static final String filePath2 = "B://DEVELOPMENT/ireland-master/management/src/main/webapp/resources/img/new_img.jpg";
	public static final String filePath3 = "B://DEVELOPMENT/ireland-master/management/src/main/webapp/resources/img";  
	  
	@Test
	public void test() {
		
		    ImageDownloaderAndResizer resizer = new ImageDownloaderAndResizer();
			resizer.makeThumbnail(URL2);
//		String path = "";
//	
//		ImageDownloadService service = new ImageDownloadService();
//		try {
//			path = service.download(URL, filePath3);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//     	nailer = new BufferedImageThumbnailer(250);
//     	nailer.resize(path);

		
		
	}

}
