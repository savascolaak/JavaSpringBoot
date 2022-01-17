package kodlamaio.northwind.core.utilities.results;

public class Result {
	private boolean success;
	private String message;
	
	public Result(boolean success) {
	this.success=success;
		
	}
	public Result(boolean success, String message) {
		this(success);
		this.message=message;
		
	}
	
	//Success Get
	public boolean isSuccess() {
		return this.success;
		
	}
	//Message Get
	public String getMessage() {
		return this.message;
				
	}
	
}

