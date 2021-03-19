package main;

import processing.core.PApplet;

//Primero se le da play a este y luego al android
public class Main extends PApplet {
	

	PApplet app;
	int xBall = 250;
	int yBall = 200;
	int r,g,b, tam;
	
	//Instancia
	private TCPconection conexion;
	
	public static void main(String[] args) {
		PApplet.main("main.Main");
	}

		public void settings() {
		size(500, 500);
	}

		public void setup() {
		conexion = new TCPconection();
		//Método que creamos en el TCPconection (Metodo de suscripcion)
		conexion.setMain(this);
		//Esto inicia el hilo
		conexion.start();
	}

	// Inifito
	public void draw() {
		background(0, 0, 0);
		fill(r,g,b);
		ellipse(xBall, yBall, tam, tam);
	}

	public void mover(MovBall bolaaa) {
		xBall = bolaaa.getPosX();
		yBall = bolaaa.getPosY();
		r = bolaaa.getR();
		g = bolaaa.getG();
		b = bolaaa.getB();
		tam = bolaaa.getTam();

	}
	

}

