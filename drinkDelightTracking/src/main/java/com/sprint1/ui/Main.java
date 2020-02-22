package com.sprint1.ui;
import java.util.Scanner;
import com.sprint1.service.RawMaterialServiceImpl;
public class Main {
 static Scanner in=new Scanner(System.in);
public static void main(String[] args) {
RawMaterialServiceImpl rawMaterialdetailsImplObj = new RawMaterialServiceImpl();//3
System.out.println("Enter  Id");//1
String id=in.nextLine();
//System.out.println("Enter Delivery Status");//2
//String deliveryStatus=in.nextLine();
rawMaterialdetailsImplObj.displayOrder(id);//20
}
}
