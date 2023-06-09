package br.com.erudio;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {
	
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double sum(@PathVariable(value = "numberOne") String numberOne,
					  @PathVariable(value = "numberTwo") String numberTwo)
		throws Exception{
		
			if(!isNumeric(numberOne) || !isNumeric(numberTwo)) {
				throw new Exception();
			}
		
		return convertDouble(numberOne) + convertDouble(numberTwo);
		
	}
	
	private Double convertDouble(String strNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	private boolean isNumeric(String numberOne) {
		// TODO Auto-generated method stub
		return false;
	}

}

	
