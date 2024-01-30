import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{

    int id;
    String name;
    double price;

    public Product(int id, String name, double price){
        this.id = id;
        this.name=name;
        this.price = price;
    }
    public String toString(){
        return "Price id "+id+" name "+name+" price "+price;
    }
}

public class ObjectFilterDemo {
        public static void main(String[] args) {

        List<Product> p=new ArrayList<Product>();

        p.add(new Product(1, "HP", 60000));
        p.add(new Product(2, "Dell", 65000));

        p.add(new Product(3, "Lenovo", 62000));
        p.add(new Product(4, "Asus", 60000));

        p.add(new Product(5, "Victua", 65000));
        p.add(new Product(6, "Mac", 70000));

        p.stream()
                .filter(t->t.price>60000)
                .forEach(e->System.out.println(e));

        p.stream()
                .filter(t->t.price>60000)
                .map(e->e.price+5000)
                .collect(Collectors.toList())
                .forEach(e->System.out.println(e));
    }
}
