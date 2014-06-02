package main;

import processing.core.PApplet;
import sun.nio.cs.Surrogate.Generator;
import java.util.Random;

public class Particle {

	main parent;
	
	float x;
	float y;
	
	float xSpeed;
	float ySpeed;
	
	float pbestx = 0;
	float pbesty = 0;
	float pbestval = Float.MIN_VALUE;
	
	float maxVelx = 2;
	float maxVely = 2;
	
	
	Random generator = new Random();
	
	public Particle(main parent) {
		this.parent = parent;
		
		x = generator.nextInt(parent.height);
		y = generator.nextInt(parent.width);
		
		xSpeed = generator.nextInt(2);
		ySpeed = generator.nextInt(2);
	}
	
	void display() {
		parent.fill(255, 100);
		parent.noStroke();
		parent.rect(x, y, 4, 4);
	}
	
	void move() {
		float f = parent.fitness(x,y);
		
		System.out.println(f);
		
		if(f > pbestval) {
			pbestx = x;
			pbesty = y;
			pbestval = f;
		}
		
		xSpeed = xSpeed + 
				2 * generator.nextFloat() * (pbestx - x) + 
				2 * generator.nextFloat() * (parent.gbestx() - x);
		ySpeed = ySpeed + 
				2 * generator.nextFloat() * (pbesty - y) + 
				2 * generator.nextFloat() * (parent.gbesty() - y);
		
		if(xSpeed > maxVelx) {
			xSpeed = maxVelx;
		}
		
		if(xSpeed < -maxVelx) {
			xSpeed = -maxVelx;
		}
		
		if(ySpeed > maxVely) {
			xSpeed = maxVely;
		}
		
		if(ySpeed < -maxVely) {
			ySpeed = -maxVely;
		}
		
		x += xSpeed;
		y += ySpeed;
	}
	
	
}
