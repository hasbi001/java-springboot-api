package Api.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*; 
import java.lang.reflect.Array;
import static org.junit.Assert.*;


@RestController
@AllArgsConstructor
@RequestMapping("/api/test")
public class TestController {

	@RequestMapping(value = "count-data/{x}/{y}")
	@ResponseBody
	public Integer countData(@PathVariable Integer x,@PathVariable Integer y){
	    Integer count;
	    count = x+y;
		return count;
	}
	
	@RequestMapping(value = "fibonacy/{x}")
	@ResponseBody
	public ArrayList<Integer> fibonacy(@PathVariable Integer x) {
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		    
		for(int i = 0; i < x; i++) {		
			if (i < 2) {
				result.add(1);
			} else {
				int before1 = result.get(i-1);
				int before2 = result.get(i-2);
				
				int value = before1 + before2;
				result.add(value);
			}
		}

		int n = 3;

		System.out.print("Bilangan fibonacci pada posisi " + n + " adalah ");
		// get fibonacci pada posisi ke-4
		System.out.println(result.get(n));

		System.out.println("\nBarisan fibonacci " + x + " bilangan pertama:");
		// print semua ArrayList
		result.forEach((e) -> System.out.println(e));
		return result;
	}
	
}
