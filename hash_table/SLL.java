package hash_table;

public class SLL {
    Node headPtr;
    int size;
    
    // default constructor
    public SLL() {
        //implement this method
    	
    	this.headPtr = null;
    	this.size = 0;
    }

    public Node getHeadPtr() {
        return headPtr;
    }
    
    // insert (item1, item2) at the SLL head
    public void insert(String item1, String item2) {
        //implement this method
    	
    	Node currNode = new Node();
    	currNode.SSN = item1;
    	currNode.name = item2;
    	currNode.next = headPtr;
    	headPtr = currNode;
    	size = size + 1;

    	
    }
    
    // if find the item1 key
    // then return the node
    // else return null
    public Node search(String item1) {
        //implement this method
    	
    	Node currNode = headPtr;
    	while (currNode != null) 
    	{
    		
    		if (currNode.SSN.compareTo(item1) == 0) {	
    			return currNode;
    		}
    		else 
    			currNode = currNode.next;
    	}
    	
        return null;
    }
    
    // if find the item1 key
    // then remove the node and return true
    // else return false
    public boolean remove(String item1) {
        //implement this method
    	
    	Node currNode = headPtr;
    	// to check if SLL is empty
    	if (currNode == null) {
   		 return false;
    	}
    	
    	else 
    	{
    	// to check if the item is at the head of SLL and remove the node if condition is true
    		if (headPtr.SSN.compareTo(item1) == 0) 
    			{
	    			headPtr = headPtr.next;
	    			currNode = null;
	    			size = size - 1;
	    			return true;
    			}
    		else 
    			{
    			// to check if the item comes after the head
			    while ((currNode.next != null) && ((currNode.next.SSN).compareTo(item1) != 0)) 
			    	{
			    		currNode = currNode.next;
			    		
			    		// to iterate through the SSL and return null if the item isn't found 
			    		if (currNode.next == null) 
			    			{
			    				return false;
			    			}
			    		else 
			    			{
				    			Node temp = currNode.next;
				    			currNode.next = temp.next;
				    			temp = null;
				    			size = size - 1;
				    			return true;
			    			}
			    	}
    			}
    	}
    	
    	return false;
    }
    
    public int getSize() {
        return size;
    }
    
    // display the SSN and name values of each node in the linked list
    public void display() {
        Node temp;
        temp = headPtr;
        while (temp != null) {
            System.out.println(temp.SSN + ":" + temp.name);
            temp = temp.next;
        }
    }

}
