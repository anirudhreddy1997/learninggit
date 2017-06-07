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
	private listnode head=null;
	public int length =0;
	public void insertAtBeg(int x){
		listnode temp =new listnode(x);
		if(head==null){
			head=temp;
		}else{
		temp.setnext(head);
		head=temp;
		
		}
		length++;
	}
	
	public void insert(int position,int data){
		listnode temp=head;
		listnode temp2=new listnode(data);
		if(position<1){
			position=1;
		}
		if(position>length){
			position=length;
		}
		if(position==1){
			temp2.setnext(head);
			head=temp2;
		}
		else{
			int i=1;
			while(i<position-1){
				temp=temp.getnext();
				i++;
			}
			temp2.setnext(temp.getnext());
			temp.setnext(temp2);
			
		}
		
		
	}
	
	
	
	
	public void printlist(){
		listnode temp=head;
		
		while(temp!=null){
			System.out.println(temp.getdata()+" ");
			temp=temp.getnext();
		}
	}
	public static void main(String[] args){
		linkedlist l=new linkedlist();
		l.insertAtBeg(1);
		l.insertAtBeg(2);
		l.insertAtBeg(3);
		l.insertAtBeg(4);
		l.insertAtBeg(5);
		l.insert(0, 9);
		l.printlist();
		l.insert(3, 8);
		l.printlist();
	}
}
	