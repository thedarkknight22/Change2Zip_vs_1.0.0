package de.change2zip.java;

import java.io.File;

public class Change2Zip {

	public File changeExtension(File file, String extension) {
	    String filename = file.getName();

	    if (filename.contains(".")) {
	        filename = filename.substring(0, filename.lastIndexOf('.'));
	    }
	    filename += "." + extension;

	    file.renameTo(new File(file.getParentFile(), filename));
	    return file;
	}
	
	

	public void test() {
	    assertThat(changeExtension(new File("C:/a/aaa.bbb.ccc"), "zip"), 
	                            is(new File("C:/a/aaa.bbb.zip")));

	    assertThat(changeExtension(new File("C:/a/test"), "zip"), 
	                            is(new File("C:/a/test.zip")));
	}


}
