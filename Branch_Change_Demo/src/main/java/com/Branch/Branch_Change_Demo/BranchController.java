package com.Branch.Branch_Change_Demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BranchController {
@RequestMapping("/test")
public String test()
{
	return "branch change test";
}
}
