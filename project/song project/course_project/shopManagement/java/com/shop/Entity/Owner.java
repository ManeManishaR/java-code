package com.shop.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

	@Getter
	@Setter
	@AllArgsConstructor
	@NoArgsConstructor
	@Entity
	@Table(name="owner")
	public class Owner {
		@Id
		@OneToMany
		@GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
		private String shop_name;
		@Column(length = 50)
		private String stock;
		@Column(length=10)
		private int price;
		@Column(length = 30)
		private String city;
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getStock() {
			return stock;
		}
		public void setStock(String stock) {
			this.stock = stock;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		
		public String getShop_name() {
			return shop_name;
		}
		public void setShop_name(String shop_name) {
			this.shop_name = shop_name;
		}
	}

