package com.ireland.travel.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;

import com.ireland.travel.entity.domain.Product;

public class UploadService {
	
	@Autowired
	private ProductService service;
	
	 public void upload(String csvFile) {

			BufferedReader br = null;
			String line = "";
			String cvsSplitBy = ",";

			try {

				br = new BufferedReader(new FileReader(csvFile));
				while ((line = br.readLine()) != null) {

					String[] data = line.split(cvsSplitBy);
					service.saveProduct(new Product(data));

				}

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if (br != null) {
					try {
						br.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}

			System.out.println("File " +csvFile+ " succesfully uploaded");
		  }

}
