package assignment.week2;

enum OrderStatus{
	
	PLACED("Order has been placed"),
	SHIPPED("Order has been shipped"),
	DELIEVERED("Order has been delievered"),
	CANCELLED("Order has been cancelled");
	
	private String string;
	

	OrderStatus(String string) {
		// TODO Auto-generated constructor stub
		this.string=string;
	}
	
	public String getStatus()
	{
		return string;
	}
	
}

public class Problem7 {
	public static void main(String[] args) {
		OrderStatus status=OrderStatus.PLACED;
		
		System.out.println(status.getStatus());
	}

}
