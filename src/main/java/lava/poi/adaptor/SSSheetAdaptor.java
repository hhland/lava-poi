package lava.poi.adaptor;


import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.util.CellRangeAddress;

public class SSSheetAdaptor extends BaseAdaptor<Sheet> {

	
	

	public SSSheetAdaptor(Sheet sheet) {
		super(sheet);
		
	}
	
	private void setRowValue(Row row, int cellIndex, Object... vals) {
		for (Object val : vals) {
			String text = "";
			if (val!=null) {
				text = val.toString();
			}
			setCellValue(row, cellIndex, text);
			cellIndex++;
		}
	}
	
	private  void setCellValue(Row row, int cellIndex, Object val) {
		Cell cell = row.getCell(cellIndex);
		if (cell == null) {
			cell = row.createCell(cellIndex);
		}
		cell.setCellValue(val==null ? " " : val.toString().replace("()", ""));
	}
	
	public  void setRowValue(int rowNum, int cellIndex, Object... vals) {
		Row row = _this.getRow(rowNum);
		if (row == null) {
			row = _this.createRow(rowNum);
		}
		setRowValue(row, cellIndex, vals);
	}
	
	public  void setColumnValue(int rowNum, int cellIndex, Object... vals) {
		for(int i=0;i<vals.length;i++) {
			setRowValue(rowNum+i,cellIndex,vals[i]);
		}
		
	}
	
	
	
	
}
