package lava.poi.adaptor;

import java.text.SimpleDateFormat;

public abstract class BaseAdaptor<T> {

	
	final T _this;
	
	
	
	
	public BaseAdaptor(T _this) {
		super();
		this._this = _this;
	}


	protected static SimpleDateFormat sdf_ymdhms=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
			,ymd_cn=new SimpleDateFormat("yyyy-MM-dd")
			,ymd=new SimpleDateFormat("yyyyMMdd")
			;
	
	
	   protected boolean isAllBlank(Object...values) {
		   boolean ret=true;
		   
		   for(Object value: values) {
			   if(value!=null) {
				   if(value instanceof String) {
					   if(((String) value).trim().length()>0) {
						   ret=false;
						   break;
					   }
				   }else {
					   ret=false;
					   break;
				   }
			   }
		   }
		   
		   return ret;
	   }
	
	   
	   protected boolean isAnyBlank(Object...values) {
		   boolean ret=false;
		   
		   for(Object value: values) {
			   if(value==null) {
				   ret=true;
				   break;
			   }
			  
			   if(value instanceof String) {
				  if(((String) value).trim().length()==0) {
						   ret=true;
						   break;
			   }
			   }
			   
		   }
		   
		   return ret;
	   }
}
