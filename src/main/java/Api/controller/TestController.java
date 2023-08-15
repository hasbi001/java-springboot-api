package Api.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*; 
import java.lang.reflect.Array;
import org.json.JSONArray;
import org.json.JSONException;


@RestController
@AllArgsConstructor
@RequestMapping("/api/test")
public class TestController {

	@RequestMapping(value = "count-data/{x}/{y}")
	@ResponseBody
	public Integer countData(@PathVariable Integer x,@PathVariable Integer y){
		return add(x,y);
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

		return result;
	}
	
	@RequestMapping(value = "fibonacy/json/{x}")
	@ResponseBody
	public JSONArray fibonacyJson(@PathVariable Integer x) {
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		int count=1;    
		for(int i = 0; i < x; i++) {		
			if (count <= 1) {
				result.add(count);
			} else {
				int before1 = result.get(i-1);
				int before2 = result.get(i-2);
				
				int value = before1 + before2;
				result.add(value);
			}
		}

		JSONArray jsonresult = new JSONArray(result);
		return jsonresult;
	}
	
	
	public Integer add(Integer x, Integer y) {
		return x+y;
	}
}
