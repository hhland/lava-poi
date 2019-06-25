package lava.poi.adaptor;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.formula.IStabilityClassifier;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

public class RowAdaptor extends BaseAdaptor<Row> {

	
	

	public RowAdaptor(Row row) {
		super(row);
		
	}
	
	
	
	public  void setCellValue(int cellIndex, BigDecimal val) {
		// TODO Auto-generated method stub
		Cell cell=_this.getCell(cellIndex);
  	    if(cell==null) {
  		  cell=_this.createCell(cellIndex);
  	    }
  	    
		cell.setCellValue(val.doubleValue());
		
	}

	public  void setCellValue(int cellIndex, Integer val) {
		// TODO Auto-generated method stub
		Cell cell=_this.getCell(cellIndex);
  	    if(cell==null) {
  		  cell=_this.createCell(cellIndex);
  		  
  	    }
  	    
		
		cell.setCellValue(val.toString());
		
	}
	
	public  void setCellValue(int cellIndex,String val) {
  	  Cell cell=_this.getCell(cellIndex);
  	  if(cell==null) {
  		  cell=_this.createCell(cellIndex);
  	  }
  	  if(!isAnyBlank(val)) {
		     cell.setCellValue(val);
  	    }
	  }

	
	public void setCellValue(int cellIndex, Date val) {
		// TODO Auto-generated method stub
		Cell cell=_this.getCell(cellIndex);
  	    if(cell==null) {
  		  cell=_this.createCell(cellIndex);
  	    }
		
		
		cell.setCellValue(ymd_cn.format(val));
		
	}

	
    public  void setRowValue(int cellIndex,Object...vals) {
    	
    	for(Object val:vals) {
    		if(val ==null) {
    		}
    		Cell cell=_this.getCell(cellIndex);
      	    if(cell==null) {
      		  cell=_this.createCell(cellIndex);
      	    }
    		if(val instanceof String ) {
    		   setCellValue(cellIndex, (String)val);
    		}else if(val instanceof BigDecimal ) {
     		   setCellValue(cellIndex, (BigDecimal)val);
     		}else if(val instanceof Integer ) {
      		   setCellValue(cellIndex, (Integer)val);
      		}else if(val instanceof Date ) {
       		   setCellValue(cellIndex, (Date)val);
       		}else if(val instanceof Character ) {
        		setCellValue(cellIndex, val.toString());
            }
    		cellIndex++;
    	}
    	
    }
	
}
