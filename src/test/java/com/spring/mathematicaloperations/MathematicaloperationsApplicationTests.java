package com.spring.mathematicaloperations;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MathematicaloperationsApplicationTests {
	@Test
	void contextLoads() {
	}
	@Test
	//Perform test to check whether the operations of Add working
	void CalculateTest_TestAddOperations_IsTrue(){
		var calculate_obj = new Calculation();
		int result = calculate_obj.Calculate("+",1,3);
		Assert.assertEquals(result,4);
	}
	@Test
		//Perform test to check whether the operations of Sub working
	void CalculateTest_TestSubOperations_IsTrue(){
		var calculate_obj = new Calculation();
		int result = calculate_obj.Calculate("-",1,4);
		Assert.assertEquals(result,-3);
	}
	@Test
		//Perform test to check whether the operations of Multiply working
	void CalculateTest_TestMultiplyOperations_IsTrue(){
		var calculate_obj = new Calculation();
		int result = calculate_obj.Calculate("*",1,2);
		Assert.assertEquals(result,2);
	}
	@Test
		//Perform test to check whether other operators returns default value
	void CalculateTest_TestAnyOperations_IsTrue() {
		var calculate_obj = new Calculation();
		int result = calculate_obj.Calculate("/",1,2);
		Assert.assertEquals(result,0);
	}

/*	@Test
	public void RestURLTest() throws Exception{
		RequestBuilder requestBuilder = MockMvcRequestBuilders
				.get("/Calculate/+/1/2");
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		MockHttpServletResponse response = result.getResponse();
		Assert.assertEquals(HttpStatus.CREATED.value(), response.getStatus());
		Assert.assertEquals("http://localhost:8084/Calculate/+/1/2",
				response.getHeader(HttpHeaders.LOCATION));
	}*/
}
