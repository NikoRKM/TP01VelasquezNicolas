package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component

public class Modelo {
		
		//Attributes
		private int a;
		private int b;
		private double c;
		private boolean band;
		private String respuesta;
		
		//Constructors
		public Modelo() {
		}
		
		//Getters and Setters
		public int getA() {
			return a;
		}
		
		public int getB() {
			return b;
		}
		
		public double getC() {
			return c;
		}
		
		public boolean getBand() {
			return band;
		}
		
		public String getRespuesta() {
			return respuesta;
		}
		
		public void setA(int a) {
			this.a = a;
		}
		
		public void setB(int b) {
			this.b = b;
		}
		
		public void setC(double c) {
			this.c = c;
		}
		
		public void setBand(boolean band) {
			this.band = band;
		}
		
		public void setRespuesta(String respuesta) {
			this.respuesta = respuesta;
		}
		
		//Operations
		public int getFactorial() {
			while(a > 0) {
				b=a*b;
				a--;
			}
			return b;
		}
		
		public String getBisiesto() {
			if( ((a % 4 == 0) && (a % 100 != 0)) || (a % 400 == 0) ) {
				respuesta = "si es bisiesto";
			}else {
				respuesta = "no es bisiestor";
			}
			return respuesta;
		}
		
		public String getPar() {
			if(a % 2 == 0){
				respuesta = "par";
			}else {
				respuesta = "impar";
			}
			return respuesta;
		}
		
		public String getMes1() {
			if(a == 1) {
				respuesta = "Enero";
			}else if(a == 2) {
				respuesta = "Febrero";
			}else if(a == 3) {
				respuesta = "Marzo";
			}else if(a == 4) {
				respuesta = "Abril";
			}else if(a == 5) {
				respuesta = "Mayo";
			}else if(a == 6) {
				respuesta = "Junio";
			}else if(a == 7) {
				respuesta = "Julio";
			}else if(a == 8) {
				respuesta = "Agosto";
			}else if(a == 9) {
				respuesta = "Septiembre";
			}else if(a == 10) {
				respuesta = "Octubre";
			}else if(a == 11) {
				respuesta = "Noviembre";
			}else if(a == 12) {
				respuesta = "Diciembre";
			}else {
				respuesta = "inexistente";
			}
			return respuesta;
		}
		
		public String getMes2() {
			switch(a) {
				case 1:
					respuesta = "Enero";
					break;
				case 2:
					respuesta = "Febrero";
					break;
				case 3:
					respuesta = "Marzo";
					break;
				case 4:
					respuesta = "Abril";
					break;
				case 5:
					respuesta = "Mayo";
					break;
				case 6:
					respuesta = "Junio";
					break;
				case 7:
					respuesta = "Julio";
					break;
				case 8:
					respuesta = "Agosto";
					break;
				case 9:
					respuesta = "Septiembre";
					break;
				case 10:
					respuesta = "Octubre";
					break;
				case 11:
					respuesta = "Noviembre";
					break;
				case 12:
					respuesta = "Diciembre";
					break;
				default:
					respuesta = "inexistente";
			}
			return respuesta;
		}
		
		public String getNota() {
			if(a == 6) {
				respuesta = "Regulariza";
			}else if( (a >= 7) && (a <= 10) ) {
				respuesta = "Promociona";
			}else if( (a < 6) && (a >=1) ) {
				respuesta = "Desaprueba";
			}else if(a <= 0) {
				respuesta = "Valor no permitido";
			}else {
				respuesta = "Valor incorrecto";
			}
			return respuesta;
		}
		
		public int getSecuencia() {
			return a*b;
		}
		
		public int getCuenta() {
			return a-20;
		}
		
		public double getTiempo() {
			return Math.sqrt((2 * c)/(9.81));
		}
}
