class listnode{
	private int data;
	private listnode next=null;
	public listnode(int data){
		this.data=data;
		
	}
	public void setdata(int data){
		this.data=data;
		
	}
	public int getdata(){
		return this.data;
	}
	public void setnext(listnode next){
		this.next=next;
	}
	public listnode getnext(){
		return this.next;
	}
}

public class linkedlist {
	static listnode head=null;
	
	private static int length;
	
	public linkedlist(){
		linkedlist.length=0;
	}
	//beginning insertion
	public static void insertatbeg(listnode node){
		node.setnext(head);
		head=node;
		linkedlist.length++;
	}
	//insertion at end
	public static void insertatend(listnode node){
		if(head==null){
			head=node;
		}
		else{
			listnode p,q;
			for(p=head;(q=p.getnext())!=null;p=q);
			p.setnext(node);
		}
		length++;
	}
	//insertion at random position
	public static void insert(listnode node,int position){
		if(position<0){
			position=0;
		}
		if(position>length){
			position=length;
		}
		if(head==null){
			head=node;
		}
		else if(position==0){
			node.setnext(head);
			head=node;
			
		}
		else{
			listnode temp=head;
			for(int i=1;i<position;i++){
				temp=temp.getnext();
			}
			node.setnext(temp.getnext());
			temp.setnext(node);
			
		}
		
		linkedlist.length++;
	}
	//remove head node
	public static listnode removefrombeg(){
		listnode node =head;
		if(node!=null){
		head=head.getnext();
		node.setnext(null);
		}
		length--;
		return node;
	}

	//remove last node
	public static listnode removefromlast(){
		listnode node=head;
		if(head==null)
			return null;
		if(head.getnext()==null)
			return head;
		for(;(node.getnext()).getnext()!=null;){
			node=node.getnext();
		}
		listnode node1=node.getnext();
		node.setnext(null);
		length--;
		return node1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		listnode node1=new listnode(5);
		listnode node2=new listnode(4);
		listnode node3=new listnode(3);
		listnode node4=new listnode(2);
		listnode node5=new listnode(1);
		listnode node6=new listnode(7);
		listnode node7=new listnode(8);
		listnode node8=new listnode(6);
		insertatbeg(node1);
		insertatbeg(node2);
		insertatbeg(node3);
		insertatbeg(node4);
		insertatend(node5);
		insertatend(node6);
		insert(node7,3);
		insert(node8,1);
		removefrombeg();
		removefromlast();
		listnode node=head;
		for(;node!=null;){
			
			System.out.println(node.getdata());
			node=node.getnext();
		}
	}

}
