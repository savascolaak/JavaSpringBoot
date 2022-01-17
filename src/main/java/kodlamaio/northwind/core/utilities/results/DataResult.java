package kodlamaio.northwind.core.utilities.results;

public class DataResult<T> extends Result {
	
	private T data;
	public DataResult(T data,boolean success, String message) {
		super(success, message);//base sınıfa gönderiyoruz
		this.data = data;
		// TODO Auto-generated constructor stub
	}
	public DataResult(T data,boolean success) {
		super(success);//base sınıfa gönderiyoruz
		this.data = data;
		// TODO Auto-generated constructor stub
	}
	
	public T getData() {
		return this.data;
		
	}
}
