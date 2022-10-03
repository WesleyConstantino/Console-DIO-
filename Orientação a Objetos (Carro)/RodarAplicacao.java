class RodarAplicacao {

	public static void main(String[] args) {

     carro carro1 = new carro();
     
     carro1.setCor("Cinza");
     carro1.setModelo("Civic");
     carro1.setCapacidadeTanque(56);
    
     System.out.println(carro1.getModelo());
     System.out.println(carro1.getCor());
     System.out.println(carro1.getCapacidadeTanque());
     
     carro carro2 = new carro();
     
     carro2.setCor("Chumbo");
     carro2.setModelo("HR-V");
     carro2.setCapacidadeTanque(66);
     
     System.out.println(carro2.getModelo());
     System.out.println(carro2.getCor());
     System.out.println(carro2.getCapacidadeTanque());

	}

}
