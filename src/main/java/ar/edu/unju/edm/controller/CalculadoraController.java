package ar.edu.unju.edm.controller;
import org.springframework.stereotype.Controller;

import ar.edu.unju.edm.model.Calculadora;

@Controller

public class CalculadoraController {
	@GetMapping("/menu")
	public String obtenerMenu () {
	return ("index");
		
}
    @GetMapping("/calculoSuma")
    public String getSuma(@RequestParam(name="n1")int n1,@RequestParam(name="n2")int n2,Model model) {
    	int resultadoSuma;
    	Calculadora nuevaCalculadora = new Calculadora();
    	nuevaCalculadora.setNumero1(n1);
    	nuevaCalculadora.setNumero2(n2);
    	resultadoSuma=nuevaCalculadora.suma();
    	model.addAttribute("resultadoSuma", resultadoSuma);
    	return "resultadosuma";
    }      
    
    @GetMapping("/calculoResta")
    public String getResta(@RequestParam(name="n1")int n1,@RequestParam(name="n2")int n2,Model model) {
    	int resultadoResta;
    	Calculadora nuevaCalculadora = new Calculadora();
    	nuevaCalculadora.setNumero1(n1);
    	nuevaCalculadora.setNumero2(n2);
    	resultadoResta=nuevaCalculadora.resta();
    	model.addAttribute("resultadoResta", resultadoResta);
    	return "resultadoresta";
    }      
    
    @GetMapping("/calculoMultiplica")
    public String getMultiplica(@RequestParam(name="n1")int n1,@RequestParam(name="n2")int n2,Model model) {
    	int resultadoMult;
    	Calculadora nuevaCalculadora = new Calculadora();
    	nuevaCalculadora.setNumero1(n1);
    	nuevaCalculadora.setNumero2(n2);
    	resultadoMult=nuevaCalculadora.multiplicar();
    	model.addAttribute("resultadoMult", resultadoMult);
    	 	return "resultadomult";
    }      

     
    @GetMapping("/calculoDivide")
    public String getDivide(@RequestParam(name="n1")int n1,@RequestParam(name="n2")int n2,Model model) {
    	double resultadoDiv;
    	Calculadora nuevaCalculadora = new Calculadora();
    	nuevaCalculadora.setNumero1(n1);
    	nuevaCalculadora.setNumero2(n2);
    	resultadoD=nuevaCalculadora.dividir();
    	model.addAttribute("resultadoDiv", resultadoDiv);
    	return "resultadodiv";
    }    
    
    
    @GetMapping("/calculoRaiz")
    public String getRaiz(@RequestParam(name="n1")int n1,Model model) {
    	int resultadoRaiz;
    	Calculadora nuevaCalculadora = new Calculadora();
    	nuevaCalculadora.setNumero1(n1);
    	resultadoRaiz=nuevaCalculadora.raiz();
    	model.addAttribute("resultadoRaiz", resultadoRaiz);
    	return "resultadoraiz";
    }      
    
    @GetMapping("/calculoRaizN")
    public String getRaizN(@RequestParam(name="n1")int n1,@RequestParam(name="n2")int n2,Model model) {
    	double resultadoRaizN;
    	Calculadora nuevaCalculadora = new Calculadora();
    	nuevaCalculadora.setNumero1(n1);
    	nuevaCalculadora.setNumero2(n2);
    	resultadoRaizN=nuevaCalculadora.raizn();
    	model.addAttribute("resultadoRaizN", resultadoRaizN);
    	return "resultadoraizn";
    }      
    
    
     
    @GetMapping("/calculoPotencia")
    public String getPotencia(@RequestParam(name="n1")int n1,@RequestParam(name="n2")int n2,Model model) {
    	int resultadoPot;
    	Calculadora nuevaCalculadora = new Calculadora();
    	nuevaCalculadora.setNumero1(n1);
    	nuevaCalculadora.setNumero2(n2);
    	resultadoPot=nuevaCalculadora.potencia();
    	model.addAttribute("resultadoPot", resultadoPot);
    	return "resultadopot";
    }      
}
