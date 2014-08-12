public class Main {

	public static void main(String[] args) {

		Encomenda enc = new Encomenda();

		enc.setDestino(new Endereco("Av. Brasil, 1200", Cidade.PORTO_ALEGRE));

		enc.setOrigem(new Endereco("Av. Rio Grande, 2400", Cidade.BAGE));
		
		enc.setPeso(Peso.gramas(550));
		
		enc.setVolume(Volume.cm3(50));
		
	}

}