import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Coverage {

	public static int function(int a, int b, int c) {
		
		int d = 0;
		if (a + b > 5) {
			if (a > 3) {
				d += 1;
			}
			d += 1;
		}else if(a + b > 3) {
			d += 1;
		}		
		if(c > 4) {
			d += 1;
		}
		return d;
	}

	@Test
	public void codeComplete() {
		//TODO: Implement test cases for code complete, for question A1
	}
	
	@Test
	public void branchComplete() {
		//TODO: Implement test cases for branch complete, for question A2
	}
	
	@Test
	public void pathComplete() {
		//TODO: Implement test cases for path complete, for question A3
	}
	
}
