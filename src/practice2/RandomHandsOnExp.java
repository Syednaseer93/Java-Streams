package practice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Product{
	int id;
	String name;
	double price;
	public Product(int id,String name,double price) {
		this.id=id;
		this.name=name;
		this.price=price;
	}
}
public class RandomHandsOnExp {

	public static void main(String[] args) {
		List<Product>productsNewList=new ArrayList<Product>();
		productsNewList.add(new Product(100,"Hp Laptop",25000));
		productsNewList.add(new Product(100,"Dell Laptop",45000));
		productsNewList.add(new Product(100,"Macbook",19000));
		productsNewList.add(new Product(100,"Asus",20000));

		productsNewList.stream().filter(product->product.price>25000)
						.forEach(finalProduct->System.out.println(finalProduct.price));
	}

}
	