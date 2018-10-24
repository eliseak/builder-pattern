package br.com.eliseak.model;

public class Sorvete {
	private String sabor;
	private String cobertura;
	
	// Getter e Setter
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	public String getCobertura() {
		return cobertura;
	}
	public void setCobertura(String cobertura) {
		this.cobertura = cobertura;
	}
	
	// ToString
	@Override
	public String toString() {
		return "Sorvete [sabor=" + sabor + ", cobertura=" + cobertura + "]";
	}

	// Builder
	public static class Builder {
		private Sorvete s;
		
		public Builder(){
			s = new Sorvete();
		}
		
		public Builder sabor(String sabor) {
			s.setSabor(sabor);
			return this;
		}
		
		public Builder cobertura(String cobertura) {
			s.setCobertura(cobertura);
			return this;
		}
		
		public Sorvete build() {
			return s;
		}
	}
	
}
