package main;

import java.util.ArrayList;
import java.util.List;

import processing.core.PApplet;

public class main  extends PApplet {
	
	private int amountOfParticles = 200;
	private List<Particle> list;
	
	public float gbestx = 0;
	public float gbesty = 0;
	public float gbestVal = Float.MIN_VALUE;
	
	private int bestx = 200;
	private int besty = 200;
	
	public void setup() {
		size(800,600);
		background(0);
		
		list = new ArrayList<Particle>();
		
		for(int i = 0; i < amountOfParticles; i ++) {
			list.add(new Particle(this));
		}
	}

	
	public void draw() {
		background(100);
		
		updateBest();
		
		for(Particle p : list) {
			p.move();
			p.display();
		}
	}
	
	private void updateBest() {
		for(Particle p : list) {
			if(p.pbestval > gbestVal) {
				gbestx = p.pbestx;
				gbesty = p.pbesty;
				gbestVal = p.pbestval;
			}
		}
	}
	
	public float fitness(float x, float y) {
		//return (float) (-1 * Math.sqrt(Math.pow((x - bestx), 2) + Math.pow((y - besty), 2)));
		float akku1, akku2;
		
		if(bestx - x > 0) {
			akku1 = (bestx - x) * -1;
		} else {
			akku1 = (bestx - x);
		}
		
		if(besty - y > 0) {
			akku2 = (besty - y) * -1;
		} else {
			akku2 = (besty - y);
		}
		
		return akku1 - akku2;
	}

	public float gbestx() {
		return gbestx;
	}
	
	public float gbesty() {
		return gbesty;
	}

}
