package ec.edu.espol;

public class CalService {
	
	ICalculator cal;
	
	public ICalculator getCal() {
		return cal;
	}

	public void setCal(ICalculator cal) {
		this.cal = cal;
	}

	public int AddTwoNumbers(int x, int y){
		
		return cal.add(x,y);
		
	}

}
