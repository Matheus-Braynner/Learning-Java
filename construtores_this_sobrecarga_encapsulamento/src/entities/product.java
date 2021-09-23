package entities;

public class product {
	
	//Encapsulamento

		private String name;
		private double price;
		private int quantity;

		// CONSTRUTOR PADR�O
		
		public product() {
			
		}
		// ALTERA��O CONSTRUTORES
		public product(String name, double price, int quantity) {
			this.name = name;
			this.price = price;
			this.quantity = quantity;
		}
		
		//ALTERA��O SOBRECARGA

		public product(String name, double price) {
			this.name = name;
			this.price = price;
		}
		
		//M�TODO SET
		public void setName(String name) {
			this.name = name;
		}
		//M�TODO GET
		
		public String getName(String name) {
			return name;
		}
		
		public double getPrice() {
			return price;
		}
		
		public void setPrice(double price) {
			this.price = price;
		}
		
		public int getQuantity() {
			return quantity;
		}
		
		public double totalValueInStock() {
			return price * quantity;
		}

		public void addProducts(int quantity) {
			this.quantity += quantity;
		}

		public void removeProducts(int quantity) {
			this.quantity -= quantity;
		}

		public String toString() {
			return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
					+ String.format("%.2f", totalValueInStock());
		}
		
		
		
		
		
		
		
		
		
		/*public String name;
		public double price;
		public int quantity;

		// CONSTRUTOR PADR�O
		
		public product() {
			
		}
		// ALTERA��O CONSTRUTORES
		public product(String name, double price, int quantity) {
			this.name = name;
			this.price = price;
			this.quantity = quantity;
		}
		
		//ALTERA��O SOBRECARGA

		public product(String name, double price) {
			this.name = name;
			this.price = price;
		}
		public double totalValueInStock() {
			return price * quantity;
		}

		public void addProducts(int quantity) {
			this.quantity += quantity;
		}

		public void removeProducts(int quantity) {
			this.quantity -= quantity;
		}

		public String toString() {
			return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
					+ String.format("%.2f", totalValueInStock());
		}
		*/

}
