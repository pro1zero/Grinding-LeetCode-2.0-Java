
public class convertBinaryFromLLToDecimal {
	
	public class ListNode {
		 int val;
		 ListNode next;
		 ListNode() {}
		 ListNode(int val) { this.val = val; }
		 ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
	
	public static void main(String[] args) {
		String s = "101";
		int result = Integer.valueOf(s, 2);
		System.out.println(result);
	}

}
