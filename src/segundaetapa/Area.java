package segundaetapa;

/*
 * 6) Crie uma classe que modele um retângulo: Atributos: LadoA, LadoB
 * (ou Comprimento e Largura, ou Base e Altura, a escolher) Métodos: Mudar valor dos lados,
 * Retornar valor dos lados, calcular Área e calcular Perímetro; Crie um programa que utilize esta classe.
 * Ele deve pedir ao usuário que informe as medidas de um local. Depois, deve criar um objeto com as medidas
 * e calcular a quantidade de pisos e de rodapés necessárias para o local. 
 * 
 * Classe Area.
 */

public class Area {
		double base, altura;
		
		public Area(double base, double altura) {
			this.base = base;
			this.altura = altura;
		}
		public void setAltValores(double base, double altura) {
			this.base = base;
			this.altura = altura;
		}
		public double[] getValores() {
			return new double[] {base, altura};
		}
		public double getArea() {
			double area;
			area = base * altura;
			return area;
		}
		public double getPerimetro() {
			double perimetro;
			perimetro = ((base*2)+(altura*2));
			return perimetro;
		}
}
