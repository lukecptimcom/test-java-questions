package org.test.testytest.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.test.testytest.helper.FinderService;

/**
 * This piece of code is an exercise to test your understanding of the code.
 * 
 * 1. Please describe the purpose of this code.
 * (Including any spring specific functionality and annotations that are used in the code).
 * 
 * 2. Please highlight any areas where you feel that this code should be refactored, or improved to fit with SpringBoot standards.
 * 
 * 3. Please highlight any other general areas where you feel as if it could be made more readable.
 * 
 * 4. (General) Are there any features of Java8 that might be useful here in order to cut down the extra pieces of code?
 *
 */
@Service
public class MyLovelyServiceImpl implements MyLovelyService {
	
	@Autowired
	FinderService s;
	
	public List<Integer> gettingAListOfItems(Integer myitem) {
		final Integer xs = 10;
		List<Integer> r = new ArrayList<Integer>();
		List<Float> listOfRandomItems = s.generateRandomListOfMax(myitem);
		Iterator i = listOfRandomItems.iterator();
		
		while(i.hasNext()) {
			Float f = (Float) i.next();
			Integer rnr = s.makeItRounded(f);
			r.add(rnr);
		}
		
		r = s.limitToSize(xs);
		
		return r;
	}

}
