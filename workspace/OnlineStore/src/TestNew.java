
abstract class Fruit {
    public function getColor() {
        return “green”;
    }
 
    abstract public function getTaste();
}
 
class Apple extends Fruit {
     public function getColor() {
          return “red”;
     }
 
     public function getTaste() {
          return “sweet”;
     }
}

public class TestNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
