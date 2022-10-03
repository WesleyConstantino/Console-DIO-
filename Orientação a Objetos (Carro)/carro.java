public class carro {
 String modelo;
 String cor;
 int capacidadeTanque;

 //construtor
 carro(){
	 
 }
 
 carro(String modelo, String cor, int capacidadeTanque){
	 this.modelo = modelo;
	 this.cor = cor;
	 this.capacidadeTanque = capacidadeTanque;
	 this.valorCombustivel = valorCombustivel;
 }
 
 //gets e sets  
 void setCor(String cor) {
  this.cor = cor;
 }
 
 String getCor() {
	 return cor;
 }
 
 void setModelo(String modelo) {
	 this.modelo = modelo;
 }
 
 String getModelo() {
	 return modelo;
 }
 
 void setCapacidadeTanque(int capacidadeTanque) {
	 this.capacidadeTanque = capacidadeTanque;
 }
 
 int getCapacidadeTanque() {
	 return capacidadeTanque;
 }
}
