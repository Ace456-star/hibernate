package hibernate4;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Category {
	
	int id;
	String name;
	List <Product> productList;
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Category(String name, List<Product> productList) {
		
		this.name = name;
		this.productList = productList;
	}
	@Id
	@GeneratedValue
	@Column(name="cat_id")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="cat_id")
	public List<Product> getProductList() {
		return productList;
	}
	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}
	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", productList=" + productList + "]";
	}

}
