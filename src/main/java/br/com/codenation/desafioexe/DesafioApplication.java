package br.com.codenation.desafioexe;

import java.util.ArrayList;
import java.util.List;

public class DesafioApplication {

	public static List<Integer> fibonacci() {
		int numeroLimite = 350;
		int numeroAnterior = 0;
		int proximoNumero = 1;
		List<Integer> sequenciaFibonacci = new ArrayList<>();

		while (numeroAnterior <= numeroLimite) {
			sequenciaFibonacci.add(numeroAnterior);

			int soma = numeroAnterior + proximoNumero;
			numeroAnterior = proximoNumero;
			proximoNumero = soma;
		}
		sequenciaFibonacci.add(numeroAnterior);

		return sequenciaFibonacci;
	}

	public static Boolean isFibonacci(Integer a) {

		return fibonacci().contains(a);
	}

}