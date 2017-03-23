package com.example.rest.services;



import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest.dto.Example;

@RestController
@RequestMapping("/example")
public class exampleService {
	
	public  List<Example> listExample =new ArrayList<Example>(){
	
		private static final long serialVersionUID = 8497507301123368599L;

	{
		add(0, new Example(1L,"",""));
		add(1, new Example(2L,"",""));
		add(2, new Example(3L,"",""));
		add(3, new Example(4L,"",""));
		add(4, new Example(5L,"",""));
		add(5, new Example(6L,"",""));
		add(6, new Example(7L,"",""));
		add(7, new Example(8L,"",""));
		add(8, new Example(9L,"",""));
		add(9, new Example(10L,"",""));
	}};
	

	
	@GetMapping("/getAll")
	public List<Example> getAll(){
	
		return listExample;
		
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public List<Example> delete(@PathVariable int id){
		for(Example e : listExample){
			if(e.getId().intValue() == id){
				listExample.remove(e);
				break;
			}
		}
		return listExample;
	}
	
	@PutMapping(value = "/put")
	public List<Example> put(@RequestBody Example example){
//		Example ex = new Example();
		for(Example ex : listExample){
			if(ex.getId() == example.getId()){
				ex.setId(example.getId());
				ex.setDescription(example.getDescription());
				ex.setName(example.getName());
			}
		}
		return listExample;
	}
	@PostMapping(value = "/add")
	public List<Example> add(@RequestBody Example example){
		 example.setId(1L + listExample.size());
		listExample.add(example);
		return listExample;
	}

	@GetMapping("/example2")
	public Example first(){
		Example example = new Example();
		example.setId(1L);
		example.setName("name test");
		example.setDescription("test description");
		return example;
		
	}
	
	@PostMapping("postExample")
	public Example postExample(@RequestBody Example example){
		return example;
	}
}
