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
		rp1 = p1.getFactorial();
		model.addAttribute("num", num);
		model.addAttribute("rp1", rp1);
		
		return "punto1";
		
	}
	
	@GetMapping ("/punto2")
	public String getPunto2(@RequestParam (name = "year") int year , Model model) {
		String rp2;
		
		Modelo p2 = new Modelo();
		p2.setA(year);
		rp2 = p2.getBisiesto();
		model.addAttribute("year", year);
		model.addAttribute("rp2", rp2);
		
		return "punto2";
	
	}
	
	@GetMapping("/punto3")
	public String getPunto3(@RequestParam(name = "n1") int n1 , @RequestParam(name = "n2") int n2 , @RequestParam(name = "n3") int n3 , @RequestParam(name = "n4") int n4 , @RequestParam(name = "n5") int n5 , Model model) {
		String rn1, rn2, rn3, rn4, rn5;
		
		Modelo p3 = new Modelo();
		p3.setA(n1);
		rn1 = p3.getPar();
		p3.setA(n2);
		rn2 = p3.getPar();
		p3.setA(n3);
		rn3 = p3.getPar();
		p3.setA(n4);
		rn4 = p3.getPar();
		p3.setA(n5);
		rn5 = p3.getPar();
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
		rp4 = p4.getMes1();
		model.addAttribute("month", month);
		model.addAttribute("rp4", rp4);

		return "punto4";
		
	}
	
	@GetMapping("/punto5")
	public String getPunto5(@RequestParam(name = "month") int month , Model model) {
		String rp5;
		
		Modelo p5 = new Modelo();
		p5.setA(month);
		rp5 = p5.getMes2();
		model.addAttribute("month", month);
		model.addAttribute("rp5", rp5);

		return "punto5";
		
	}
	
	@GetMapping("/punto6")
	public String getPunto6(@RequestParam(name = "note") int note , Model model) {
		String rp6;
		
		Modelo p6 = new Modelo();
		p6.setA(note);
		rp6 = p6.getNota();
		model.addAttribute("note", note);
		model.addAttribute("rp6", rp6);

		return "punto6";
		
	}
	
	@GetMapping("/punto7")
	public String getPunto7(@RequestParam(name = "j") int j , @RequestParam(name = "i") int i , Model model) {
		int c=0;
		int[] rp7 = new int[41];
		
		Modelo p7 = new Modelo();
		for(j=40 ; j>=0 ; j--) {
			p7.setA(j);
			p7.setB(i);
			rp7[c] = p7.getSecuencia();
			c++;
			i++;
		}
		model.addAttribute("rp7a0", rp7[0]); model.addAttribute("rp7a1", rp7[1]); model.addAttribute("rp7a2", rp7[2]); model.addAttribute("rp7a3", rp7[3]); model.addAttribute("rp7a4", rp7[4]);
		model.addAttribute("rp7a5", rp7[5]); model.addAttribute("rp7a6", rp7[6]); model.addAttribute("rp7a7", rp7[7]); model.addAttribute("rp7a8", rp7[8]); model.addAttribute("rp7a9", rp7[9]);
		model.addAttribute("rp7a10", rp7[10]); model.addAttribute("rp7a11", rp7[11]); model.addAttribute("rp7a12", rp7[12]); model.addAttribute("rp7a13", rp7[13]); model.addAttribute("rp7a14", rp7[14]);
		model.addAttribute("rp7a15", rp7[15]); model.addAttribute("rp7a16", rp7[16]); model.addAttribute("rp7a17", rp7[17]); model.addAttribute("rp7a18", rp7[18]); model.addAttribute("rp7a19", rp7[19]);
		model.addAttribute("rp7a20", rp7[20]); model.addAttribute("rp7a21", rp7[21]); model.addAttribute("rp7a22", rp7[22]); model.addAttribute("rp7a23", rp7[23]); model.addAttribute("rp7a24", rp7[24]);
		model.addAttribute("rp7a25", rp7[25]); model.addAttribute("rp7a26", rp7[26]); model.addAttribute("rp7a27", rp7[27]); model.addAttribute("rp7a28", rp7[28]); model.addAttribute("rp7a29", rp7[29]);
		model.addAttribute("rp7a30", rp7[30]); model.addAttribute("rp7a31", rp7[31]); model.addAttribute("rp7a32", rp7[32]); model.addAttribute("rp7a33", rp7[33]); model.addAttribute("rp7a34", rp7[34]);
		model.addAttribute("rp7a35", rp7[35]); model.addAttribute("rp7a36", rp7[36]); model.addAttribute("rp7a37", rp7[37]); model.addAttribute("rp7a38", rp7[38]); model.addAttribute("rp7a39", rp7[39]);
		model.addAttribute("rp7a40", rp7[40]);
		
		return "punto7";
		
	}
	
	@GetMapping("/punto8")
	public String getPunto8(@RequestParam(name = "m") int m , Model model) {
		int c=0, i=1, r=0;
		int[] rp8 = new int[25];
		
		Modelo p8 = new Modelo();
		do {
			p8.setA(m);
			p8.setB(i);
			rp8[c] = p8.getSecuencia();
			r = rp8[c];
			c++;
			i++;
		}while(r < 100);
		model.addAttribute("m", m);
		model.addAttribute("rp8a0", rp8[0]); model.addAttribute("rp8a1", rp8[1]); model.addAttribute("rp8a2", rp8[2]); model.addAttribute("rp8a3", rp8[3]); model.addAttribute("rp8a4", rp8[4]);
		model.addAttribute("rp8a5", rp8[5]); model.addAttribute("rp8a6", rp8[6]); model.addAttribute("rp8a7", rp8[7]); model.addAttribute("rp8a8", rp8[8]); model.addAttribute("rp8a9", rp8[9]);
		model.addAttribute("rp8a10", rp8[10]); model.addAttribute("rp8a11", rp8[11]); model.addAttribute("rp8a12", rp8[12]); model.addAttribute("rp8a13", rp8[13]); model.addAttribute("rp8a14", rp8[14]);
		model.addAttribute("rp8a15", rp8[15]); model.addAttribute("rp8a16", rp8[16]); model.addAttribute("rp8a17", rp8[17]); model.addAttribute("rp8a18", rp8[18]); model.addAttribute("rp8a19", rp8[19]);
		model.addAttribute("rp8a20", rp8[20]); model.addAttribute("rp8a21", rp8[21]); model.addAttribute("rp8a22", rp8[22]); model.addAttribute("rp8a23", rp8[23]); model.addAttribute("rp8a24", rp8[24]);
		
		return "punto8";
		
	}
	
	@GetMapping ("/punto9")
	public String getPunto9(@RequestParam (name = "c") int c , Model model) {
		int i, x=0;
		int[] rp9 = new int[9];
		
		Modelo p9 = new Modelo();
		for(i=c+20 ; i > 160 ; i=i-20) {
			p9.setA(i);
			rp9[x] = p9.getCuenta();
			x++;
		}
		model.addAttribute("c", c);
		model.addAttribute("rp9a0", rp9[0]); model.addAttribute("rp9a1", rp9[1]); model.addAttribute("rp9a2", rp9[2]); model.addAttribute("rp9a3", rp9[3]);
		model.addAttribute("rp9a4", rp9[4]); model.addAttribute("rp9a5", rp9[5]); model.addAttribute("rp9a6", rp9[6]); model.addAttribute("rp9a7", rp9[7]);
		model.addAttribute("rp9a8", rp9[8]);
		
		return "punto9";
		
	}
	
	@GetMapping ("/punto10")
	public String getPunto10(@RequestParam (name = "c") int c , Model model) {
		int i=c+20, x=0;
		int[] rp10 = new int[9];
		
		Modelo p10 = new Modelo();
		while(i > 160) {
			p10.setA(i);
			rp10[x] = p10.getCuenta();
			x++;
			i=i-20;
		}
		model.addAttribute("c", c);
		model.addAttribute("rp10a0", rp10[0]); model.addAttribute("rp10a1", rp10[1]); model.addAttribute("rp10a2", rp10[2]); model.addAttribute("rp10a3", rp10[3]);
		model.addAttribute("rp10a4", rp10[4]); model.addAttribute("rp10a5", rp10[5]); model.addAttribute("rp10a6", rp10[6]); model.addAttribute("rp10a7", rp10[7]);
		model.addAttribute("rp10a8", rp10[8]);
		
		return "punto10";
		
	}
	
	@GetMapping ("/punto11")
	public String getPunto11(@RequestParam (name = "c") int c , Model model) {
		int i=c+20, x=0;
		int[] rp11 = new int[9];
		
		Modelo p11 = new Modelo();
		do {
			p11.setA(i);
			rp11[x] = p11.getCuenta();
			x++;
			i=i-20;
		}while(i > 160);
		model.addAttribute("c", c);
		model.addAttribute("rp11a0", rp11[0]); model.addAttribute("rp11a1", rp11[1]); model.addAttribute("rp11a2", rp11[2]); model.addAttribute("rp11a3", rp11[3]);
		model.addAttribute("rp11a4", rp11[4]); model.addAttribute("rp11a5", rp11[5]); model.addAttribute("rp11a6", rp11[6]); model.addAttribute("rp11a7", rp11[7]);
		model.addAttribute("rp11a8", rp11[8]);
		
		return "punto11";
		
	}
	
	@GetMapping ("/punto12")
	public String getPunto12(@RequestParam (name = "h") int h , Model model) {
		double rp12 = 0;
		
		Modelo p12 = new Modelo();
		p12.setC(h);
		rp12 = p12.getTiempo();
		model.addAttribute("h", h);
		model.addAttribute("rp12", rp12);
		
		return "punto12";
		
	}
	
}
