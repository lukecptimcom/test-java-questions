package org.test.testytest.helper;

import java.util.List;

public interface FinderService {
	List<Float> generateRandomListOfMax(Integer myitem);

	Integer makeItRounded(Float myFloat);

	List<Integer> limitToSize(Integer maxSize);
}
