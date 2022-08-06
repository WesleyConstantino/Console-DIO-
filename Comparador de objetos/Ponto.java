import java.util.Objects;

public class Ponto {

	private int x,y;
	public int p1, p2;
	 
	public Ponto(int x, int y) {
		this.x=x;
		this.y=y;
	}
	@Override
	public String toString(){
	  return "Ponto{" + " x " + x + ", y " + y +'}';
	}
	
	  @Override 
	  public boolean equals(Object o) 
	  { if (this ==o) return true;
	  Class<? extends Object> getClass = null;
	  if(o == null || getClass != o.getClass())
	  return false; 
	  Ponto ponto = (Ponto) o; 
	  return x == ponto.x & y == ponto.y; 
	  }	 
	  
	     public double distancia(Ponto p){
	         p1 = this.x - p.x;
	         p2 = this.y - p.y;
	         return Math.sqrt(p1*p1 + p2*p2);
	    }
}
