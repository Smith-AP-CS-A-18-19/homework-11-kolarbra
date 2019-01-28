import java.util.ArrayList;

public class Homework11A extends Homework11 {

  ArrayList<Integer> arre;

  public Homework11A() {
    super();
    arre = arr;
  }

  public int problem4() {
    int sum = 0;
    for (int i = 0; i < arre.size(); i++) {
      sum += arre.get(i);
    }
    return sum;
  }

  @Override
  public void problem2(int n) {
		int size = arre.size();
		int ind = 0;
		for (int i = 0; i < size; i++) {
			if (n % arre.get(ind) != 0) {
				arre.remove(ind);
			} else {
				ind++;
			}
		}
	}

}
