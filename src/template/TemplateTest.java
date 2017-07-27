package template;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class TemplateTest {

	public static void main(String[] args) {
		
		File file = new File("src\\template\\input\\");
		File[] files = file.listFiles();
		String encoding = "UTF-8";
		for (File f : files) {
			List<String> list = new ArrayList<String>();
			try {
				if (f.isFile() && f.exists()) {
					InputStreamReader read = new InputStreamReader(new FileInputStream(f), encoding);
					BufferedReader bufReader = new BufferedReader(read);
					String line = null;
					while ((line = bufReader.readLine()) != null) {
						list.add(line);
					}
					AbstractTemplate template = new AbstractTemplateImpl();
					template.processReconstruct(list);
					
					System.out.println();
					bufReader.close();
					read.close();
				} else {
					System.out.println("File not found.");
				}
			} catch (Exception e) {
				System.out.println("Error reading the file");
				e.printStackTrace();
			}
		}

	}

}
