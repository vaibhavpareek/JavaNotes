import java.util.*;
class LinkList
{
	public static void main(String []vp)
	{
		LinkedList<Integer> ll = new LinkedList<>();
		ll.addFirst(null);
		System.out.println(ll.pollFirst());
		System.out.println(ll.removeFirst());
		
	}

}