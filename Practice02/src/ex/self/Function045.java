package ex.self;

import java.util.Objects;

public class Function045 {

	private static final int N_UPPER_BOUND = 101;
	private final int n;
	
	public Function045(int n) {
		/*if(n < 0 || n >= N_UPPER_BOUND) {
			throw new IndexOutOfBoundsException("범위 초과");
		}
		this.n = n;*/
		this.n = Objects.checkIndex(n, N_UPPER_BOUND);
	
	}
	
	public int yMinusX(int x, int y) {
		if(x<0 || x>y || y>=n) {
			throw new IndexOutOfBoundsException("x,y 범위 초과");
		}
		return x - y;
	}
	
	public int checkIndexYX(int x, int y) {
		Objects.checkFromToIndex(x, y, n);
		return y - x;
	}
}
