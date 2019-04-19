package lava.poi.adaptor;


import java.util.List;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.util.CellRangeAddress;

public class SSSheetAdaptor extends BaseAdaptor {

	
	private Sheet sheet;

	public SSSheetAdaptor(Sheet sheet) {
		super();
		this.sheet = sheet;
	}
	
	
	
}
