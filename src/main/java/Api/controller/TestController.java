package Api.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@AllArgsConstructor
@RequestMapping("api/test")
public class TestController {

	@RequestMapping(value = "count-data/{x}/{y}")
	@ResponseBody
	public Integer countData(@PathVariable Integer x,@PathVariable Integer y){
	    Integer count;
	    count = x+y;
		return count;
	}
	
}
