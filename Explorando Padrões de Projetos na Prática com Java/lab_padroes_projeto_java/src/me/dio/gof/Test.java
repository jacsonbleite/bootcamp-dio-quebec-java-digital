package me.dio.gof;

import me.dio.gof.facade.Facade;
import me.dio.gof.singleton.SingletonEager;
import me.dio.gof.singleton.SingletonLazy;
import me.dio.gof.singleton.SingletonLazyHolder;
import me.dio.gof.strategy.Comportamento;
import me.dio.gof.strategy.ComportamentoAgressivo;
import me.dio.gof.strategy.ComportamentoDefensivo;
import me.dio.gof.strategy.ComportamentoNormal;
import me.dio.gof.strategy.Robo;

public class Test {

	public static void main(String[] args) {
		
		/** SINGLETON INICIO **/
		
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		

		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
		System.out.println(holder);
		
		holder = SingletonLazyHolder.getInstancia();
		System.out.println(holder);		
		
		/** SINGLETON FIM **/
		
		
		/** STRATEGY INICIO **/
		
		Comportamento normal = new ComportamentoNormal();
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		
		robo.setComportamento(defensivo);
		robo.mover();
		
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();		
		
		/** STRATEGY FIM **/
		
		
		/** FACADE INICIO **/
		
		Facade facade = new Facade();
		facade.migrarCliente("Jacson", "76800000");
		
		/** FACADE FIM **/

	}

}
