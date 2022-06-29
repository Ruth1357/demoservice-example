package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repo.myservice;

@RestController
public class mycontroller {
@Autowired
private myservice obj;
//int[] array= [1,14,50,6];
@GetMapping("/bubblesort")
public int[]  bsort(@RequestBody int[] array) {
	obj.bubblesort(array);
	return array;
}
@GetMapping("/quicksort")
public int[]  quicksort(@RequestBody int[] array) {
	obj.quicksort(array, 0, (array.length-1));
	return array;
}

}
