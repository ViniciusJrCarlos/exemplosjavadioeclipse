package cursojavadio.metodos;

public class Usuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SmartTv smartTv = new SmartTv();
		
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.aumentarVolume();
		
		System.out.println("Canal Atual: " + smartTv.canal);
		
		smartTv.mudarCanal(13);
		
		System.out.println("Canal Atual: " + smartTv.canal);
		
		System.out.println("TV Ligada ? " + smartTv.ligada);
		
		System.out.println("Volume Atual: " + smartTv.volume);

		smartTv.ligar();
		System.out.println("Novo Status -> TV ligada ? " + smartTv.ligada);
		
		smartTv.desligar();
		System.out.println("Novo Status -> TV ligada ? " + smartTv.ligada);
		
		
		
		
	}

}
