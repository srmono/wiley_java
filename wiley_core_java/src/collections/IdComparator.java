package collections;

import java.util.Comparator;

public class IdComparator implements Comparator<GeniusStudent> {

	@Override
	public int compare(GeniusStudent o1, GeniusStudent o2) {
		// TODO Auto-generated method stub
		if (o1.getId() == o2.getId()) {
			//return 0;
			return o1.getName().compareTo(o2.getName());
		} else if (o1.getId() > o2.getId()) {
			return 1;
		} else {
			return -1;
		}
	}

}
