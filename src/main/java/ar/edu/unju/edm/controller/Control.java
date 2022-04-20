package ar.edu.unju.edm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ar.edu.unju.edm.model.Modelo;

@Controller
public class Control {
	
	@GetMapping ("/menu")
	public String getMenu() {
		return "index";
	}
	
	@GetMapping ("/punto1")
	public String getPunto1(@RequestParam (name = "num") int num , Model model) {
		int rp1 = 0, aux = 1;
		
		Modelo p1 = new Modelo();
		p1.setA(num);
		p1.setB(aux);
		rp1 = p1.factorial();
		model.addAttribute("num", num);
		model.addAttribute("rp1", rp1);
		
		return "punto1";
		
	}
	
	@GetMapping ("/punto2")
	public String getPunto2(@RequestParam (name = "year") int year , Model model) {
		String rp2;
		
		Modelo p2 = new Modelo();
		p2.setA(year);
		rp2 = p2.bisiesto();
		model.addAttribute("year", year);
		model.addAttribute("rp2", rp2);
		
		return "punto2";
	
	}
	
	@GetMapping("/punto3")
	public String getPunto3(@RequestParam(name = "n1") int n1 , @RequestParam(name = "n2") int n2 , @RequestParam(name = "n3") int n3 , @RequestParam(name = "n4") int n4 , @RequestParam(name = "n5") int n5 , Model model) {
		String rn1, rn2, rn3, rn4, rn5;
		
		Modelo p3 = new Modelo();
		p3.setA(n1);
		rn1 = p3.par();
		p3.setA(n2);
		rn2 = p3.par();
		p3.setA(n3);
		rn3 = p3.par();
		p3.setA(n4);
		rn4 = p3.par();
		p3.setA(n5);
		rn5 = p3.par();
		model.addAttribute("n1", n1);
		model.addAttribute("rn1", rn1);
		model.addAttribute("n2", n2);
		model.addAttribute("rn2", rn2);
		model.addAttribute("n3", n3);
		model.addAttribute("rn3", rn3);
		model.addAttribute("n4", n4);
		model.addAttribute("rn4", rn4);
		model.addAttribute("n5", n5);
		model.addAttribute("rn5", rn5);
		
		return "punto3";
		
	}
	
	@GetMapping("/punto4")
	public String getPunto4(@RequestParam(name = "month") int month , Model model) {
		String rp4;
		
		Modelo p4 = new Modelo();
		p4.setA(month);
		rp4 = p4.mes1();
		model.addAttribute("month", month);
		model.addAttribute("rp4", rp4);

		return "punto4";
		
	}
	
	@GetMapping("/punto5")
	public String getPunto5(@RequestParam(name = "month") int month , Model model) {
		String rp5;
		
		Modelo p5 = new Modelo();
		p5.setA(month);
		rp5 = p5.mes2();
		model.addAttribute("month", month);
		model.addAttribute("rp5", rp5);

		return "punto5";
		
	}
	
	@GetMapping("/punto6")
	public String getPunto6(@RequestParam(name = "note") int note , Model model) {
		String rp6;
		
		Modelo p6 = new Modelo();
		p6.setA(note);
		rp6 = p6.nota();
		model.addAttribute("note", note);
		model.addAttribute("rp6", rp6);

		return "punto6";
		
	}
	
}
