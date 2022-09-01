// creating ArrayList of electronics

package com.Stream;

import java.util.ArrayList;

public class electronicShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		electronics e1=new electronics(201,"Television","Sony",50500,"Bravia 32W830K");
		electronics e2=new electronics(202,"Clock","Titan",5600,"Rosegold");
		electronics e3=new electronics(203,"Laptop","Lenovo",45000,"ideapad S340");
		electronics e4=new electronics(204,"Washing machine","LG",65800,"T65SKSF4Z");
		electronics e5=new electronics(205,"Refrigirator","Whirlpool",32000,"Sapphire Mulia");
		electronics e6=new electronics(206,"Mobile","Moto",9500,"gpower-10");
		ArrayList<electronics> al=new ArrayList<electronics>();
		al.add(e6);al.add(e5);al.add(e4);al.add(e3);al.add(e2);al.add(e1);
		
		al.stream().filter(ele->ele.ePrice>=30000)
		.forEach(ele->{System.out.println(ele.eName+" "+ele.eCompany+" "+ele.eModel+" Rs : "+ele.ePrice);});
	}

}
