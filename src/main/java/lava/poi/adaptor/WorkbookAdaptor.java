package lava.poi.adaptor;

import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class WorkbookAdaptor extends BaseAdaptor {

	
	private Workbook workbook;

	public WorkbookAdaptor(Workbook workbook) {
		super();
		this.workbook = workbook;
	}
	
	
	public WorkbookAdaptor(InputStream inputStream) throws Exception{
		try {
			workbook = WorkbookFactory.create(inputStream);
		} catch (Exception e) {
			try {
				workbook = new HSSFWorkbook(inputStream);
			} catch (IOException e1) {
				
			}
		}
		
	}
	
	
}
