package kodlamaio.northwind.core.utilities.results;

public class SuccessDataResult<T> extends DataResult<T> {

	public SuccessDataResult(T data, String message) {
		super(data,true,message);
		// TODO Auto-generated constructor stub
	
	}
	//Alternative
	public SuccessDataResult(T data) {
		super(data,true);
	}
	//Alternative
	public SuccessDataResult(String message) {
		super(null,true,message);
		// TODO Auto-generated constructor stub
	
	}
	//Alternative
	public SuccessDataResult() {
		super(null,true);
		// TODO Auto-generated constructor stub
	
	}


	

}
