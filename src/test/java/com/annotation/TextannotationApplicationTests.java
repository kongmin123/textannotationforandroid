package com.annotation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TextannotationApplicationTests {

//    @Test
//    public void test() {
//	    String path="F:\test.doc";
//        String absPath=path.replaceAll("\\\\","\\\\\\\\");
//		System.out.println(absPath);
//	}
//	@Autowired
//	IUserService iUserService;
//	@Test
//	public void contextLoads() {
//		User user = iUserService.queryByUsername("hahah");
//		System.out.println(user.getPassword());
//	}

//	@Autowired
//    IuploadFileService iFileService;
//	@Test
//	public void yte(){
//		File file = new File();
//		//file.setId(2);
//		file.setAbsolutepath("hahah");
//		file.setContent("ad");
//		file.setFilename("ha");
//		file.setRelativepath("hah");
//		file.setSize("hah");
//		file.setType("hah");
//		file.setUploadtime("hha");
//		int m =iFileService.saveFile(file);
//		System.out.println(m);
//	}

//	@Test
//	public void test() throws IOException{
//		String path="F:\\test.doc";
//		String path2="F:\\test.docx";
//		String m =iFileService.readC(path);
//		String p =iFileService.readC(path2);
//		System.out.println(m);
//		System.out.println(p);
//	}

}
