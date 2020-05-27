package com.example.boot_demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.boot_demo.pojo.Property;

@Service
public class BusinessService {

//	public List<String> getAllComb(String number) {
//		RestTemplate rt = new RestTemplate();
//		Property property = rt.getForObject(url, Property.class);
//		return property;
//	}
	
    public static List<String> letterCombinations(String digits) {
        String digitletter[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> result = new ArrayList<String>();

        if (digits.length()==0) return result;
        
        result.add("");
        for (int i=0; i<digits.length(); i++) 
            result = combine(digitletter[digits.charAt(i)-'0'],result);
        
        return result;
    }
    
    public static List<String> combine(String digit, List<String> l) {
        List<String> result = new ArrayList<String>();
        
        for (int i=0; i<digit.length(); i++) 
            for (String x : l) 
                result.add(x+digit.charAt(i));

        return result;
    }
}
