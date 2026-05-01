package test3;

// 장바구니 아이템 클래스
class Item {
    private String name;
    private int price;

    // 코드 작성하기
    public Item(String name, int price) {
    	this.name = name;
    	this.price = price;
    }
    
    public String getName() {
		return name;
	}
    public int getPrice() {
		return price;
	}
    
}

// 장바구니 클래스
class Cart {    
    private Item[] items;
    private int count;
    private final int MAX_ITEM_SIZE = 5; // 장바구니 최대 상품 갯수 5개로 고정

    public Cart() {        
        this.items = new Item[MAX_ITEM_SIZE];
        this.count = 0;
    }

    public void addItem(Item item) {
    	
    	if (count < MAX_ITEM_SIZE) {
            items[count++] = item;
            System.out.println(item.getName() + "이(가) 장바구니에 담겼습니다.");            
        } else {
            System.out.println("장바구니가 가득 찼습니다.");
        }
    }

    public void addItem(Item[] newItems) {
        for (Item i : newItems) {
            addItem(i);
        }
    }

    public void showItemAll() {
    	
        int total = 0;        
        for (int i = 0; i < count ; i++) {            
            System.out.printf("[%d번 %s: %d원]\n", i+1, items[i].getName(), items[i].getPrice());
            total += items[i].getPrice();
        }
        
        System.out.println("[현재 담긴 상품 수: " + count + "개]");
        System.out.println("[총 합계 금액: " + total + "원]");        
    }
}

public class Test10 {
    public static void main(String[] args) {
        Cart myCart = new Cart();

        myCart.addItem(new Item("블루투스", 45000));

        Item[] itemList = {
            new Item("키보드", 32000),
            new Item("마우스", 15000),
            new Item("이어폰", 25000)
        };       
        myCart.addItem(itemList);

        myCart.showItemAll();
    }
}